
public class Cirkel {

	private Punt middelPunt;
	private double straal;

	public Cirkel(Punt mp, double st){ //Constructor
		middelPunt = mp;
		
		if(st > 0){ 
			
			straal = st;
		} else {
			
			straal = -1;
		}
		
	}
	
	//returnt middelpunt object
	public Punt getMiddelpunt(){
		return middelPunt;
	}
	
	//returnt straal van huidige cirkelobject
	public double getStraal(){
		return this.straal;
	}
	
	//returnt <Cirkel(middelPunt Straal)
	public String toString(){
		String res = middelPunt.toString();
			
		return "<Cirkel(" + res + "," + this.straal + ")>";
	}
	
	public boolean equals (Object other){
		
		if(other instanceof Cirkel) {
			Cirkel that = (Cirkel) other;
		return this.middelPunt.equals(that.middelPunt)  && this.straal == that.straal;
			
		} else{
			return false;
		}
	}
	public double omtrek(){
	return Math.PI*this.straal*2;
	}
	
	public double oppervlakte(){
		return Math.PI*this.straal*this.straal;
	}
	
	//gebruikt transleer functie van punt
	public void transleer(double dx, double dy){
		middelPunt.transleer(dx,dy);
	}
	// gebruikt afstandfunctie van punt. Berekent afstand tussen de 2 punten.
	public boolean overlapt (Cirkel that){
		double afstand = this.middelPunt.afstand(that.middelPunt);
		if (Math.abs(afstand) > (this.straal + that.straal)){
			return false;
		} else{
			return true;
		}
		
	}
}
