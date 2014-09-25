
public class Punt {

	private double x;
	private double y;
	
	public Punt (double xCoordinaat, double yCoordinaat){
		x = xCoordinaat;
		y = yCoordinaat;
	}
	
	//methode 1
	public double getX(){
		
		return x;
	}
	
	//methode 2
	public double getY(){
		return y;
	}
	
	//tostring methode
	public String toString() {
		String res  = "<Punt(";    //String res wordt gebruikt om het datatype tot string te converteren zonder externe methode
		res = res + x + "," + y + ")>";
		return res;
	}
	
	//transleer functie
	public void transleer (double dx, double dy){
		x = x + dx;
		y = y + dy;
	};

	
	// Afstand gebruikt de methode uit Opdracht2_1 en berekent een pythagoriaanse afstand.
	public double afstand (Punt that){
		return Opdracht2_1.f1((this.x - that.x)*(this.x - that.x) + (this.y - that.y)*(this.y - that.y));
	}
	
	//het gelijkt aan object. 
	public boolean equals (Object other){
		
		if(other instanceof Punt) {
			Punt that = (Punt) other;
		return this.x == that.x && this.y == that.y;
			
		} else{
			return false;
		}
		
	}
	
}
