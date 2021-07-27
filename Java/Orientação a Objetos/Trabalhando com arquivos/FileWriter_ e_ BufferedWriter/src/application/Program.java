package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// # GRAVANDO COISAS DENTRO DO ARQUIVO E RECRIANDO ARQUIVO:
		
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "C:\\Users\\Davi\\Desktop\\Udemy\\Java Orientação a objetos\\Trabalhando com arquivos\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // O PARÂMETRO TRUE FAZ COM QUE SEJAM GRAVADAS COISAS DENTRO DO ARQUIVO.
			for (String line : lines) {											   // BASTA TIRAR O TRUE PARA QUE O ARQUIVO SEJA RECRIADO.
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
