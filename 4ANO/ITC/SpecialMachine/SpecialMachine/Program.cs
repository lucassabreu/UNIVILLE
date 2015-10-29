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

            Algorithm algorithm = new Algorithm();

            algorithm.Add("a", new MoveLeft("0"));
            algorithm.Add("0", new Check("1"));
            algorithm.Add("1", new MoveRight("2"));
            algorithm.Add("2", new If("3", "0"));
            algorithm.Add("3", new Accept());

            Simulator.Instance.Run(algorithm, "     V   ");

            Console.WriteLine();
            Console.WriteLine("Status: ", Simulator.Instance.State);
            Console.ReadKey();
        }
    }
}
