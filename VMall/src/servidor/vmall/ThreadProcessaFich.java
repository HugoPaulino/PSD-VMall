package servidor.vmall;

import java.io.File;

public class ThreadProcessaFich implements Runnable {

	
	private File f;  // Ficheiro a processar
	

	
	// construtor
	public ThreadProcessaFich(File f) {
		this.f = f;
	}

	@Override
	public void run() {
		processaFicheiros();
		
	}

	// responsavel por processamento de todos os ficheiros
	public void processaFicheiros() {
		
		
	}
}
