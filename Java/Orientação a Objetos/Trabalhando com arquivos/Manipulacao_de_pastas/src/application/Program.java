package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//  LISTAGEM DAS PASTAS :
		
		File[] folders = path.listFiles(File::isDirectory);  // # ESTA FUN??O EST? LISTANDO O QUE FOR DIRET?RIO OU PASTA.
		System.out.println();
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//  LISTAGEM DOS ARQUIVOS:
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		System.out.println();
		for (File file : files) {
			System.out.println(file);
		}
		
		// CRIANDO SUBPASTA: 
		
		boolean success = new File(strPath + "\\SubPasta").mkdir();
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
		
	}

}
