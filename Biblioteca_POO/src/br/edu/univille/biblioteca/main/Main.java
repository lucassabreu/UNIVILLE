package br.edu.univille.biblioteca.main;

import br.edu.univille.biblioteca.Aluno;
import br.edu.univille.biblioteca.Biblioteca;
import br.edu.univille.biblioteca.DVD;
import br.edu.univille.biblioteca.Emprestimo;
import br.edu.univille.biblioteca.Livro;
import br.edu.univille.biblioteca.Periodico;

/**
 * Classe Main do projeto Biblioteca
 * 
 * @author Lucas dos Santos Abreu <lucas.s.abreu@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("UNIVILLE");

        // - Instancie 3 livros e associe a biblioteca
        biblioteca.getLivros()
                        .add(new Livro(biblioteca, "O Magico Desinventor", "Marco Tulio Costa", 123454, 2013));
        biblioteca.getLivros()
                        .add(new Livro(biblioteca, "O Magico Desinventor II", "Marco Tulio Costa", 231354, 2013));
        biblioteca.getLivros()
                        .add(new Livro(biblioteca, "O Magico Desinventor III", "Marco Tulio Costa", 787789, 2013));

        // - Instancie 4 periódicos e associe a biblioteca
        biblioteca.getPeriodicos()
                        .add(new Periodico(biblioteca, 1, "PERIODICO", "I", 2013));
        biblioteca.getPeriodicos()
                        .add(new Periodico(biblioteca, 2, "PERIODICO", "II", 2013));
        biblioteca.getPeriodicos()
                        .add(new Periodico(biblioteca, 3, "PERIODICO", "III", 2013));
        biblioteca.getPeriodicos()
                        .add(new Periodico(biblioteca, 4, "PERIODICO", "IV", 2013));

        // - Instancie 4 periódicos e associe a biblioteca
        biblioteca.getDvds()
                        .add(new DVD(biblioteca, 1, "300", 2013, (int) (2.5 * 60)));
        biblioteca.getDvds()
                        .add(new DVD(biblioteca, 1, "300 - II", 2013, (int) (2.5 * 60)));
        biblioteca.getDvds()
                        .add(new DVD(biblioteca, 1, "300 - III", 2013, (int) (2.5 * 60)));
        biblioteca.getDvds()
                        .add(new DVD(biblioteca, 1, "300 - IV", 2013, (int) (2.5 * 60)));

        // - Instancie 3 alunos e associe a biblioteca
        biblioteca.getAlunos().add(new Aluno(biblioteca, "Joao", 1));
        biblioteca.getAlunos().add(new Aluno(biblioteca, "Jose", 2));
        biblioteca.getAlunos().add(new Aluno(biblioteca, "Manuel", 3));

        Emprestimo emp = new Emprestimo(biblioteca, biblioteca.getAlunos()
                        .get(0));

        emp.addItem(biblioteca.getLivros().get(0));
        emp.addItem(biblioteca.getPeriodicos().get(0));
        emp.addItem(biblioteca.getPeriodicos().get(1));
        emp.addItem(biblioteca.getDvds().get(0));

        biblioteca.getEmprestimos().add(emp);

        System.out.println(String.format("# Bibliotea: %s", biblioteca
                        .getNome()));
        
        System.out.println();
        System.out.println("# Alunos:");
        System.out.println("+----------+------------------------------------------+");
        System.out.println("|   Codigo | Nome                                     |");
        System.out.println("+----------+------------------------------------------+");

        for (Aluno aluno : biblioteca.getAlunos()) {
            System.out.println(String.format("| %8d | %40s |", aluno
                            .getCodigo(), fillWithSpace(aluno.getNome(), 40)));
        }
        System.out.println("+----------+------------------------------------------+");

    }

    public static String fillWithSpace(String texto, int tamanho) {

        StringBuilder sb = new StringBuilder();

        if (texto.length() > tamanho) {
            sb.append(texto.substring(0, tamanho));
        } else {
            sb.append(texto);
            for (int i = texto.length(); i < tamanho; i++) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
