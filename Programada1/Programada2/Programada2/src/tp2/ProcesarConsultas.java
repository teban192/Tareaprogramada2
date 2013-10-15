package tp2;

public class ProcesarConsultas extends ProcesarBaseConocimientos {


	public static void procesarconsultas(String a)	 {
		  
	      NodoLista q=pilita.PrimerNodo;
	      while (q!=null){
	      
	    	  if (a.equals(q.codproducto))
	    	  {
	    		System.out.println("Yes");
	    		break;
	    		  
	    	  }
	          q=q.siguiente;


	      }


	}

}
