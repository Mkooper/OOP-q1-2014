import java.util.ArrayList;




/**
 * 
 * DateSet. Is a collection of Date objects
 * @author M Kooper
 * @version 1.0
 * @Date 25-9-2014
 */
public class DateSet {

	/**
	 * Container variable used to hold Date objects
	 */
	ArrayList<Date> inhoud = new ArrayList<Date>(0);
	
	
	/**
	 * Empty constructor
	 */
		public DateSet(){} 
		
		
		
		/**
		 * Puts date objects in an arraylist called 'inhoud'
		 * @param dt
		 * dt is date object
		 */
		public void add(Date dt){
			inhoud.add(dt);
			
		}
		
		
		/**
		 * Checkts if this DateSet contains input object
		 * @param dt
		 * @return true or false
		 */
		public boolean contains(Date dt){
			
			return inhoud.contains(dt);
			
		}
		
		/**
		 * Finds intersection between two sets
		 * @DateSet is a collection of dates
		 */
		public DateSet intersection (DateSet that){
			DateSet res = new DateSet();
			
			for(Date i : this.inhoud){        //iterates over own contents using enhanced for loop. MEUUI!
				if(that.contains(i)){
					res.add(i);               //adds to output arraylist
				}
				
			}
			return res;
		}
		
		public String toString(){
			String uit = "<Dateset:" ;
			
			for(Date i : this.inhoud){
				uit = uit + i.toString() + " " ;
			}
			uit = uit + ">";
			return uit;
		}
		
		
		/**
		 * compares if this DateSet is equal to argument. First checks
		 * if the argument is not itself, then if not null, then loops
		 * through contents and uses Date.equals to compare strings.
		 */
		@Override
		public boolean equals(Object obj) {
	        if (obj == this) 
	            return true;
	        
	        if (obj == null || obj.getClass() != this.getClass()) 
	            return false;
	        
	        
	        DateSet object = (DateSet) obj;
	        if(this.inhoud.size() !=  object.inhoud.size())
	        	return false;
	        
	        for(int j = 0 ; j < this.inhoud.size() ; j++){
	        	if(!this.inhoud.get(j).equals(object.inhoud.get(j)))
	        		return false;
	        }
	       return true;
		} 
	

} 

		
		

