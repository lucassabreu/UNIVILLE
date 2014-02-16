import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public class TesteCalculadora {
	//variveis de escopo de classe
	

	public float div(float n1, float n2){
		float resul = 0;
		try{
			resul = n1 / n2;
		}catch (ArithmeticException e){
			System.out.println("Peguei alguma coisa...");
		}
		return resul;
	}

	//modif tipo nome = valor;
	//modif ret(tipo/void) nome (parametros){
	// corpo
	//}

	public float soma(float n1, float n2){
		float resul  = n1 + n2;
		return resul;
	}
	public float subtracao(float n1, float n2){
		float resul = n1 - n2;
		return resul;
	}
	public float mult(float n1, float n2){
		float resul = n1 * n2;
		return resul;
	}


	public static void main(String[] args) {
		TesteCalculadora calc = new TesteCalculadora();
		DataInputStream entrada = new DataInputStream(System.in);
		float numero1=0, numero2=0;
		char operacao = ' ';
		
		
		try {
			System.out.println("Digite um numero???");
			numero1 = Float.parseFloat(entrada.readLine());
			System.out.println("Digite a operacao???");
			operacao = entrada.readLine().charAt(0);
			System.out.println("Digite mais um numero?");
			numero2 = Float.parseFloat(entrada.readLine());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		System.out.print(numero1);
		System.out.print(operacao);
		System.out.print(numero2+"=");

//		float macaco=0, banana=0;
//		try{
//			macaco = Float.parseFloat(args[0]);
//			banana = Float.parseFloat(args[2]);
//		}catch(NumberFormatException e){
//			System.out.println("Querido usuario, passe apenas numeros");
//		}

		float resul = 0;

		switch (operacao) {
		case '+':
			resul = calc.soma(numero1,numero2);
			break;
		case '-':
			resul = calc.subtracao(numero1,numero2);
			break;
		case '/':
			resul = calc.div(numero1,numero2);
			break;
		case 'x': case 'X':
			resul = calc.mult(numero1,numero1);
			break;
		default:
			System.out.println("Operação invalida!");
			break;
		}
		System.out.println(resul);
	}

}






