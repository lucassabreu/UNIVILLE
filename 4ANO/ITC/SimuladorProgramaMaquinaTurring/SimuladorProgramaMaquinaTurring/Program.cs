using SimuladorProgramaMaquinaTurring.TuringMachine;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimuladorProgramaMaquinaTurring
{
    class Program
    {


        static void Main(string[] args)
        {
            /*args = new string[]{
                @"resources/programa.txt",
                "1100011000111"
            };*/

            if (args.Count() < 1)
            {
                Console.WriteLine("Eh preciso informar um <arquivo com o programa> e a <fita de entrada>");
                Console.ReadKey();
                return;
            }

            TuringMachineSimulator tms = new TuringMachineSimulator();

            TuringMachine.Program tmp = new TuringMachine.Program();

            StreamReader sr = new StreamReader(args[0]);
            String[] line;
            
            while (sr.Peek() >= 0)
            {
                line = sr.ReadLine().Split(' ');
                tmp.AddCommandToLabel(line[0],
                    new Command(
                        line[1] == "_" ? Command.EMPTY : (line[1] == "*" ? Command.WILDCARD : line[1][0]),
                        line[2] == "_" ? Command.EMPTY : (line[2] == "*" ? Command.WILDCARD : line[2][0]),
                        line[3] == "l" ? Command.LEFT : (line[3] == "r" ? Command.RIGHT : Command.STAY), 
                        line[4]));
            }

            /*tmp.AddCommandToLabel("0", new Command('0', Command.EMPTY, Command.RIGHT, "1o"));
            tmp.AddCommandToLabel("0", new Command('1', Command.EMPTY, Command.RIGHT, "1i"));
            tmp.AddCommandToLabel("0", new Command(Command.EMPTY, Command.EMPTY, Command.STAY, "ACE"));

            tmp.AddCommandToLabel("1o", new Command(Command.EMPTY, Command.EMPTY, Command.LEFT, "2o"));
            tmp.AddCommandToLabel("1o", new Command(Command.WILDCARD, Command.WILDCARD, Command.RIGHT, "1o"));

            tmp.AddCommandToLabel("1i", new Command(Command.EMPTY, Command.EMPTY, Command.LEFT, "2i"));
            tmp.AddCommandToLabel("1i", new Command(Command.WILDCARD, Command.WILDCARD, Command.RIGHT, "1i"));

            tmp.AddCommandToLabel("2o", new Command('0', Command.EMPTY, Command.LEFT, "3"));
            tmp.AddCommandToLabel("2o", new Command(Command.EMPTY, Command.EMPTY, Command.STAY, "ACE"));
            tmp.AddCommandToLabel("2o", new Command(Command.WILDCARD, Command.WILDCARD, Command.STAY, "REJ"));

            tmp.AddCommandToLabel("2i", new Command('1', Command.EMPTY, Command.LEFT, "3"));
            tmp.AddCommandToLabel("2i", new Command(Command.EMPTY, Command.EMPTY, Command.STAY, "ACE"));
            tmp.AddCommandToLabel("2i", new Command(Command.WILDCARD, Command.WILDCARD, Command.STAY, "REJ"));

            tmp.AddCommandToLabel("3", new Command(Command.EMPTY, Command.EMPTY, Command.STAY, "ACE"));
            tmp.AddCommandToLabel("3", new Command(Command.WILDCARD, Command.WILDCARD, Command.LEFT, "4"));
            tmp.AddCommandToLabel("4", new Command(Command.WILDCARD, Command.WILDCARD, Command.LEFT, "4"));
            tmp.AddCommandToLabel("4", new Command(Command.EMPTY, Command.EMPTY, Command.RIGHT, "0"));

            tmp.AddCommandToLabel("ACE", new Command(Command.EMPTY, ':', Command.RIGHT, "AC2"));
            tmp.AddCommandToLabel("AC2", new Command(Command.EMPTY, ')', Command.STAY, "ACCEPT"));
            
            tmp.AddCommandToLabel("REJ", new Command(Command.EMPTY, ':', Command.RIGHT, "RE2"));
            tmp.AddCommandToLabel("REJ", new Command(Command.WILDCARD, Command.EMPTY, Command.LEFT, "REJ"));
            tmp.AddCommandToLabel("RE2", new Command(Command.EMPTY, '(', Command.STAY, "REJECT"));

            tmp.FirstLabel = "0";*/

            /*foreach (string key in tmp.LabelList)
            {
                foreach (Command c in tmp.GetLabel(key))
                {
                    Console.WriteLine("{0} {1} {2} {3} {4}", key,
                            (c.EqualsTo == '\0' ? '_' : (c.EqualsTo == null ? '*' : c.EqualsTo)),
                            (c.WriteSymbol == '\0' ? '_' : (c.WriteSymbol == null ? '*' : c.WriteSymbol)),
                            (c.MoveTo == -1 ? 'l' : (c.MoveTo == 1 ? 'r' : '*')),
                            c.GoToLabel);
                }
            }*/

            tms.RunProgram(tmp, args.Count() > 1 ? args[1] : "");

            Console.WriteLine();
            Console.WriteLine("Precione uma tecla para sair...");
            Console.ReadKey();
            Console.WriteLine();
        }

        static void OneMain(string[] args)
        {

            string entrada;

            Console.Write("Entre com os valores da fita: ");
            entrada = Console.ReadLine().Trim();

            char[] fita = RetornaFita(entrada);

            int i = 0;

            while (fita[i] != ' ' && fita[i] != ':')
            {
                if (fita[i] == fita[fita.Length - i - 1])
                {
                    fita[i] = fita[fita.Length - i - 1] = ' ';
                }
                else
                {
                    for (int j = i; j < (fita.Length - i); j++)
                    {
                        fita[j] = ' ';
                    }

                    fita[i] = ':';
                    fita[i + 1] = '(';
                    break;
                }

                Console.WriteLine(fita);
                i++;
            }
            
            if (fita[i] == ' ')
            {
                fita[--i] = ':';
                fita[i + 1] = ')';
            }

            Console.WriteLine(fita);

            Console.ReadKey();
        }

        static char[] RetornaFita(string entrada)
        {
            char[] fita = new char[entrada.Length];

            int i = 0;
            foreach (char e in entrada)
            {
                if (e == '1')
                    fita[i++] = '1';
                else
                    fita[i++] = '0';
            }

            return fita;
        }
    }
}
