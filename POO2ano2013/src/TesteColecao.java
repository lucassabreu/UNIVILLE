import java.util.ArrayList;


public class TesteColecao {

	public static void main(String[] args) {
		
		ArrayList<String> colecao = new ArrayList<String>();
		
		colecao.add("univille");
		colecao.add(1234);
		colecao.add(true);
		
		int max = colecao.size() - 1;
		for(int i=max; i >= 0 ; i--){
			System.out.println(colecao.remove(i));
		}
		
		System.out.println("Tamanho: " + colecao.size());
		
	}
}





