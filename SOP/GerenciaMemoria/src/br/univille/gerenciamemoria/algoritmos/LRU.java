package br.univille.gerenciamemoria.algoritmos;

import br.univille.gerenciamemoria.obj.Algoritmo;
import br.univille.gerenciamemoria.obj.Pagina;

public class LRU extends Algoritmo {

	public LRU(int tamanhoMP) {
		super(tamanhoMP);
	}

	@Override
	protected void trocarPagina() {
		int indiceTrocar = 0;

		Pagina[] mp = this.getMemoriaPrincipal();

		for (int i = 0; i < mp.length; i++) {
			if (mp[indiceTrocar].getUltimaReferencia() > mp[i].getUltimaReferencia()) {
				indiceTrocar = i;
			}
		}

		this.alocar(indiceTrocar, this.getReferenciaAtual());
	}

}