
public class Cirkel {

	private Punt  middelPunt;
	private double straal;

	public Cirkel(double st, Punt.mp){
		pre = st;
		if(pre > 0){
			middelPunt = mp;
			straal = st;
		} else {
			middelPunt = mp;
			straal = -1;
		}
		
	}
	
	public static double getMiddelpunt(){
		return middlePunt;
	}
	
	public static double getStraal(){
		return punt2;
	}
	
	public static String toString(){
		return String(Cirkel);
	}
};
