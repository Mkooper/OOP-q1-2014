

 public class Date{
	/**
	 * Holds string representation of a date
	 */
	private String date;
 
		/**
		 * Date constructor
		 * @param dt is of String type
		 */
 		public Date(String dt){
 			date = dt;
 		}
 		
 		
 		/**
 		 * Returns string representation of this
 		 */
 		public String toString(){
 			return date;
 		}
 		
 	/**
 	 * Overrides default .equals method
 	 * Checks if other object is not this, then compares strings
 	 */
 	@Override
 	public boolean equals(Object obj) {
 		
 		 if (obj == null || obj.getClass() != this.getClass()) 
	            return false;
	        
	        
	        Date object = (Date) obj;
        
       if(this.toString().equals(object.toString()))
        return true;
        
       return false;
 	}



 }
 
