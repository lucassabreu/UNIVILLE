using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class MoveLeft : DefaultCommand
    {
        public MoveLeft(string c) : base(c) { }

        override public string Execute(Simulator sim)
        {
            sim.MoveLeft();
            return base.Execute(sim);
        }
    }
}
