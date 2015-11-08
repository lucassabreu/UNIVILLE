using System.Diagnostics; // não considerar esse importe
using System;
namespace Hello_World__C_Sharp_ {
    class Program {
        static void Main(string[] args) {
            // não considerar essa parte como lógica  do programa
            Stopwatch sw = new Stopwatch();
            sw.Start();
            // fim parte descartável
            Console.WriteLine("Hello World");
            // não considerar essa parte como lógica  do programa
            Console.WriteLine("Tempo Execução: " + sw.Elapsed);
            // fim parte descartável
        }
    }
}
