using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    abstract class DefaultCommand : ICommand
    {
        protected string _nextCommand;

        public DefaultCommand(string nextCommand){
            this._nextCommand = nextCommand;
        }

        public string Execute(Simulator sim)
        {
            return this._nextCommand;
        }
    }
}
