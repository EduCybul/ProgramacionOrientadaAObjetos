package prJarras;

public class Jarra {
	
	public int capacidad;
	public int contenido;
	
	
	public Jarra(int cap){
		
		if(cap<=0) {
			
			throw new RuntimeException("Capacidad erronea");
			
		}
		
		capacidad=cap;
		contenido=0;
		
	}
	
	public void llena() {
		
		contenido=capacidad();
	}
	
	public void vacia() {
		
		contenido=0;
		
	}
	public void llenaDesde(Jarra J) {
		
		
	}

	public int capacidad(){
		
		return capacidad;
		
	}
	public int contenido(){
		
		return contenido;
		
	}
	@Override
	public String toString() {
		
		return "J("+capacidad+","+contenido+")";
		
	}
	
	
}
