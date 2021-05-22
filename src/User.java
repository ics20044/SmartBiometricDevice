import java.util.*;

public class User {
	
	private String firstName;
	private String surname;
	private String amka;
	private ArrayList<Metric> listOfAllTimeMetrics = new ArrayList<Metric>();
	private ArrayList<String> homePhoneNumbers = new ArrayList<String>();
	
	
	/*Add a measurement to the list of measurements recorded for the individual.*/
	public void addMetric(Metric theMetrci) {
		listOfAllTimeMetrics.add(theMetrci);
	}
	
	
	/*Added a phone number to the list of his family numbers.*/
	public void addPhoneNumber(String theNumber) {
		
		if (!homePhoneNumbers.contains(theNumber)) {
			homePhoneNumbers.add(theNumber);
		}
	}

}
