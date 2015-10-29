using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine.Commands
{
    class Uncheck : DefaultCommand
    {

        public Uncheck(string c) : base(c) { }

        override public string Execute(Simulator sim)
        {
            sim.Uncheck();
            return base.Execute(sim);
        }
    }
}
