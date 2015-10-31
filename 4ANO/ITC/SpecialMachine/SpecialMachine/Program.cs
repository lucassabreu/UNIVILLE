using SpecialMachine.Commands;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine
{
    class Program
    {
        static void Main(string[] args)
        {
            /*args = new string[]
            {
                "samples/limpa_fita.txt",
                "        "
            };*/

            Algorithm algorithm = Algorithm.CreateFromFile(args[0]);
            Simulator.Instance.Run(algorithm, args[1]);

            Console.WriteLine();
            Console.WriteLine("Status: ", Simulator.Instance.State);
            Console.ReadKey();
        }
    }
}
