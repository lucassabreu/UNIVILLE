using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class MoveRight : DefaultCommand
    {
        override public string Execute(Simulator sim)
        {
            sim.MoveRight();
            return base.Execute(sim);
        }
    }
}
