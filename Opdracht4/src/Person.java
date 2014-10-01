
public class Person {
	
	private String name;
	private DateSet data = new DateSet();
	
	public Person(String nm){
		name  = nm;
		
	}
	
	public void add(Date date){
		data.add(date);
	}
	
	public String getName(){
		return name;
	}
	
	public DateSet getDateSet(){
		return data;
	}
	
	public String toString(){
		return this.name + ":" + "\n" + data.toString();
		
	}
	
	@Override
	public boolean equals(Object obj) {
        
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        
       Person object = (Person) obj;
        if(this.data.equals(object.data))
        	return true;
                     
	return false;
	} 
}
