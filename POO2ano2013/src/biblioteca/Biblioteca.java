package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> colLivros =
			new ArrayList<Livro>();
	
	private ArrayList<DVD> colDVDs = 
			new ArrayList<DVD>();

	private ArrayList<Periodico> colPeriodicos = 
			new ArrayList<Periodico>();
	
	private ArrayList<Emprestimo> colEmprestimos = 
			new ArrayList<Emprestimo>();
	
	private ArrayList<Aluno> colAlunos = 
			new ArrayList<Aluno>();
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public ArrayList<Livro> getColLivros(){
		return colLivros;
	}
	public void setColLivros(ArrayList<Livro> colLivros){
		this.colLivros = colLivros;
	}
	public ArrayList<DVD> getColDVDs() {
		return colDVDs;
	}
	public void setColDVDs(ArrayList<DVD> colDVDs) {
		this.colDVDs = colDVDs;
	}
	public ArrayList<Periodico> getColPeriodicos() {
		return colPeriodicos;
	}
	public void setColPeriodicos(ArrayList<Periodico> colPeriodicos) {
		this.colPeriodicos = colPeriodicos;
	}
	public ArrayList<Emprestimo> getColEmprestimos() {
		return colEmprestimos;
	}
	public void setColEmprestimos(ArrayList<Emprestimo> colEmprestimos) {
		this.colEmprestimos = colEmprestimos;
	}
	public ArrayList<Aluno> getColAlunos() {
		return colAlunos;
	}
	public void setColAlunos(ArrayList<Aluno> colAlunos) {
		this.colAlunos = colAlunos;
	}
	
	
	
}
