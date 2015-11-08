import java.util.Vector;


public class ExemploFor {
	public static void main(String[] args) {
		
//		for(int i=0;i<10;i++){
//			System.out.println("Item " + i);
//		}
//		if(i==10){
//			System.out.println("nao achou!");
//		}
		
		Cliente cli1 = new Cliente("Zezinho", 20);
		Cliente cli2 = new Cliente("Huguinho", 21);
		Cliente cli3 = new Cliente("Luizinho", 22);
		
		Vector<Cliente> colClientes = new Vector<Cliente>();
		
		colClientes.add(cli1);
		colClientes.add(cli2);
		colClientes.add(cli3);
//		colClientes.add(1);
//		colClientes.add("macaco");
//		colClientes.add(true);
		
		for(Cliente umCliente:colClientes){
			System.out.println(umCliente);
		}
	}
}






