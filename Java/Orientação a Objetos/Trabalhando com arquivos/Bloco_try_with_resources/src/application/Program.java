package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// # FORMA AUTOMATICA DE ABRIR E FECHAR AS STRAMINGS:
		
		String path = "C:\\Users\\Davi\\Desktop\\Udemy\\Java Orientação a objetos\\Trabalhando com arquivos\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
