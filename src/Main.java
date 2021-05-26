import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//new smartwatch_window();
		
		User testUser = new User("Name", "Surname","amka");
		
		//Indicative measurements for the test. Normally we will accept them one by one every minute.
		ArrayList<Metric> listOfMetrics = new ArrayList<Metric>();
		Metric metric1 = new Metric(95.0, 12.0, 11.0, 64.0); //Good
		Metric metric2 = new Metric(93.5, 12.5, 12.0, 85.0); //Medium
		Metric metric3 = new Metric(88.0, 18.0, 5.4, 123.0); //Dangerous
		Metric metric4 = new Metric(91.0, 11.7, 8.1, 62.0); //Medium
		
		listOfMetrics.add(metric1);
		listOfMetrics.add(metric2);
		listOfMetrics.add(metric3);
		listOfMetrics.add(metric4);
		
		try {
			while(true) { //Enter while with true because the software will actually run constantly.
				for(Metric theMetric: listOfMetrics) {
					testUser.addMetric(theMetric);
					String situation = theMetric.estimateSituationofMetric();
					testUser.informForSituation(situation, theMetric);
					Thread.sleep(5*1000); //60*1000 for the minute
				}
				break;
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
	}

}
