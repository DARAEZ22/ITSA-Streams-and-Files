package manejoArchivos;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Archivo {

	public static void main(String[] args) throws FileNotFoundException{
		
	File archivo = new File("C:\\Users\\dlara\\OneDrive\\Documentos\\Important notes\\thoughts\\frustration.txt");
	
	Scanner a = new Scanner(archivo);
	
	
	while(a.hasNextLine()) {
		
		String linea= a.nextLine();
		System.out.println(linea);
				
	}
	   a.close();
	}

}
