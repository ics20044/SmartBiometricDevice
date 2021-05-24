import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//new smartwatch_window();
		
		User testUser = new User("Minas", "Charakopoulos","3213123");
		
		//Indicative measurements for the test. Normally we will accept them one by one every minute.
		ArrayList<Metric> listOfMetrics = new ArrayList<Metric>();
		Metric metric1 = new Metric(90.0, 12.0, 13.0, 62.0);
		Metric metric2 = new Metric(90.0, 12.0, 13.0, 62.0);
		Metric metric3 = new Metric(90.0, 12.0, 13.0, 300.0);
		Metric metric4 = new Metric(90.0, 12.0, 13.0, 62.0);
		
		listOfMetrics.add(metric1);
		listOfMetrics.add(metric2);
		listOfMetrics.add(metric3);
		listOfMetrics.add(metric4);
		
		try {
			while(true) { //Enter while with true because the software will actually run constantly.
				for(Metric theMetric: listOfMetrics) {
					testUser.addMetric(theMetric);
					String situation = theMetric.estimateSituationofMetric();
					testUser.informForSituation(situation);
					Thread.sleep(5*1000); //60*1000 for the minute
				}
				break;
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
	}

}
