package ManipulacaoProjeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
	private String nomeArquivo;
	private String tipoArquivo;
	
	public String getnomeArquivo() {
		return nomeArquivo;
	}
	public void setnomeArquivo(String nomeArquivo) {
		this.nomeArquivo= nomeArquivo;
	}
	public String gettipoArqivo(){
		return tipoArquivo;
	}
	public void settipoArquivo(String tipoArquivo) {
		this.tipoArquivo= tipoArquivo;
	}
	
	public void lerArquivo(String path) throws IOException{ 

		BufferedReader buffRead= new BufferedReader(new FileReader(path));
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
	
	public void gravarArquivo(String path) throws IOException{ 

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha2= "";
		Scanner in= new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha2= in.nextLine();
		buffWrite.append(linha2+ "/n");
		buffWrite.close();
	
		}
	}
