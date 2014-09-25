
public class StringLijst {
private String[] element;
private int aantal;


	public StringLijst(int n){
		aantal = 0;
		
		if(n > 0)
			 element = new String[n];
		else
			element = new String[0];
		
	}

	public void add(String el){
		if(aantal < element.length){
			element[aantal] = el;
			aantal++;
		}
	}
	
	public String get(int i){
		if(0 <= i && i < aantal)
			return element[i];
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
		
		
		if(other instanceof StringLijst){
			StringLijst that = (StringLijst) other;
			if(aantal == that.getSize()){
				
				for(int i = 0; i < aantal ; i++){
					if(!this.element[i].equals(that.element[i]))
						return false;
				}
				return true;
			} 
		}
		return false;
	}
	
	public String toString(){
		String res  = "<StringLijst[";
		if(aantal > 0){
		for (int i = 0; i < element.length; i++) {
			res = res + element[i];
			if(i < element.length - 1)
				res = res + ",";
		}
		}
		res = res + "]>";
		return res;
	}
}






