package biblioteca;

public class Livro {
	//atributos de escopo de classe
	private String titulo;
	private String autor;
	private int ISBN;
	private int ano;
	
	//CONSTRUTOR
	//POLIMORFISMO - SOBRECARGA DE METODOS
	public Livro(){ 
		
	}
	public Livro(String titulo, String autor, int ISBN, int ano){
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.ano = ano;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
