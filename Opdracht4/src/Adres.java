
public class Adres {

	private String straat;
	private String huisnummer;
	private String postcode;
	private String plaats;
	
	
	/**
	 * Constructor. Takes 4 strings as parameters
	 * @param s
	 * @param h
	 * @param po
	 * @param pl
	 */
	public Adres(String s, String h, String po, String pl){
		straat = s;
		huisnummer = h;
		postcode = po;
		plaats = pl;
	}
	
	/**
	 * returns string representation of this
	 */
	public String toString(){
		return straat + huisnummer + postcode + plaats;
	}
	
	/**
 	 * Overrides default .equals method
 	 * Checks if other object is not this, then compares strings
 	 */
 	@Override
 	public boolean equals(Object obj) {
        
        
       if(this.toString().equals(obj.toString()))
        return true;
        
       return false;
 	}
}
