
public class Fabrica {

	public static void main(String[] args) {
		// A partir daqui q eu tenho um objeto...
		Motor m1 = new Motor(4,500);
		m1.setModelo("quase nada");
		m1.setModelo("troca denovo...");
//		m1.numCavalos = -1;
		
		Motor m2 = new Motor(99999);
		m2.setModelo("toda potencia do mundo");
//		m2.numCavalos = 99999;
		
		
		//aqui1
//		m1.numCavalos = 200;
		//aqui2
		
		Carro fusca = new Carro();
		fusca.meuMotor = m1;
		fusca.modelo = "1300";
		System.out.println("Modelo " + fusca.modelo);
		System.out.println("Motor " + fusca.meuMotor);
		
		
		Carro ferrari = new Carro();
		ferrari.meuMotor = m2;
		System.out.println("Modelo " + ferrari.modelo);
		System.out.println("Motor " + ferrari.meuMotor);
	}
}
