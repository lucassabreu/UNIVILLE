using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TagSystemSimulator.Command
{
    class WriteCommand : ICommand
    {
        private string _nextCommandName;
        private char _symbolToWrite;

        public WriteCommand(char symbolToWrite, string nextCommandName)
        {
            this._symbolToWrite = symbolToWrite;
            this._nextCommandName = nextCommandName;
        }

        public string Execute(Simulator sim)
        {
            if (this._symbolToWrite == Algorithm.WILDCARD)
            {
                sim.Write(sim.LastSymbolReaded);
            }
            else
            {
                sim.Write(this._symbolToWrite);
            }

            return this._nextCommandName;
        }

        public override string ToString()
        {
            return String.Format("write({0}) goto {1};", this._symbolToWrite, this._nextCommandName);
        }
    }
}
