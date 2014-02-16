package edu.univille.poo.basico;

public class Fabrica {
    public static void main(String[] args) {
        Motor m1 = new Motor("quase nada", 0.5f, -1);

        Carro fusca = new Carro();
        fusca.motor = m1;
        fusca.modelo = "1300";

        System.out.println(String.format("Modelo: %s", fusca.modelo));
        System.out.println(String.format("Motor: %s", fusca.motor));

        Carro ferrari = new Carro();
        ferrari.motor = new Motor("toda potencia do mundo", 99999, 999999);

        System.out.println(String.format("Modelo: %s", ferrari.modelo));
        System.out.println(String.format("Motor: %s", ferrari.motor));
    }
}
