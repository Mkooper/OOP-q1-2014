
public class Opdracht2_2 {

	public static void main(String[] args){
		
		
		//Testcommando's		
		 
	      System.out.println("max(3.0, -4.0)==3.0                        => " + (max(3.0, -4.0)==3.0));  
	  System.out.println("max(1.0,5.0)==5.0                         => " + (max(1.0,5.0)==5.0));  
	System.out.println("max(5.0,1.0)==5.0                         => " + (max(5.0,1.0)==5.0)); 
	           System.out.println("max(2.5,2.5)== 2.5                        => " + (max(2.5,2.5)== 2.5));  
	           System.out.println("abs( -3.0)==3.0                             => " + (abs( -3.0)==3.0));  
	           System.out.println("abs(0.3)==0.3                             => " + (abs(0.3)==0.3));  
	           System.out.println("abs(kwadraat(3.0)-9.000)<1e-3             => " + (abs(kwadraat(3.0)-9.000)<1E-3)); 
	           System.out.println("abs(kwadraat( -3.2) -10.240)<1e -3           => " + (abs(kwadraat(-3.2) -10.240)<1E-3)); 
	           System.out.println("abs(vierkantswortel(3.0) -1.732)<1e-3      => " + (abs(vierkantswortel(3.0) -1.732)<1E-3)); 
	           System.out.println("abs(vierkantswortel(25.0) -5.000)<1e-3     => " + (abs(vierkantswortel(25.0)-5.000)<1E-3)); 
	           System.out.println("abs(vierkantswortel(3.8) -1.949)<1e-3      => " + (abs(vierkantswortel(3.8) -1.949)<1E-3)); 
	           System.out.println("abs(afstand(2.0,3.0,3.0,3.0) -1.000)<1e-3  => " + (abs(afstand(2.0,3.0,3.0,3.0)-1.000)<1E-3)); 
	           System.out.println("abs(afstand(1.0,3.0,2.5,2.5)-1.581)<1e-3  => " + (abs(afstand(1.0,3.0,2.5,2.5)-1.581)<1E-3)); 
	           System.out.println("abs(afstand( -2.0,3.0 ,4.0,1.0) -6.324)<1e-3 => " + (abs(afstand( -2.0,3.0,4.0,1.0)-6.324)<1E-3)); 
	           System.out.println("abs(afstand( -2.0,3.0,1.0,4.0)-3.162)<1e-3 => " + (abs(afstand( -2.0,3.0,1.0,4.0)-3.162)<1E-3)); 
		
		
	}; //EINDE MAIN METHODE //////%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	//retourneert grootste waarde van {x,y}
			public static double max (double x, double y){
				double max = x;
						if(y > x ){
							max = y;
						};
				return max;
			};
			
			
	//Retourneert absolute waarde van x
			public static double abs (double x){
				return Math.abs(x);
			};
			
	//Retourneert x*2
			public static double kwadraat (double x){
				return x*x;
			};
	
	//retourneert vierkantswortel
			public static double vierkantswortel(double x){
				double wortel = 1.0;
				
				// while loop die checkt of het getal
				while(Math.abs(x-wortel*wortel) > 1E-10)
				wortel = ((x + wortel*wortel) / (2*wortel));
				return wortel;
			};
			
	//Afstand tussen punten {x1,y1} en {x2,y2}
			public static double afstand (double x1, double y1, double x2, double y2){
				
				double x = x2-x1;
				double y = y2-y1;
				
				double afstand = vierkantswortel(  (kwadraat(x) + kwadraat(y))  );
				return afstand;
			};
			
		
			   
			 
};
