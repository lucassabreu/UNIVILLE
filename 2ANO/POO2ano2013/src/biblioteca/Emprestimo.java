package biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
	private Date dataEmprestimo;
	private Date dataDevolucao;
	
	private Aluno meuAluno;
	private ArrayList<ItemEmprestimo> colItensEmprestimo = 
			new ArrayList<ItemEmprestimo>();
	
	
	
	
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Aluno getMeuAluno() {
		return meuAluno;
	}
	public void setMeuAluno(Aluno meuAluno) {
		this.meuAluno = meuAluno;
	}
	public ArrayList<ItemEmprestimo> getColItensEmprestimo() {
		return colItensEmprestimo;
	}
	public void setColItensEmprestimo(ArrayList<ItemEmprestimo> colItensEmprestimo) {
		this.colItensEmprestimo = colItensEmprestimo;
	}
	
}
