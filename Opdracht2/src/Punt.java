
public class Punt {

	static double x;
	static double y;
	
	public Punt (double xCoordinaat, double yCoordinaat){
		x = xCoordinaat;
		y = yCoordinaat;
	}
	
	//methode 1
	public static double getX(){
		
		return x;
	}
	
	//methode 2
	public static double getY(){
		return y;
	}
	
	//tostring methode
	public String toString() {
		String res  = "<Punt(";    //waarom niet in 1 regel?
		res = res + x + "," + y + ")>";
		return res;
	}
	
	//transleer functie
	public static void transleer (double dx, double dy){
		x = + dx;
		y = y + dy;
	};

	
	//asstand IS DIT GOED?
	public static double afstand (Punt punt){
		return Punt.x - Punt.y;
	}
	
	public static boolean equals (Punt punt){
		return (Punt.x == Punt.y);
	}
	//er scheelt hier iets aan
}
