/**
 * 
 * 
 * @author Martin Kooper
 *
 */
public class Opdracht3_1 {

	
	/**
	 * 
	 * @param seq
	 */
	
	public static void main(String[] args){
		
		int[] seq2 = {3,12};
		int[] seq6 = {1,2,3,4,5,6};
		
		System.out.print("array seq2 :");  println(seq2);
		System.out.print("array seq6 :"); println(seq6);
		
		verwissel(seq2);
		System.out.print("array seq2 :"); println(seq2);
		
		roteer(seq6);
		System.out.print("array seq6 :"); println(seq6);
		
		roteer(seq6,2);
		
		System.out.print("array seq6 :"); println(seq6);
	}
	
	/**
	 * Checkt of de array niet leeg is
	 * 
	 */
	public static boolean isFilled(int[] seq){   //checkt of de waarde van alle elementen niet nul is, of dat de array niet is gevuld
		double sum = 0;
		for (int i = 0 ; i < seq.length; i++){
			sum = sum + seq[i];
		}
		return ((sum != 0) && seq != null) ;
		
	}
	
	/**
	 * Print inhoud van array
	 * @param seq
	 */
	public static void println(int[] seq){
		for(int i = 0 ; i < seq.length; i++){
			System.out.print(seq[i] + " ");			//print alles op zelfde regel
		}
		System.out.println(); //ga naar volgende regel
	}
	
	public static void verwissel (int[] seq){
		int temp = seq[1];
		seq[1] = seq[0];
		seq[0] = temp;
	}
	
	
	/**
	 * Kopieert array
	 * @param seq
	 * @return
	 */
	public static int[] kopieer (int[] seq){
		int res [] = new int[seq.length]; //declareren nieuwe array
		
			for(int i=0 ; i < res.length ; i++){
				res[i] = seq[i];  //overschrijven van data in lus
			}
		return res;
	}
		
	/**
	 * wrapt inhoudt array rond
	 * @param seq
	 */
	public static void roteer(int [] seq){
		if(isFilled(seq) == true){
		int length = seq.length;
		
		int temp = seq[length - 1]; //laaste element is opgeslagen in tijdelijke variabele
		
		for (int i = length - 1 ; i >= 1 ; i--){ // loopt vanaf positie 1..eind 
			seq[i] = seq[i-1];
		}
		seq[0] = temp; //eerste variabele is de laatste
		}
	}
	
	/**
	 * method overloadinggg
	 * wrapt array n keer rond, gebruikmaken van eerdere methode
	 * @param seq
	 * @param n
	 */
	public static void roteer (int[] seq, int n){
		if(isFilled(seq) == true){
		for (int i = 0 ; i < n ; i++)
			roteer(seq);  // in twee regels :)
		}
	}
}
