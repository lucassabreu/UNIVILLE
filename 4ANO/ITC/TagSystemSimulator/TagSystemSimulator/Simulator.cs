using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TagSystemSimulator.Command;

namespace TagSystemSimulator
{
    class Simulator
    {
        private string _quee = "";
        private char _lastSymbolReaded = '\0';
        private MachineState _state = MachineState.NOT_STARTED;

        public void Run(Algorithm alg, string initialQuee)
        {
            this._quee = initialQuee;

            if (this._quee == null)
                this._quee = "";

            this._state = MachineState.RUNNING;
            string commandName = alg.FirstCommand;
            string previousCommandName = "";
            ICommand command = null;

            Console.WriteLine("{2,6}: {0,27} {1}", "start();", this._quee, previousCommandName);
            previousCommandName = commandName;
            while (this.State == MachineState.RUNNING) // running
            {
                command = alg.Get(commandName);
                commandName = command.Execute(this);
                Console.WriteLine("{2,6}: {0,27} {1}", command.ToString(), this._quee, previousCommandName);
                previousCommandName = commandName;
            }
        }

        public MachineState State
        {
            get { return this._state; }
        }

        public char LastSymbolReaded
        {
            get { return this._lastSymbolReaded; }
        }

        public char Read()
        {
            char symbol = '\0';

            if (this._quee.Count() > 0)
            {
                symbol = this._quee[0];
                this._quee = this._quee.Substring(1);
            }

            this._lastSymbolReaded = symbol;
            return symbol;
        }

        public void Write(char symbol)
        {
            this._quee += symbol;
        }

        public void Accept()
        {
            this._state = MachineState.ACCEPTED;
        }

        public void Reject()
        {
            this._state = MachineState.REJECTED;
        }

        public enum MachineState
        {
            NOT_STARTED, RUNNING, ACCEPTED, REJECTED
        }

    }
}
