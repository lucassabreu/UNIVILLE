using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SpecialMachine.Commands
{
    public interface ICommand
    {
        string Execute(Simulator sim);
    }
}
