package biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Sistema {
	public static void main(String[] args) {
		
		Biblioteca bibli = new Biblioteca();
		bibli.setNome("Biblioteca Central...");
		
		Livro l1 = new Livro();
		l1.setTitulo("Senhor dos aneis");
		l1.setAno(2013);
		l1.setAutor("J J Abram");
		l1.setISBN(29384750);
		
		bibli.getColLivros().add(l1);
		
		Livro l2 = new Livro("Memorias postumas de bras cubas", 
			"Machado de Assis", 8237432, 1920);
		
		bibli.getColLivros().add(l2);
		
		Periodico p1 = new Periodico();
		p1.setDescricao("Java Magazine");
		p1.setCodigo(1234);
		p1.setEdicao(20);
		p1.setAno(2013);
		
		bibli.getColPeriodicos().add(p1);
		
		DVD dvd1 = new DVD();
		dvd1.setDescricao("E o vento levou...");
		dvd1.setDuracao("3:00");
		dvd1.setCodigo(543);
		dvd1.setAno(1960);
		
		bibli.getColDVDs().add(dvd1);
		
		
		Aluno a1 = new Aluno();
		a1.setNome("Zezinho");
		a1.setCodigo(555);
		
		bibli.getColAlunos().add(a1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Emprestimo e1 = new Emprestimo();
		e1.setMeuAluno(a1);
		try {
			e1.setDataEmprestimo(sdf.parse("13/06/2013"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		ItemEmprestimo it1 = new ItemEmprestimo();
		it1.setMeuLivro(l1);
		
		ItemEmprestimo it2 = new ItemEmprestimo();
		it2.setMeuDVD(dvd1);
		
		ItemEmprestimo it3 = new ItemEmprestimo();
		it3.setMeuPeriodico(p1);
		
		e1.getColItensEmprestimo().add(it1);
		e1.getColItensEmprestimo().add(it2);
		e1.getColItensEmprestimo().add(it3);
		
		bibli.getColEmprestimos().add(e1);
		
		
		//aqui...
		
		
		System.out.println("###EMPRESTIMOS###");
		for(int i=0; i < bibli.getColEmprestimos().size();i++){
			Emprestimo umEmp = bibli.getColEmprestimos().get(i); 
			System.out.println("Data: " + umEmp.getDataEmprestimo());
			System.out.println("Aluno: " + 
						umEmp.getMeuAluno().getNome());
			System.out.println("Codigo: " + 
					umEmp.getMeuAluno().getCodigo());
			
			
			//FOR DOS ITENS
			System.out.println("    ###ITEMS###");
			for(int j=0; 
					j<umEmp.getColItensEmprestimo().size();j++){
				
				ItemEmprestimo umItem = 
					umEmp.getColItensEmprestimo().get(j);
				
				if(umItem.getMeuLivro() != null){
					System.out.println("Titulo: " + 
							umItem.getMeuLivro().getTitulo());
					System.out.println("Autor: " +
							umItem.getMeuLivro().getAutor());
				}else{
					if(umItem.getMeuDVD() != null){
						System.out.println(
							umItem.getMeuDVD().getDescricao());
					}else{
						System.out.println(
								umItem.getMeuPeriodico().getDescricao());
					}
				}
				
			}
		}
		//aqui2
		
		
	}
}







