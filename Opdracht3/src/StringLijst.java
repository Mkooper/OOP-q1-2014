
public class StringLijst {
private String[] element;
private int aantal;


	public StringLijst(int n){
		aantal = 0;
		
		if(n<0)
			 element = new String[n];
		else
			element = new String[0];
		
	}

	public void add(String el){
		if(aantal<element.length){
			element[aantal] = el;
			aantal++;
		}
	}
	
	public String get(int i){
		if(0 <= i && i < aantal)
			return element[aantal];
		else
			return null;
	}
	
	public void set(int i, String el){
		if(0 <= i && i < aantal)
			element[i] = el;
	}
	
	public int index(String el){
		
		for (int j = 0; j < element.length; j++) {
			if(el.equals(element[j]))
				return j;
			}
		return -1;
			
	}
	
	public boolean contains(String el){
		for (int i = 0; i < element.length; i++) {
			if(el.equals(element[i]))
			return true;
		}
		return false;
	}
	
	public int getSize(){
		return aantal;
	}
	
	public boolean equals(Object other){
		boolean res = false;
		if(other instanceof StringLijst){
			StringLijst that = (StringLijst) other;
			int i = 0;
			while(this.element[i].equals(that.element[i]) && i < aantal)
				i++;
			res = (i == aantal);
		}
		return res;
	}
	
	public String toString(){
		String res  = "<Stringlijst(";
		for (int i = 0; i < element.length; i++) {
			res = res + element[i] + ",";
		}
		res = res + ")>";
		return res;
	}
}






