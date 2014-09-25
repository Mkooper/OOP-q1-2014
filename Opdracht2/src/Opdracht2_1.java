import java.util.Scanner;

public class Opdracht2_1 {

	public static void  main(String[] args){
		
			//declareren input variabelen
		double getal1, getal2;
		
		Scanner input = new Scanner(System.in);
		
		//verkrijgen input waarden
		System.out.println("Vul twee getallen in:");
		getal1 = input.nextDouble();
		getal2 = input.nextDouble();
		
		//print de wortel van getal 1
		System.out.println("De wortel van het eerste getal is " + f1(getal1));
		
	}
	
		public static double abs (double getal)
		{		
			if (getal < 0){
				return -1*getal;
			} else {
				return getal;
			}
			//declareren methode van de square root
		} 
		
		public static double f1 (double x) {
			double wortel = 1.0;
			
			// while loop die checkt of het getal
			while (abs(x-wortel*wortel) > 1E-10)
			wortel = ((x + wortel*wortel) / (2*wortel));	
			
		return wortel;
		};
		
		
		//tweede klasse die integraal berekent
		public static double integraal (double og, double bg, double stap){
			double out = 0;
			
			for (double i = og ; i < bg  ; i = i + stap){
				out = out +  f1(i)*stap;
			}
			
			return out; 
			
		};
		
};