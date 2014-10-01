import java.util.ArrayList;
public class DatePicker {

	ArrayList<Person> lijst = new ArrayList<>(); // moet er geen Person in staan ?
	
	
	public DatePicker(){}
	
	/**
	 * Adds a person object to arraylist lijst
	 * @param p
	 */
	public void add(Person p){
		lijst.add(p);
	}
	
	
	/**
	 * Checks if there are dates that are present in all persons' DatSets.
	 * Returns a DateSet with these dates
	 * @return DateSet uit
	 */
	public DateSet commonDates(){
		DateSet uit = lijst.get(0).getDateSet();
		
		for (int i = 1 ; i < lijst.size() ; i++){
			uit = uit.intersection(lijst.get(i).getDateSet());
				
		}
		return uit;
		}
	
	
	/**
	 * Returns a String of commonDates()
	 * @return String
	 */
	public String toString(){
		DateSet uit = commonDates();
		String res = "A list of dates on which each person is available" + "\n" + uit.toString() ;
		return res;
	}
}
