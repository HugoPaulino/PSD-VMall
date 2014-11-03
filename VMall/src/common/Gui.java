package common;

public class Gui {

	
	public static short menu(String menu, String [] opcoes){
		
		System.out.println(menu);
		System.out.println("\n");
		System.out.println(opcoes[0]);
		System.out.println(opcoes[1]);
		System.out.println(opcoes[2]);
		System.out.println(opcoes[3]);
		return Utils.getSession(); 
		
	}
	
	
	
}
