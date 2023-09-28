package ManipulacaoProjeto;

import java.io.IOException;

public class GravarArquivo {

	public static void main(String[] args) throws IOException {
		String path= "C:\\tmp\\sonic.txt";
		Arquivo arquivo1 = new Arquivo();
		
		arquivo1.gravarArquivo(path);
		arquivo1.lerArquivo(path);
	}
}

