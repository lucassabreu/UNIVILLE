package br.univille.gerenciamemoria.obj;


public abstract class Algoritmo {
	// private ArrayList<Pagina> paginas;
	private Pagina[] memoriaPrincipal;

	private Pagina[] referencias;
	private int tempoAtual = -1;

	private boolean[] pFs;
	private int pFCount = 0;

	public final static int FIFO = 0;
	public final static int LRU = 1;
	public final static int LFU = 2;

	public Algoritmo(int tamanhoMP) {
		this.memoriaPrincipal = new Pagina[tamanhoMP];
	}

	public static Algoritmo getInstanceOf(int alg, int tamanhoMP) {
		switch (alg) {
		case FIFO:
			return new br.univille.gerenciamemoria.algoritmos.FIFO(tamanhoMP);
		case LRU:
			return new br.univille.gerenciamemoria.algoritmos.LRU(tamanhoMP);
		case LFU:
			return new br.univille.gerenciamemoria.algoritmos.LFU(tamanhoMP);
		}
		
		return null;
	}
	
	public static Algoritmo getInstanceOf(int tipo, int tamanhoMP, Pagina[] referencias) {
		Algoritmo alg = getInstanceOf(tipo, tamanhoMP);
		alg.setReferencias(referencias);
		return alg;
	}

	public boolean proximaReferencia() {
		this.tempoAtual++;

		if (this.tempoAtual == this.referencias.length)
			return false;

		Pagina pagina = this.referencias[this.tempoAtual];
		int i = 0;
		for (; i < this.memoriaPrincipal.length; i++) {
			if (this.memoriaPrincipal[i] == null
					|| this.memoriaPrincipal[i].equals(pagina))
				break;
		}
		
		// incrementa o numero de vezes que foi referencia sem sair da memoria
		pagina.setNumeroReferencias(pagina.getNumeroReferencias() + 1);

		// altera o momento da ultima referencia
		pagina.setUltimaReferencia(this.tempoAtual);

		if (i < this.memoriaPrincipal.length) { // encontrou a pagina ou existe
												// em branco
			if (this.memoriaPrincipal[i] == null) { // encontrou em branco
				this.alocar(i, pagina);
				this.pFs[this.tempoAtual] = true;
			} else { // jah esta na memoria
				this.pFs[this.tempoAtual] = false;
			}
		} else { // esta tudo oculpado e precisa tirar alguem da memoria
			this.trocarPagina();
			this.pFs[this.tempoAtual] = true;
		}

		if (this.pFs[this.tempoAtual])
			this.pFCount++; // incrementa o page-fault counter

		return true;
	}

	protected void alocar(int i, Pagina pagina) {
		if (i < this.memoriaPrincipal.length) {
			if (this.memoriaPrincipal[i] != null) {
				this.memoriaPrincipal[i].setNumeroReferencias(0);
				this.memoriaPrincipal[i].setUltimaReferencia(-1);
				this.memoriaPrincipal[i].setCarga(-1);
			}

			this.memoriaPrincipal[i] = pagina;

			pagina.setCarga(this.tempoAtual); // tempo de entrada (carga)
			pagina.setNumeroReferencias(1);
			pagina.setUltimaReferencia(this.tempoAtual);
		}
	}

	protected abstract void trocarPagina();

	public void setReferencias(Pagina[] referencias) {
		this.referencias = referencias;
		this.pFs = new boolean[referencias.length];
	}

	public Pagina getReferenciaAtual() {
		return this.referencias[this.tempoAtual];
	}

	public boolean[] getPFs() {
		return pFs;
	}

	public Pagina[] getMemoriaPrincipal() {
		return memoriaPrincipal;
	}

	public Pagina[] getReferencias() {
		return referencias;
	}

	public int getTempoAtual() {
		return tempoAtual;
	}

	public int getPFCount() {
		return pFCount;
	}
}
