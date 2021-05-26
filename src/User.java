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
	
	
	public void informForSituation(String situation, Metric theMetric){
		
		if(situation.equalsIgnoreCase("medium")) {
			sendNotification.SendingSMSToHisHomes();
		}
		else if(situation.equalsIgnoreCase("dangerous")) {
			String message = "";
			
			String [] recievers = new String [1];
			recievers[0] = "m.charakopoulos@gmail.com"; //email of the government agency that will receive its notifications.
			
			message = firstName+" "+surname+", with  A.M.K.A: "+amka+"\n"+"Location: ...."+"\n\n"+"Oxygen Measurement: "+theMetric.getOxygenMeasurement()+"\n"+
			"Systolic Pressure: "+theMetric.getSystolicPressure()+"\n"+"Mean Arterial Presure: "+theMetric.getMeanArterialPresure()+"\n"+"Heart Beats: "+theMetric.getHeartBeats();

			sendNotification.sendGmailToTheManagementCenter("itintelligenceuom@gmail.com", "ITintelligence2001", recievers, "’τομο κινδυνεύει", message);
		}
	}

}
