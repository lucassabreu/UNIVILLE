using SpecialMachine.Commands;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine
{
    public class Simulator
    {
        public enum States { NOT_STARTED, RUNNING, ACCEPTED, REJECTED, ERROR }

        private static Simulator instance = new Simulator();

        private States _state = States.NOT_STARTED; // estado inicial

        private bool[] _tape;
        private int _realPosition = 0;

        public States State { get { return this._state; } }

        public bool IsAccepted { get { return this._state == States.ACCEPTED; } }
        public bool IsRejected { get { return this._state == States.REJECTED; } }
        public bool IsRunning { get { return this._state == States.RUNNING; } }
        public bool IsNotStarted { get { return this._state == States.NOT_STARTED; } }
        public bool HadError { get { return this._state == States.ERROR; } }

        public static Simulator Instance { get { return instance; } }

        public void Run(Algorithm algorithm, string initialTape)
        {

            bool[] tape = new bool[initialTape.Count()];

            for (int i = 0; i < initialTape.Count(); i++)
            {
                if (initialTape[i] == ' ' || initialTape[i] == '0')
                    tape[i] = false;
                else
                    tape[i] = true;
            }

            Run(algorithm, tape);
        }

        public void Run(Algorithm algorithm, int tapeLength)
        {
            this.Run(algorithm, new bool[tapeLength]);
        }

        public void Run(Algorithm algorithm, bool[] tape)
        {
            this._realPosition = -1;
            this._tape = tape;

            string commandName = algorithm.FirstCommandName;
            string lastCommand = algorithm.FirstCommandName;
            ICommand command = algorithm.Get(commandName);

            this._state = States.RUNNING;
            Print("start", "start");
            try
            {
                while (this.IsRunning)
                {
                    lastCommand = commandName;
                    command = algorithm.Get(commandName);
                    commandName = command.Execute(this);
                    Print(lastCommand, command);
                }
            } catch(Exception){
                Print(lastCommand, command);
                Print("error", "ERROR!");
            }
        }

        private void Print(string name, string command)
        {
            string tape = "";

            foreach (bool s in this._tape)
                tape += (s ? '1' : '0');

            Console.WriteLine("{0,-5}: {1,-25} -> {2}", name, command, tape);
        }

        private void Print(string name, ICommand command)
        {
            Print(name, command.ToString());
        }

        protected bool ValidPosition()
        {
            return this._realPosition >= -1 && this._realPosition < (_tape.Length - 1);
        }

        public void Check()
        {
            if (!ValidPosition())
            {
                Error();
            }
            else
            {
                if (!this._tape[this._realPosition + 1])
                    this._tape[this._realPosition + 1] = true;
                else
                {
                    Error();
                }
            }
        }

        public void Uncheck()
        {
            if (!ValidPosition())
            {
                Error();
            }
            else
            {
                if (this._tape[this._realPosition + 1])
                    this._tape[this._realPosition + 1] = false;
                else
                {
                    Error();
                }
            }
        }

        public bool IsChecked()
        {
            if (!ValidPosition())
            {
                Error();
                return false; // needed to compile
            }
            else
            {
                return this._tape[this._realPosition + 1];
            }
        }

        public void MoveRight()
        {
            this._realPosition++;
        }

        public void MoveLeft()
        {
            this._realPosition--;
        }

        public void Error()
        {
            this._state = States.ERROR;
            throw new Exception("ERROR");
        }
        
        public void Reject()
        {
            this._state = States.REJECTED;
        }
     
        public void Accept()
        {
            this._state = States.ACCEPTED;
        }
    }
}
