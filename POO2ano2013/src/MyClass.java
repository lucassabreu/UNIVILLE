public class MyClass {

	int i;
	public static void main(String[] args) {
		for(int i=0; i <= 999999999; i++){
			//INSTANCIANDO...
			MyClass colMyClass = new MyClass(i);
			colMyClass = null;
			//Garbage Collector
//			System.gc();
		}
	}
	//CONSTRUTOR
	public MyClass(int i){
		this.i = i;
		System.out.println("Fui Criado " + i);
	}
	//DESTRUTOR
	protected void finalize() throws Throwable {
		System.out.println("Morri " + i);
	}
}
