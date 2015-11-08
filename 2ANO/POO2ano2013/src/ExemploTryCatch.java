import java.io.DataInputStream;
import java.io.IOException;


public class ExemploTryCatch {

	/**
	 * @param args
	 * @throws Exception 
	 */
	
	
	
	
	
	//METODO
	public static void minhaFuncao() throws Exception{
		try{
			throw new Exception("Deu pau...");
		}catch(Exception e){
			System.out.println("Tratei o erro..");
			throw e;
		}
	}
	
	public static void main(String[] args) {

		float[] notas = {-10,7,4};

		try{ //tenta...
			
			minhaFuncao();
			
			int numero = Integer.parseInt("alalal");
			
			
			if(notas[0] < 0)
				throw new MeuErro("nota nao pode ser negativa");
			
			//System.out.println(notas[3]);
			System.out.println("linha1");
			System.out.println("linha2");
			System.out.println("linha3");
			//int idade = Integer.parseInt("a");
			System.out.println("eu nunca vou passar aqui..");
		}catch(NumberFormatException e){
			System.out.println("Conversao com erro...");
		}catch(Exception e){
			System.out.println("Nao de mais erros");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally{
			System.out.println("Eu sempre passo aqui...");
		}

		
//		try{
//			
//		}finally{
//			
//		}
	}

	
//	public void funcao1(){
//		
//		int resultado = funcao2();
//		
//		if(resultado == -1){
//			System.out.println("deu pau");
//		}
//	}
//	public int funcao2(){
//		//se der erro ela retorna -1
//		
//		return -1;
//	}
	
	
	public void funcao1(){
		
		try {
			funcao2();
			//aqui
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//aqui
		}finally{
			
		}
		
	}
	public void funcao2() throws Exception{
		//se der erro ela retorna -1
//		try{
//			throw new Exception("Deu erro");
//		}catch(Exception variavel){
//			System.out.println("Desculpa usuario deu caca " +
//					variavel.getMessage());
//		}
		
		throw new Exception("Deu erro");
	}
	
	
}
