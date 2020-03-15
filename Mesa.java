package prJarras;

public class Mesa {

	private Jarra j1,j2;
	
	public Mesa(Jarra a, Jarra b) {
		
		if(a==b) {
			
			throw new RuntimeException("Las dos Jarras iguales");
			
		}
		j1=a;
		j2=b;
			
	}
	public Mesa(int a, int b) {
		
		j1=new Jarra(a);
		j2=new Jarra(b);
		
	}
	public int  capacidad(int j) {
		
		int cap = 0;
		switch (j) {
		case 1: cap=j1.capacidad;
		break;
		case 2: cap=j2.capacidad;
		break;
		}
		
		return cap;
		
	}
	public int contenido(int j) {
		int con=0;
		
		switch (j) {
		case 1: con=j1.contenido;
		break;
		case 2: con=j2.contenido;
		break;
		}
		
		return con;
		
		
		}
	public void llena(int j) {
			
		switch (j) {
		case 1: j1.llena();
		break;
		case 2: j2.llena();
		}
		
		
	}
	public void vacia(int j) {
		
		switch (j) {
		
		case 1: j1.vacia();
		break;
		case 2: j2.vacia();
		break;
		
		}
		
	}
	public void llenaDesde(int j) {
		
		
	}
	@Override
	public String toString() {
		
		return "M("+j1+"),("+j2+"))";
		
	}
	
}
