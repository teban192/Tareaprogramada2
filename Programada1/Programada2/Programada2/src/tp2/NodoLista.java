package tp2;

class NodoLista {
    Object codproducto;
    Object cantidad;
    NodoLista siguiente;

	 NodoLista (Object  valor){  
		 codproducto =valor;
		 
	     siguiente = null;  
	  }

	NodoLista (Object valor,NodoLista signodo){   
		codproducto = valor;
		siguiente = signodo; 
	}
	
	NodoLista (Object  valor,Object valor2,Object valor3){  
		 codproducto =valor;
		 cantidad=valor2;
		 
	     siguiente = null;  
	  }
	
	NodoLista (Object valor,Object valor2,Object valor3, NodoLista signodo){   
		codproducto = valor;
		cantidad=valor2;
	    siguiente = signodo; 
	}
	
	

	Object getObject(){
		return codproducto; 
	}

	NodoLista getnext(){
		return siguiente; 
	}
}