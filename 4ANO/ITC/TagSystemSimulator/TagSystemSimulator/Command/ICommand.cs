using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TagSystemSimulator.Command
{
    interface ICommand
    {
        string Execute(Simulator sim);
    }
}
