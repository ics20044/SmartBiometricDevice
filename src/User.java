import java.util.*;

public class User {
	
	private String firstName;
	private String surname;
	private String amka;
	private ArrayList<Metric> listOfAllTimeMetrics = new ArrayList<Metric>();
	private ArrayList<String> homePhoneNumbers = new ArrayList<String>();
	
	/*Constructor of User*/
	public User(String f, String s, String a)
	{
		firstName = f;
		surname = s;
		amka = a;
		
	}
	
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
	
	public void informForSituation(Metric controllMetric){
		if(controllMetric.getSituationOfTheMetric() == "medium")
		{
			sendNotification.SendingSMSToHisHomes();
		}
		else if(controllMetric.getSituationOfTheMetric() == "dangarous")
		{
		//	sendNotification.sendGmailToTheManagementCenter(, , , , ); prepei na baloume times
		}
	}

}
