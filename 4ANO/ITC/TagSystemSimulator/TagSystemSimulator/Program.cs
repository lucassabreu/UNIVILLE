using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TagSystemSimulator.Command;

namespace TagSystemSimulator
{
    class Program
    {
        static void Main(string[] args)
        {
           /* args = new string[] {
                @"samples\existe.txt",
                "#LUCAS@SACUL"
            };*/

            foreach (string v in args)
            {
                Console.WriteLine(v);
            }

            Algorithm alg = Algorithm.CreateFromFile(args[0]);
            Simulator sim = new Simulator();
            sim.Run(alg, args.Count() > 1 ? args[1] : "");

            Console.WriteLine();
            Console.WriteLine("Final State: {0}", sim.State.ToString());
            Console.ReadKey();
            Console.WriteLine();
        }
    }
}
