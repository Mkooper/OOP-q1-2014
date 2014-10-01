
public class Woning {
	
	private int kamers;
	private int vraagPrijs;
	private Adres adres;
	
	public Woning(int k, int v, Adres a){
		kamers = k;
		vraagPrijs = v;
		adres = a;
	}
	
	public String toString(){
		String res = "Deze woning heeft: "
			+ kamers + "kamers" + "\n"	
			+ "Deze woning kost:" + vraagPrijs + "\n"
			+ "Het adres is" + "\n" 
			+ adres.toString();
		return res;
	}
	
	/**
	 * compares if this woning is equal to argument. First checks
	 * if the argument is not itself, then if not null, then loops
	 * through contents and uses Date.equals to compare strings.
	 */
	@Override
	public boolean equals(Object obj) {
        
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        
        Woning object = (Woning) obj;
        
        return (this.kamers == object.kamers &&
        		this.vraagPrijs == object.vraagPrijs && this.adres.equals(object.adres));
        
       
	} 
	
	public boolean kostHooguit(int prijs){
		return(vraagPrijs <= prijs);
	}
}
