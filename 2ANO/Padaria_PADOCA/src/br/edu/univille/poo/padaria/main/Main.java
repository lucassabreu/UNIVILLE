package br.edu.univille.poo.padaria.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.edu.univille.poo.padaria.Atendente;
import br.edu.univille.poo.padaria.Padaria;
import br.edu.univille.poo.padaria.Produto;

public class Main {

    protected static NumberFormat     nf  = NumberFormat.getCurrencyInstance();
    protected static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        Padaria padaria = createPadaria();

        
        
        printPadaria(padaria);
    }

    public static Padaria createPadaria() {
        Padaria padaria = new Padaria("PADOCA", "11122233344", 0);

        padaria.getProdutos().add(new Produto(1, "Pão de Queijo", 0.25f));
        padaria.getProdutos().add(new Produto(2, "Leite", 1.5f));
        padaria.getProdutos().add(new Produto(3, "Pão", 0.25f));
        padaria.getProdutos().add(new Produto(4, "Chiclete", 0.1f));
        padaria.getProdutos().add(new Produto(5, "Pão de Batata", 0.35f));

        try {
            padaria.getAtendentes()
                            .add(new Atendente(padaria, 1, "João", "Rua do João", sdf
                                            .parse("10/10/1996")));

            padaria.getAtendentes()
                            .add(new Atendente(padaria, 2, "Manuel", "Rua do Manuel", sdf
                                            .parse("05/08/1996")));
            padaria.getAtendentes()
                            .add(new Atendente(padaria, 3, "Jose", "Rua do Jose", sdf
                                            .parse("06/12/1996")));
            padaria.getAtendentes()
                            .add(new Atendente(padaria, 4, "Carlota", "Rua do Carlota", sdf
                                            .parse("21/08/1995")));
            padaria.getAtendentes()
                            .add(new Atendente(padaria, 5, "Maria", "Rua do Maria", sdf
                                            .parse("10/10/1994")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return padaria;
    }

    public static void printPadaria(Padaria padaria) {
        System.out.println("+---------------------------------------------+");
        System.out.println("|                  Produtos                   |");
        System.out.println("+------+----------------------+---------------+");

        for (Produto pro : padaria.getProdutos()) {
            System.out.println(String
                            .format("| %4d | %20s | %13s |", pro.getCodigo(), fillSpacesRight(pro
                                            .getNome(), 20), nf.format(pro
                                            .getValor())));
        }

        System.out.println("+------+----------------------+---------------+");

        System.out.println();

        System.out.println("+-----------------------------------------------------------------+");
        System.out.println("|                            Atendentes                           |");
        System.out.println("+------+----------------------+----------------------+------------+");

        for (Atendente a : padaria.getAtendentes()) {
            System.out.println(String
                            .format("| %4d | %20s | %20s | %10s |", a
                                            .getCodigo(), fillSpacesRight(a
                                            .getNome(), 20), fillSpacesRight(a
                                            .getEndereco(), 20), sdf.format(a
                                            .getDataNascimento())));
        }

        System.out.println("+------+----------------------+----------------------+------------+");
    }

    public static String fillSpacesRight(String content, int lenght) {

        StringBuilder sb = new StringBuilder();

        if (content.length() < lenght) {
            sb.append(content);

            for (int i = sb.length(); i < lenght; i++)
                sb.append(" ");
        } else
            sb.append(content.substring(0, lenght));

        return sb.toString();
    }
}
