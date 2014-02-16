package edu.univille.poo.basico;

public class Motor {
    String modelo;
    float  numCavalos;
    int    numPontosIn;

    public Motor() {}

    public Motor(String modelo, float numCavalos, int numPontosIn) {
        this.modelo = modelo;
        this.numCavalos = numCavalos;
        this.numPontosIn = numPontosIn;
    }

    @Override
    public String toString() {
        return String.format("Motor[%s|%.2f|%d]", this.modelo, this.numCavalos, this.numPontosIn);
    }
}
