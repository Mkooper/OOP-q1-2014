
public class Opdracht2_4 {

	public static void main(String[] args){
		
		Punt ha = new Punt(3,4);
		
		Cirkel een = new Cirkel(ha, 2);
		
		Cirkel twee = new Cirkel(ha, 2);
		
		System.out.println(een.toString());
		System.out.println(twee.toString());
		
		System.out.println(een.equals(twee));
		System.out.println(een.omtrek());
		System.out.println(een.oppervlakte());
		een.transleer(10, 10);
		System.out.println(een.toString());
		System.out.println(een.overlapt(twee));
	}
}
