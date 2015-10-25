using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TagSystemSimulator.Command
{
    class AcceptCommand : ICommand
    {
        
        private static AcceptCommand _instance = new AcceptCommand();

        public static AcceptCommand Instance
        {
            get { return _instance; }
        }

        private AcceptCommand() { }

        public string Execute(Simulator sim)
        {
            sim.Accept();
            return null;
        }

        public override string ToString()
        {
            return "accept();";
        }
    }
}
