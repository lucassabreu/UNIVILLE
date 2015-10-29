using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class If : ICommand
    {

        private string _commandTrue;
        private string _commandFalse;

        public If(string commandIfTrue, string commandIfFalse)
        {
            this._commandFalse = commandIfFalse;
            this._commandTrue = commandIfTrue;
        }

        public string Execute(Simulator sim)
        {
            return sim.IsChecked() ? this._commandTrue : this._commandFalse;
        }
    }
}
