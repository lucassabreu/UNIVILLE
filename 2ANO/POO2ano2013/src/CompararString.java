
public class CompararString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fruta = "laranja";
		System.out.println(fruta.equals("banana"));
		System.out.println(fruta.equals("laranja"));
		System.out.println(fruta == "laranja");
		System.out.println(fruta == new String("laranja"));
		
		fruta = "banana" + "e" + "amarela";
	}
}







