using System;
using System.Diagnostics; // não considerar esse importe
using System.IO;
using System.Text.RegularExpressions;
namespace Contador_Frequencia_Palavras__C_Sharp_ {
    class Program {
        static void Main(string[] args) {
            // não considerar essa parte como lógica  do programa
            Stopwatch sw = new Stopwatch();
            sw.Start();
            // fim parte descartável
            string texto = (new StreamReader(@args[0])).ReadToEnd().ToLower(); // le todo o arquivo e coloca em minusculo.
            string palavra = "";
            int contador = 0;
            texto = " " + Regex.Replace(texto, "\\W+", " ") + " "; // substitui todos os caracteres entre palavras por " ", e circundando com " ".
            while (Regex.IsMatch(texto, "\\w+")) { // faz a contagem enquanto houver alguma palavra no texto.
                palavra = Regex.Match(texto, "\\w+").ToString(); // pega a proxima palavra no texto.
                contador = 0; // zera o contador de palavras
                do {
                    contador += Regex.Matches(texto, "(\\W" + palavra + "\\W)").Count; // pede a contagem total de referencias para aquela palavra.
                    texto = Regex.Replace(texto, "(\\W" + palavra + "\\W)", " ").ToString(); // remove a palavra do texto importado.
                } while (Regex.IsMatch(texto, "(\\W" + palavra + "\\W)")); // repete a contagem e remoção enquanto ainda houverem referencias
                Console.WriteLine(palavra + " - " + contador); // imprime a palavra e o numero de recorrencias
            }
            // não considerar essa parte como lógica  do programa
            Console.WriteLine("Tempo Execução: " + sw.Elapsed);
            // fim parte descartável
        }
    }
}
