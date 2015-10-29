using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine
{
    class Simulator
    {
        enum States { NOT_STARTED, RUNNING, ACCEPTED, REJECTED, ERROR }

        private States state = States.NOT_STARTED; // estado inicial

        private bool[] _tape;
        private int _realPosition = 0;

        public bool Accepted { get { return this.state == States.ACCEPTED; } }
        public bool Rejected { get { return this.state == States.REJECTED; } }
        public bool Running { get { return this.state == States.RUNNING; } }
        public bool NotStarted { get { return this.state == States.NOT_STARTED; } }
        public bool HadError { get { return this.state == States.ERROR; } }

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

            // todo end it
        }

        protected bool ValidPosition()
        {
            return this._realPosition >= -1 || this._realPosition < (_tape.Length - 1);
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
            this.state = States.ERROR;
            throw new Exception("ERROR");
        }
        
        public void Reject()
        {
            this.state = States.REJECTED;
        }
     
        public void Accept()
        {
            this.state = States.ACCEPTED;
        }
    }
}
