import java.util.ArrayList;

public class Metric {
	
	private double oxygenMeasurement; //Normal values: 94-100 (%)  Moderate values: 81-93  Dangerous values: <=80
	private double systolicPressure;
	private double diastolicPressure;
	private double heartBeats;
    private User user;
	private String situationOfTheMetric; // "good", "medium", "dangerous"



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
	 int sumMedium = 0; 
	 if(oxygenMeasurement<=100 && oxygenMeasurement>=94)
	 {
		 situationOfTheMetric = "good";
	 }
	 else if(oxygenMeasurement>=90)
	 {
		 situationOfTheMetric = "medium";
		 sumMedium++;
	 }
	 else
	 {
		 situationOfTheMetric = "dangarous";
		 return situationOfTheMetric;
	 }
	 if(systolicPressure<15)
	 {
		 situationOfTheMetric = "good";
	 }
	 else if(systolicPressure<20)
	 {
		 situationOfTheMetric = "medium";
		 sumMedium++;
	 }
	 else
	 {
		 situationOfTheMetric = "dangarous";
		 return situationOfTheMetric;
	 }
	 double meanArterialPresure = (systolicPressure + 2*diastolicPressure)/3;
	 if(meanArterialPresure<7)
	 {
		 situationOfTheMetric = "dangarous";
		 return situationOfTheMetric;
	 }
	 else if(meanArterialPresure<=8)
	 {
		 situationOfTheMetric = "medium";
		 sumMedium++;
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
		 situationOfTheMetric = "medium";
		 sumMedium++;
	 }
	 else
	 {
		 situationOfTheMetric = "dangarous";
		 return situationOfTheMetric;
	 }
	 
	 if(sumMedium>=1)
	 {
		 situationOfTheMetric = "medium";	 
	 }
	 else
	 {
		 situationOfTheMetric = "good";
	 }
	 user.addMetric(this);
	 return situationOfTheMetric;
 }
 
 
 public String getSituationOfTheMetric() { return situationOfTheMetric;}
}