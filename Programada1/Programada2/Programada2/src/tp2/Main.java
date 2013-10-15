package tp2;

import java.io.*;

public class Main  {

	public static void main(String[] args) throws IOException {	 
    Leerarchivos a= new Leerarchivos();
    String l=a.leer("/home/esteban/pRGA 2/Programada2/salida.out");
	ProcesarBaseConocimientos.procesarConsulticas(l);
	BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
	String nombre;
	System.out.println("?:");
	nombre = lectura.readLine();
	ProcesarConsultas.procesarconsultas(nombre);
	File file=new File("/home/esteban/pRGA 2/Programada2/src/tp2/docu");
	Sca scanner = null;
	try{
     
     
     scanner = new Sca( new java.io.FileReader(file) );
     while ( !scanner.zzAtEOF ) scanner.yylex();
     
     
	}catch(Exception e){
		 
		 
     }
	
	
	
	
	}

	
     







}
