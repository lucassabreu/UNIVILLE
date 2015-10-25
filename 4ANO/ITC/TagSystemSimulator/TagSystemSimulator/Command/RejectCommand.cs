using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TagSystemSimulator.Command
{
    class RejectCommand : ICommand
    {
        private static RejectCommand _instance = new RejectCommand();

        public static RejectCommand Instance
        {
            get { return _instance; }
        }

        private RejectCommand() { }

        public string Execute(Simulator sim)
        {
            sim.Reject();
            return null;
        }

        public override string ToString()
        {
            return "reject();";
        }
    }
}
