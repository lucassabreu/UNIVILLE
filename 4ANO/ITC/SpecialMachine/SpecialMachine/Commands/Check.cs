using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class Check : DefaultCommand
    {
        override public string Execute(Simulator sim)
        {
            sim.Check();
            return base.Execute(sim);
        }
    }
}
