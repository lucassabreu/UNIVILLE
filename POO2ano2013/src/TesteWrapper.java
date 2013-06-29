import java.io.DataInputStream;
import java.io.IOException;



public class TesteWrapper {

	/**
	 * @param args
	 */
	
	@Deprecated
	public static void main(String[] args) {
		int num1=0, num2=0, resul=0;
		
//		num1 = Integer.parseInt(args[0]);
//		num2 = Integer.parseInt(args[2]);
//		
//		System.out.print(num1);
//		System.out.print(args[1]);
//		System.out.print(num2);
		
		DataInputStream leitor = new DataInputStream(System.in);
		
		try{
			System.out.println("Digite o primeiro numero");
			String linhaLida = leitor.readLine();
		}catch(IOException e){
//			e.getCause()
			System.out.println("Deu erro na entrada");
		}
		
		if(args[1].equals("+")){
			resul = num1 + num2;
		}else{
			if(args[1].equals("x")){
				resul = num1 * num2;	
			}else{
				if(args[1].equals("/")){
					resul = num1 / num2;
				}else{
					if(args[1].equals("-")){
						resul = num1 - num2;	
					}
				}
			}
		}
		
		System.out.println("Resul:" + resul);
		

	}
}





