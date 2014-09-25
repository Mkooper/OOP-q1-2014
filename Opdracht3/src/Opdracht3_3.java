
public class Opdracht3_3 {

	public static void main(String[] args){
		StringLijst sLijst = new StringLijst(3);
		StringLijst tLijst = new StringLijst(5);
		
		sLijst.add("Lachen");
		sLijst.add("gieren");
		sLijst.add("brullen");
		
		sLijst.get(2);
		sLijst.get(-2);
		sLijst.get(11);
		
		sLijst.set(2, "Teun");
		
		sLijst.index("Lachen");
		sLijst.index("hoeren");
		
		sLijst.contains("gieren");
		sLijst.contains("jahaa");
		
		sLijst.equals(tLijst);
		
		
		sLijst.equals(tLijst);
		System.out.println(sLijst.equals(sLijst));
		System.out.println(sLijst.toString());
	}
}
