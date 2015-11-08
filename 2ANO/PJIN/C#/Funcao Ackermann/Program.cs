using System.Diagnostics; // não considerar esse importe
using System;
namespace Funcao_Ackermann {
    class Program {
        static void Main(string[] args) {
            // não considerar essa parte como lógica  do programa
            Stopwatch sw = new Stopwatch();
            sw.Start();
            // fim parte descartável
            int ack = Ack(int.Parse(args[0]), int.Parse(args[1]));
            Console.WriteLine("Resultado: " + ack);
            // não considerar essa parte como lógica  do programa
            Console.WriteLine("Tempo Execução: " + sw.Elapsed);
            // fim parte descartável
        }
        static int Ack(int m, int n) {
            if (m == 0)
                return n + 1;
            else
                if (m > 0 && n == 0)
                    return Ack(m - 1, 1);
                else
                    if (m > 0 && n > 0)
                        return Ack(m - 1, Ack(m, n - 1)); 
            return 0;
        }
    }
}
