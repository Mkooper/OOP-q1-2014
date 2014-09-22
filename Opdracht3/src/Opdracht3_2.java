
public class Opdracht3_2 {

	public static void main(String[] args) {
		int[] seq = {2,6,4,36,7,8,16,97,33};
		
		Opdracht3_1.println(seq);
		System.out.println("Max getal is: " + max(seq));
		System.out.println("Het array bevat getal 8: " + bevat(seq,8));
		System.out.println("getal 8 zit op plek: " + index(seq,8));
		System.out.println("getal 8 is een priemgetal: " + isPriem(8));
		
		System.out.print("5 is een priemgetal: ");
		System.out.println(isPriem(5));
		System.out.print("88 is een priemgetal: ");
		System.out.println(isPriem(88));
		
		System.out.print("de priemgetallen zijn: ");
		
		Opdracht3_1.println(priemgetallenIn(seq)); //waarom print hij niet?
		
		System.out.print("de priemgetallen tot 20 zijn: ");
		
		Opdracht3_1.println(priemgetallenTot(20));
		
		
	}
	
	
	/** 
	 * retourneert maximale waarde in array
	 * @param seq
	 * @return
	 */
	public static int max(int[] seq){
		
		int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < seq.length ; i++){
				if (seq[i] > max)
					max = seq[i];
				}
			return max;
			
	}
	
		/**
		 * Retourneert de plek waar element el zich bevindt in het array
		 * @param seq
		 * @param el
		 * @return
		 */
	public static int index(int[] seq, int el){
		 
		int n = seq.length;
		int i = 0;
		
		while((i != n) && (seq[i] != el))
			i++;
		
		if (i == n)
			return -1;
		
		else
			return i;
		
	}
	/**
	 * Kijkt of array element el bevat
	 * @param seq
	 * @param el
	 * @return
	 */
	public static boolean bevat (int[] seq, int el){
		int i = 0;
		while (seq[i] != el && i < seq.length)
			i++;
		return (seq[i] == el);
		
	}
	
	/**
	 * kijkt of el een priemgetal is
	 * @param el
	 * @return
	 */
	public static boolean isPriem(int el){
		
		if(el%2==0)
			return false;
		
		for(int i = 3 ;  i < el ; i+=2){
			
			if(el%i ==0)
	            return false;
			
			}
			return true;
	}
	
	/**
	 * telt het aantal priemgetallen in een array
	 * @param seq
	 * @return
	 */
	public static int telPriemgetallen(int[]seq){
		int tel = 0;
		
		for(int i = 0; i < seq.length; i++){
			if(isPriem(seq[i]) == true)
				tel++;
		} //zijn deze accolades van de for loop nodig?
		return tel;
	}
	
	/**
	 * Returnt een array  met alle priemgetallen van het inputarray
	 * @param seq
	 * @return
	 */
	public static int[] priemgetallenIn(int[]seq){
		
		int[] ar = new int[telPriemgetallen(seq)];
		int tel = 0;
		
		for (int i = 0; i < seq.length; i++) {
			
			if(isPriem(seq[i]) == true){
				ar[tel] = seq[i];
				tel++;
			}
		}
		return ar;	
		}
	
	/**
	 * returnt alle priemgetallen van 0..n in een array
	 * @param n
	 * @return
	 */
	public static int[] priemgetallenTot(int n){
		
		if (n < 0){
			
			return new int[0];
			
		} else{
			int[] temp = new int[n];
			int tel = 0;
			for(int i = 2; i < n ; i++){ //loopt door input array
					if( isPriem(i) == true){
						temp[tel] = i;
						tel++;
						}
			}
			int[] uit = new int[tel];
			
			for(int i = 0; i < tel ; i++) //loopt door input array
				uit[i] = temp[i];
			return uit;
		}
	}
	
}

