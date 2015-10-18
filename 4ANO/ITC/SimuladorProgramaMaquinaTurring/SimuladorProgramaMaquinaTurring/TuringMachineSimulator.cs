using SimuladorProgramaMaquinaTurring.TuringMachine;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimuladorProgramaMaquinaTurring
{
    class TuringMachineSimulator
    {
        private string _tape;
        private MachineState _state = MachineState.CREATED;
        private int position = 0;

        public MachineState State
        {
            get { return this._state; }
        }

        public string Tape
        {
            get { return this._tape; }
        }

        public bool RunProgram(TuringMachine.Program tmp, string initialTape)
        {
            this._tape = initialTape;

            List<Command> label = null;
            string labelName = tmp.FirstLabel;

            this._state = MachineState.RUNNING; // start the machine

            while (this.State == MachineState.RUNNING)
            {
                label = tmp.GetLabel(labelName);
                foreach (Command c in label)
                {
                    if ((c.EqualsTo == Command.WILDCARD && GetSymbol() != Command.EMPTY) || c.EqualsTo.Equals(this.GetSymbol()))
                    {
                        Console.Write("{0}\t{1}\t{2}\t{3}\t", labelName, 
                            (c.EqualsTo == '\0' ? '_' : (c.EqualsTo == null ? '*' : c.EqualsTo)), 
                            (c.WriteSymbol == '\0' ? '_' : (c.WriteSymbol == null ? '*' : c.WriteSymbol)), 
                            c.GoToLabel);
                        this.Write(c.WriteSymbol);
                        this.position += c.MoveTo;
                        labelName = c.GoToLabel;

                        if (labelName == Command.ACCEPT)
                            this._state = MachineState.ACCEPTED;

                        if (labelName == Command.REJECT)
                            this._state = MachineState.REJECTED;

                        break; // break foreach
                    }
                }

                Console.WriteLine(this.Tape);
            }

            return true;
        }

        internal char GetSymbol()
        {
            if (position >= 0 && position < this.Tape.Length)
            {
                return this.Tape[position];
            }

            return '\0';
        }

        internal void Write (Nullable<char> symbol) {

            if (symbol == Command.WILDCARD)
                return;

            if (symbol == Command.EMPTY)
            {
                if (this.position >= 0 && this.position < this._tape.Length)
                {
                    if (this.position == 0)
                    {
                        this._tape = this._tape.Substring(1);
                        return;
                    }

                    if (this.position == (this._tape.Length - 1))
                    {
                        this._tape = this._tape.Substring(0, position);
                        return;
                    }
                }
                else
                {
                    return;
                }
            }
            
            if (this.position < 0)
            {
                for (; this.position < -1; this.position++)
                    this._tape = " " + this._tape;

                this._tape = symbol + this._tape;
                this.position++;
            }
            else
            {
                if (this.position >= this._tape.Length)
                {
                    while (this._tape.Length < this.position)
                        this._tape = this._tape + " ";

                    this._tape = this._tape + symbol;
                    this.position = 0;
                }
                else
                {
                    if (this.position == 0)
                    {
                        if (this._tape.Length > 0)
                            this._tape = symbol + this._tape.Substring(1);
                        else
                            this._tape = symbol.ToString();
                    }
                    else
                    {
                        if (this.position == (this._tape.Length - 1))
                            this._tape = this._tape.Substring(0, position -1) + symbol;
                        else
                            this._tape = this._tape.Substring(0, position - 1) + symbol + this._tape.Substring(position + 1);
                    }
                }
            }
        }

        public enum MachineState {
            RUNNING, REJECTED, ACCEPTED, CREATED
        }
    }
}
