package br.edu.univille.hanoi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.edu.univille.hanoi.core.Disco;
import br.edu.univille.hanoi.core.PinoHanoi;
import br.edu.univille.hanoi.core.exception.HanoiException;
import br.edu.univille.hanoi.core.exception.PinoCheioException;
import br.edu.univille.hanoi.core.exception.PinoVazioException;

public class TorreHanoi {

	private PinoHanoi[] pinos = new PinoHanoi[3];

	private int quantidadeDeDiscos;

	public TorreHanoi(@SuppressWarnings("rawtypes") Class pinoClasse, int quantidadeDeDiscos) throws HanoiException {
		try {
			pinos[0] = (PinoHanoi) newInstance(pinoClasse, quantidadeDeDiscos);
			pinos[1] = (PinoHanoi) newInstance(pinoClasse, quantidadeDeDiscos);
			pinos[2] = (PinoHanoi) newInstance(pinoClasse, quantidadeDeDiscos);
		} catch (InstantiationException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		} catch (IllegalAccessException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		} catch (NoSuchMethodException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		} catch (SecurityException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		} catch (IllegalArgumentException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		} catch (InvocationTargetException e) {
			throw new HanoiException("Erro ao inicializar o pino na torre de hanoi", e);
		}
		this.quantidadeDeDiscos = quantidadeDeDiscos;
		for (int i = quantidadeDeDiscos; i > 0; i--) {
			try {
				pinos[0].push(new Disco(i));
			} catch (PinoCheioException e) {
				throw new HanoiException("Erro ao inicializar primeiro pino do com discos", e);
			}
		}
	}

	private PinoHanoi newInstance(Class pinoClasse, int tamanho) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor c = pinoClasse.getConstructor();
		PinoHanoi pinoHanoi = (PinoHanoi) c.newInstance();
		pinoHanoi.init(tamanho);
		return pinoHanoi;
	}

	public boolean movimentar(int origem, int destino) throws HanoiException {
		try {
			if (!pinos[destino].isEmpty()) {
				Disco dOrigem = pinos[origem].top();
				Disco dDestino = pinos[destino].top();
				if (dOrigem.maiorQue(dDestino)) {
					throw new HanoiException("Movimento inválido");
				}
			}
			pinos[destino].push(pinos[origem].pop());
			return true;
		} catch (PinoVazioException e) {
			throw new HanoiException("Movimento inválido", e);
		} catch (PinoCheioException e) {
			throw new HanoiException("Movimento inválido", e);
		}
	}

	public String imprime() {
		char c[][] = new char[quantidadeDeDiscos + 2][(quantidadeDeDiscos * 2 + 1) * 3 + 2];
		StringBuilder sb = new StringBuilder();
		pinos[0].imprime(c, 1);
		pinos[1].imprime(c, 2);
		pinos[2].imprime(c, 3);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] == 0)
					sb.append(' ');
				else
					sb.append(c[i][j]);
			}
			sb.append('\n');
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(128);
		sb.append("Pino 1: ").append(pinos[0]).append('\n');
		sb.append("Pino 2: ").append(pinos[1]).append('\n');
		sb.append("Pino 3: ").append(pinos[2]).append('\n');
		return sb.toString();
	}

}
