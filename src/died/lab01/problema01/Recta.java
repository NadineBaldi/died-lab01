package died.lab01.problema01;

public class Recta {
	private Punto punto1;
	private Punto punto2;
	
	
	public Recta(Punto p1, Punto p2) { //constructor
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	public Recta() { //constructor
		Punto p1 = new Punto(2,2);
		Punto p2 = new Punto (8,8);
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	//métodos
	
	public float pendiente() {
		
		float m;
		
		m = ((this.punto2.getY()-this.punto1.getY()) / (this.punto2.getX()-this.punto1.getX()));
		
		return m;
	}
	
	public boolean paralelas(Recta otraRecta) {
		
		if (this.pendiente() == otraRecta.pendiente()) {
			return true;
		} else 
			return false;
		
	}
	
	public boolean equals(Object otraRecta) {
		
		Recta r = (Recta) otraRecta;
		
		if (getClass() != otraRecta.getClass()) { //veo si es instancia de la clase Recta
			return false;
		}
		
		float m2;
		
		m2 = ((this.punto2.getY()-r.punto2.getY()) / (this.punto2.getX()-r.punto2.getX()));
		
		if (this.pendiente() != m2) {
			return false;
		}
		
		return true;
		
	}

}
