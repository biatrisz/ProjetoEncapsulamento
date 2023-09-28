package ManipulacaoProjeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipularArquivos {

	public static void main(String[] args) throws IOException{
		String path= "C:\\tmp\\file.txt";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha2= "";
		Scanner in= new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha2= in.nextLine();
		buffWrite.append(linha2+ "/n");
		buffWrite.close();


		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha= "";
		while(true) {
			if (linha != null) {
				System.out.println(linha);
			}else
				break;
			linha= buffRead.readLine();

		}
		buffRead.close();
	}

}
