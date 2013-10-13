package biblioteca;

import java.util.Date;

public class ItemEmprestimo {
	private Livro meuLivro;
	private DVD meuDVD;
	private Periodico meuPeriodico;
	private Date dataDevolucao;
	public Livro getMeuLivro() {
		return meuLivro;
	}
	public void setMeuLivro(Livro meuLivro) {
		this.meuLivro = meuLivro;
	}
	public DVD getMeuDVD() {
		return meuDVD;
	}
	public void setMeuDVD(DVD meuDVD) {
		this.meuDVD = meuDVD;
	}
	public Periodico getMeuPeriodico() {
		return meuPeriodico;
	}
	public void setMeuPeriodico(Periodico meuPeriodico) {
		this.meuPeriodico = meuPeriodico;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	
}
