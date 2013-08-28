package br.univille.gerenciamemoria.obj;

import java.util.ArrayList;

public class Pagina {
	private int numero;
	private int carga = -1; // entrada no sistema
	private int ultimaReferencia = 0; // quando foi referenciado - LRU
	private int numeroReferencias = 0; // bit de referencia - LFU

	public Pagina(int numero) {
		this(numero, 0, 0, 0);
	}

	public Pagina(int numero, int ordemCarga, int carga, int br) {
		super();
		this.numero = numero;
		this.carga = ordemCarga;
		this.ultimaReferencia = carga;
		this.numeroReferencias = br;
	}

	public static Pagina[] genSequencia(ArrayList<Pagina> paginas) {
		Pagina[] sequencia = new Pagina[100];

		for (int i = 0; i < sequencia.length; i++) {
			sequencia[i] = paginas.get(((int) (Math.random() * 100)) % 10);
		}

		return sequencia;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pagina) {
			Pagina other = (Pagina) obj;

			return other.numero == this.numero;
		} else
			return false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getUltimaReferencia() {
		return ultimaReferencia;
	}

	public void setUltimaReferencia(int ultimaReferencia) {
		this.ultimaReferencia = ultimaReferencia;
	}

	public int getNumeroReferencias() {
		return numeroReferencias;
	}

	public void setNumeroReferencias(int numeroReferencias) {
		this.numeroReferencias = numeroReferencias;
	}

}
