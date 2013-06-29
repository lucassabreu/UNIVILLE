package br.edu.univille.calculadora;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            about();
        }
        
        StringBuilder operation = new StringBuilder();
        
        for(String arg : args) {
            operation.append(arg);
        }
        
        
    }
    
    public static void about(){
        System.out.println(" ** Chama invalida ao programa, a sintaxe do comando eh:");
        System.out.println("    java br.edu.univille.calculadora.Main param1 [param2 [param...]]");
    }

}
