package br.edu.univille.hanoi;

import java.util.Scanner;

import br.edu.univille.hanoi.core.exception.HanoiException;

public class JogoHanoi {

	private TorreHanoi torre;

	private Scanner leitor;

	private JogoHanoi(TorreHanoi torre) {
		this.torre = torre;
		this.leitor = new Scanner(System.in);
	}

	public static void main(String[] args) throws HanoiException {
		if (args.length != 2) {
			System.out.println("Execute o aplicativo com:\n\tjava br.edu.hanoi.HanoiGame nome_da_pilha quantidade_de_discos");
			return;
		}
		Class<?> pinoClasse;
		try {
			pinoClasse = Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			System.out.println("Nome da pilha '" + args[0] + "' não conhecida");
			return;
		}
		int quantidadeDeDiscos;
		try {
			quantidadeDeDiscos = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Quantidade de discos '" + args[0] + "' inválida");
			return;
		}
		JogoHanoi jogoHanoi = new JogoHanoi(new TorreHanoi(pinoClasse, quantidadeDeDiscos));
		jogoHanoi.jogar();
	}

	private void jogar() {
		imprimeOpcoes();
		boolean sair = false;
		do {
			System.out.println(torre.imprime());
			try {
				sair = movimentarDisco();
			} catch (HanoiException e) {
				System.out.println(e.getMessage());
			}
		} while (sair);
		System.out.println("Fim jogo");
	}

	private boolean movimentarDisco() throws HanoiException {
		int origem = lerPosicaoPino("Informe origem do disco: ", -1);
		if (origem == 0)
			return false;
		int destino = lerPosicaoPino("Informe destino do disco: ", origem);
		if (destino == 0)
			return false;
		torre.movimentar(origem - 1, destino - 1);
		return true;
	}

	private int lerPosicaoPino(String mensagem, int posicaoUsada) {
		int posicao = -1;
		while (posicao < 0 || posicao > 3) {
			System.out.print(mensagem);
			try {
				posicao = this.leitor.nextInt();
				if (posicao < 0 || posicao > 3) {
					imprimeAlerta("Digite as posições 1, 2 ou 3");
				}
				if (posicao == posicaoUsada) {
					imprimeAlerta("O pino de destino não pode ser o mesmo pino de origem");
				}
			} catch (Exception e) {
				imprimeAlerta("Leitura inválida");
			}
		}
		return posicao;
	}

	private void imprimeAlerta(String mensagem) {
		System.out.println("###########################################");
		System.out.println(mensagem);
		System.out.println("###########################################");
	}

	private void imprimeOpcoes() {
		System.out.println("Digite as seguintes opções:");
		System.out.println("\t0 para finalizar");
		// System.out.println("\tP para imprimir os pinos");
		// System.out.println("\tM [número do pino de origem] [número do pino de destino] para movimentar um disco");
	}

}
