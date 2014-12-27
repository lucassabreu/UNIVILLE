using System.Diagnostics; // não considerar esse importe
using System;
namespace Lacos_Encadeados__C_Sharp_ {
    class Program {
        static void Main(string[] args) {
            // não considerar essa parte como lógica  do programa
            Stopwatch sw = new Stopwatch();
            sw.Start();
            // fim parte descartável
            int indice = int.Parse(args[0]);
            int soma = 0;
            int[] i = new int[6];
            for (i[0] = 0; i[0] < indice; i[0]++) 
                for (i[1] = 0; i[1] < indice; i[1]++) 
                    for (i[2] = 0; i[2] < indice; i[2]++) 
                        for (i[3] = 0; i[3] < indice; i[3]++) 
                            for (i[4] = 0; i[4] < indice; i[4]++) 
                                for (i[5] = 0; i[5] < indice; i[5]++) 
                                    soma++;
            Console.WriteLine("Resultado: " + soma);
            // não considerar essa parte como lógica  do programa
            Console.WriteLine("Tempo Execução: " + sw.Elapsed);
            // fim parte descartável
        }
    }
}
