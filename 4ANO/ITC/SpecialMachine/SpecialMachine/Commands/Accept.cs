using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class Accept : ICommand
    {

        public string Execute(Simulator sim)
        {
            sim.Accept();
            return null;
        }

        public override string ToString()
        {
            return "accept;";
        }
    }
}
