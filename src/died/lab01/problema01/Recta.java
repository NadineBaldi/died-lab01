package died.lab01.problema01;

public class Recta {
	
	private Punto pto1;
	private Punto pto2;
	
	//constructores
	
	public Recta(Punto p1, Punto p2) {
		this.pto1 = p1;
		this.pto2 = p2;
	}
	
	public Recta() { //ver mejor esto
		Punto p1 = new Punto(2,2);
		Punto p2 = new Punto(8,8);
		this.pto1 = p1;
		this.pto2 = p2;
	}
	
	//métodos
	
	public Punto getPto1() {
		return pto1;
	}

	public void setPto1(Punto pto1) {
		this.pto1 = pto1;
	}

	public Punto getPto2() {
		return pto2;
	}

	public void setPto2(Punto pto2) {
		this.pto2 = pto2;
	}
	
	public float pendiente() {
		float m;
		
		m = ((this.getPto2().getY() - this.getPto1().getY()) / (this.getPto2().getX() - this.getPto1().getX()));
		
		return m;
	}

	public boolean paralelas(Recta otraRecta) {
		
		if (this.pendiente() == otraRecta.pendiente()) {
			return true;
		} else 
			return false;
	}
	
	public boolean equals(Object otraRecta) {
		
		Recta r = (Recta)otraRecta; 
		float m2;
		
		m2 = ((this.getPto1().getY() - r.getPto2().getY()) / (this.getPto1().getX() - r.getPto2().getX()) );
		
		if (getClass() == r.getClass()) {
			
			if (this.pendiente() == m2) {
				return true;
			} else 
				return false;
		} else 
			return false;
	}

}