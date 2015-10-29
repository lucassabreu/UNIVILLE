using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class Reject : ICommand
    {

        public string Execute(Simulator sim)
        {
            sim.Reject();
            return null;
        }

        public override string ToString()
        {
            return "reject;";
        }
    }
}
