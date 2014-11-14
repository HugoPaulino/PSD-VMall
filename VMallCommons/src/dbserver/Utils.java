package dbserver;

public class Utils {

	
public static final String CODEBASE = "java.rmi.server.codebase";
	
	public static void setCodeBase(Class<?> c){
		String caminho = c.getProtectionDomain().getCodeSource().getLocation().toString();
	
		String path = System.getProperty(CODEBASE);
		
		if(path!= null && !path.isEmpty())
		caminho = path + " " + caminho;
			
		System.setProperty(CODEBASE, caminho);
	}
}
