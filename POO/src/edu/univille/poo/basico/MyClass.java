package edu.univille.poo.basico;

public class MyClass {

    int i;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        MyClass colMyClass = null;
        for (int i = 0; i <= 100; i++) {
            colMyClass = new MyClass(i);
            colMyClass = null;
            System.gc();
        }
    }

    public MyClass(int i) {
        this.i = i;
        System.out.println("Fui Criado " + i);
    }

    protected void finalize() throws Throwable {
        System.out.println("Morri " + i);
    }
}
