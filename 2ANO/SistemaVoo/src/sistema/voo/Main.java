package sistema.voo;

import java.util.ArrayList;

import clientes.Bagagem;
import clientes.Passageiro;
import clientes.Passagem;

import reservas.Aeronave;
import reservas.Companhia;
import reservas.Piloto;
import reservas.Voo;

public class Main {

    // d. Implemente os itens abaixo no método main na classe Companhia:
    // i. Instancie 2 (dois) passageiros, um com 3 (três) bagagens outro com 2
    // (duas) bagagens.
    // ii. Instancie 2 Voos diferentes, com tripulação e aeronaves distintas.
    // Considere que os Voos são formam uma conexão de Joinville para Belo
    // Horizonte, com escala em São Paulo.
    // iii. Reserve para os dois passageiros dois acentos nos dois voos que
    // formam a conexão. Então execute a listagem de linhas da companhia.

    public static void main(String[] args) {
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();

        // primeiro passageiro
        passageiros.add(new Passageiro("Passageiro I", "45896785246", "1456789", "01/01/1995"));
        passageiros.get(0).getColBagagens().add(new Bagagem(passageiros.get(0), "A", 1.5f)); // bagagem 1
        passageiros.get(0).getColBagagens().add(new Bagagem(passageiros.get(0), "B", 3.0f)); // bagagem 2
        passageiros.get(0).getColBagagens().add(new Bagagem(passageiros.get(0), "a", 1.0f)); // bagagem 3
        
        // segundo passageiro
        passageiros.add(new Passageiro("Passageiro II", "45896785246", "1456789", "01/01/1995"));
        passageiros.get(0).getColBagagens().add(new Bagagem(passageiros.get(0), "A", 1.5f)); // bagagem 1
        passageiros.get(0).getColBagagens().add(new Bagagem(passageiros.get(0), "B", 3.0f)); // bagagem 2
        Companhia c = new Companhia();

        c.getFrota().add(new Aeronave(1, "Boing", 100));
        c.getFrota().add(new Aeronave(2, "Boing", 100));
        c.getFrota().add(new Aeronave(3, "Boing", 100));
        c.getFrota().add(new Aeronave(4, "Boing", 100));

        c.getFuncionarios().add(new Piloto("4654455", "Joao da Silva"));
        c.getFuncionarios().add(new Piloto("0121655", "Leonardo"));
        c.getFuncionarios().add(new Piloto("5465455", "Rafael"));
        c.getFuncionarios().add(new Piloto("4545646", "Donatelo"));
        c.getFuncionarios().add(new Piloto("7892565", "Michelangelo"));
        c.getFuncionarios().add(new Piloto("5546879", "Mario Mario"));
        c.getFuncionarios().add(new Piloto("6545655", "Luigi Mario"));

        Voo voo = null;

        String[] locais = new String[] { "Joinville", "Belo Horizonte",
                "Sao Paulo", "Salvador", "Rio de Janeiro", "Brasilia" };

        for (int i = 0; i < 10; i++) {
            voo = new Voo(i, locais[i % locais.length], locais[(i + 1) % locais.length]);

            voo.setAeronave(c.getFrota().get(i % c.getFrota().size()));

            voo.setCapitao(c.getFuncionarios().get(i % c.getFuncionarios().size()));
            voo.setCopiloto(c.getFuncionarios().get((i + 1) % c.getFuncionarios().size()));

            voo.checkin(new Passagem(1, passageiros.get(0)));
            voo.checkin(new Passagem(2, passageiros.get(1)));

            c.getLinhas().add(voo);
        }

        // listar
        c.listagemDeLinhas();
        
        
        new Baga

    }
}
