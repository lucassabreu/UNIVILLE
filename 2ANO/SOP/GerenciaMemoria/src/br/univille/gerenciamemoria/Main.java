package br.univille.gerenciamemoria;

import java.util.ArrayList;

import br.univille.gerenciamemoria.obj.Algoritmo;
import br.univille.gerenciamemoria.obj.Pagina;

public class Main {
	public static void main(String[] args) {
		ArrayList<Pagina> paginas = new ArrayList<Pagina>();

		for (int i = 0; i < 10; i++)
			paginas.add(new Pagina(i));

		Pagina[] referencias = Pagina.genSequencia(paginas);
		/*new Pagina[] { //
				paginas.get(0), //
				paginas.get(1), //
				paginas.get(2), //
				paginas.get(3), //
				paginas.get(3), //
				paginas.get(1), //
				paginas.get(5), //
				paginas.get(9), //
				paginas.get(1), //
				paginas.get(9), //
				paginas.get(4), //
				paginas.get(9) //
		};*/

		Algoritmo[] algs = new Algoritmo[] {
				Algoritmo.getInstanceOf(Algoritmo.FIFO, 3, referencias),
				Algoritmo.getInstanceOf(Algoritmo.FIFO, 4, referencias),
				Algoritmo.getInstanceOf(Algoritmo.FIFO, 5, referencias),
				Algoritmo.getInstanceOf(Algoritmo.FIFO, 6, referencias),
				Algoritmo.getInstanceOf(Algoritmo.FIFO, 7, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LRU, 3, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LRU, 4, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LRU, 5, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LRU, 6, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LRU, 7, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LFU, 3, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LFU, 4, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LFU, 5, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LFU, 6, referencias),
				Algoritmo.getInstanceOf(Algoritmo.LFU, 7, referencias) //
		};

		for (Algoritmo alg : algs) {

			System.out.println("Algoritmo: " + alg.getClass().getSimpleName());

			for(int i = 0; i < alg.getMemoriaPrincipal().length; i++)
				System.out.print("+---");

			System.out.println("+--------+-----+");

			for(int i = 0; i < alg.getMemoriaPrincipal().length; i++)
				System.out.printf("| %d ", i);

			System.out.println("| Entrou | PF  |");

			for(int i = 0; i < alg.getMemoriaPrincipal().length; i++)
				System.out.print("+---");
			
			System.out.println("+--------+-----+");
			
			while (alg.proximaReferencia()) { // loop de gerencia de memoria
				for (Pagina p : alg.getMemoriaPrincipal()) {
					if (p == null)
						System.out.printf("|   ");
					else
						System.out.printf("| %s ", p.getNumero());
				}
				System.out.printf("|      %d | %s |\n", 
						alg.getReferenciaAtual().getNumero(),
						alg.getPFs()[alg.getTempoAtual()] ? "Sim" : "Nao"
				);
			}
			
			for(int i = 0; i < alg.getMemoriaPrincipal().length; i++)
				System.out.print("+---");
			
			System.out.println("+--------+-----+");
			
			System.out.printf("Numero Page-Faults: %d\n\n", alg.getPFCount());
		}
	}
}
