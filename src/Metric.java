import java.util.ArrayList;

public class Metric {
	
	private double oxygenMeasurement; //Normal values: 94-100 (%)  Moderate values: 81-93  Dangerous values: <=80
	private double systolicPressure;
	private double diastolicPressure;
	private double heartBeats;
	private String situationOfTheMetric; // "good", "medium", "dangerous"
	private int sumForMedium = 0; //In the 20 consecutive moderate measurements, the relatives of the person are notified.



	 //This method is the constructor of Metric.
	 public Metric(double o, double s, double d, double h)
	 {
		 oxygenMeasurement = o;
		 systolicPressure = s;
		 diastolicPressure = d;
		 heartBeats = h;
	 }

	 //This method estimates the situation of the Metrics.
	 public String estimateSituationofMetric()
	 {

		 if(oxygenMeasurement<=100 && oxygenMeasurement>=94)
		 {
			 situationOfTheMetric = "good";
		 }
		 else if(oxygenMeasurement>=90)
		 {
			 sumForMedium++;
		 }
		 else
		 {
			 situationOfTheMetric = "dangerous";
			 return situationOfTheMetric;
		 }
		 if(systolicPressure<15)
		 {
			 situationOfTheMetric = "good";
		 }
		 else if(systolicPressure<20)
		 {
			 sumForMedium++;
		 }
		 else
		 {
			 situationOfTheMetric = "dangerous";
			 return situationOfTheMetric;
		 }
		 
		 double meanArterialPresure = (systolicPressure + 2*diastolicPressure)/3;
		 if(meanArterialPresure<7)
		 {
			 situationOfTheMetric = "dangerous";
			 return situationOfTheMetric;
		 }
		 else if(meanArterialPresure<=8)
		 {
			 sumForMedium++;
		 }
		 else
		 {
			 situationOfTheMetric = "good";
		 }
		 if(heartBeats>=60 && heartBeats<=80)
		 {
			 situationOfTheMetric = "good";
		 }
		 else if(heartBeats>80 && heartBeats<120)
		 {
			 sumForMedium++;
		 }
		 else
		 {
			 situationOfTheMetric = "dangerous";
			 return situationOfTheMetric;
		 }
		 
		 if(sumForMedium>=20) {
			 sumForMedium = 0;
			 return "medium";
		 }
		 
		 return situationOfTheMetric;
	 }
	 
	 
	 public String getSituationOfTheMetric() { return situationOfTheMetric;}
	 
}