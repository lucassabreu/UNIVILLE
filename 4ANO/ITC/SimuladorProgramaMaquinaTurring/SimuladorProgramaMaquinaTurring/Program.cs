using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimuladorProgramaMaquinaTurring
{
    class Program
    {
        static void Main(string[] args)
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
