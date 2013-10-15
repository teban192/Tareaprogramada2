package tp2;

class PilaArreglo{
	public NodoLista PrimerNodo;	
	public NodoLista UltimoNodo;
	public NodoLista aux;
	Object Nombre;
	boolean validarVisitados;
	int Elementinser1=1;
	
	//Determina cuando la pila esta vacia
	public boolean VaciaPila () {
		return PrimerNodo == null;
		}
			
	public PilaArreglo (Object s){ 
		Nombre = s;
		PrimerNodo = UltimoNodo =null;
		}
	
	public PilaArreglo(){ 
		this ("Pila");
		}
	
	//Imprime el contenido de la pila
	public void Imprime_pila(){ 
		if (VaciaPila()){
			System.out.println( "vacia" +Nombre);
			}
		else{
			System.out.print( "La  " +  Nombre  +"  es:  ");
			NodoLista Actual = PrimerNodo;
			
			while (Actual != null){
				System.out.print (Actual.codproducto);
				System.out.print ("\n");
				
				Actual=Actual.siguiente;
			}
		}
	}
			
	//Inserta elementos en la pila
	public void Push(Object ElemInser){ 
		if (VaciaPila())
			PrimerNodo = UltimoNodo = new NodoLista(ElemInser);
		else
			PrimerNodo = new NodoLista (ElemInser, PrimerNodo);
	}
	
	//Elimina elementos en la pila
	public NodoLista pop(){ 
		NodoLista ElementoDel = null;
		if  ( VaciaPila()) 
			System.out.println ("No hay elementos");
		ElementoDel = PrimerNodo; 
		if (PrimerNodo.equals (UltimoNodo))
		  PrimerNodo = UltimoNodo = null;
		else
		   PrimerNodo = PrimerNodo.siguiente;
		return ElementoDel;
	}
	
	/*public Object consulta(){
		if (VaciaPila())
			return "";
		else{
			Object dato = PrimerNodo.datos;
			return dato;}
		
	}*/



	//Inserta elementos de tipo arbol en la pila
			public void PushArbolProcesado(NodoLista procesado){ 
				aux=PrimerNodo;
				PrimerNodo=procesado;
				PrimerNodo.siguiente=aux;}
			
			
			//Inserta elementos en la pila
			public void Pushvisitados(Object ElemInser,PilaArreglo visitados){ 
				
				        if (VaciaPila())
							{PrimerNodo = UltimoNodo = new NodoLista(ElemInser);
							  validarVisitados=false;} 
						else
							if (validarVisitados==true){
							aux=visitados.PrimerNodo;
							while (aux!=null){
								if (aux.codproducto.equals(ElemInser))
								 {Elementinser1=Elementinser1+(int)aux.cantidad;// visitas al producto o cadena
								 validarVisitados=false;
								 aux.cantidad=Elementinser1;
								 break;}
								 aux=aux.siguiente;
							}}
						 if (validarVisitados==true)
								 {
								 PrimerNodo = new NodoLista (ElemInser,Elementinser1, PrimerNodo);}
							
			                validarVisitados=true;
			                Elementinser1=1;
			
			}


			
			public void Pushprueba(Object ElemInser,String Elementinser3,PilaArreglo visitados){ 
				
				int integrador2=Integer.parseInt(Elementinser3);
		        if (VaciaPila())
					{PrimerNodo = UltimoNodo = new NodoLista(ElemInser);
					  validarVisitados=false;} 
				else
					if (validarVisitados==true){
					aux=visitados.PrimerNodo;
					while (aux!=null){
						if (aux.codproducto.equals(ElemInser))
						 {visitados.aux.cantidad=integrador2+Integer.parseInt(aux.cantidad.toString());// visitas al producto o cadena
						 validarVisitados=false;
						 ;
						 break;}
						 aux=aux.siguiente;
					}}
				 if (validarVisitados==true)
						 {
						 PrimerNodo = new NodoLista (ElemInser,Elementinser3, PrimerNodo);}
					
	                validarVisitados=true;
	                
	
	}




















}


























