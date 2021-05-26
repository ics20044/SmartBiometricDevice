import java.util.ArrayList;

public class Metric {
	
	private double oxygenMeasurement; 
	private double systolicPressure;
	private double diastolicPressure;
	private double heartBeats;
	private double meanArterialPresure;
	private String situationOfTheMetric; // "good", "medium", "dangerous"
	private int sumForMedium = 0; //In the 20 consecutive moderate measurements, the relatives of the person are notified.



	 //This method is the constructor of Metric.
	 public Metric(double o, double s, double d, double h)
	 {
		 meanArterialPresure = (s + 2.0*d)/3.0;
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

	public double getOxygenMeasurement() {
		return oxygenMeasurement;
	}

	public void setOxygenMeasurement(double oxygenMeasurement) {
		this.oxygenMeasurement = oxygenMeasurement;
	}

	public double getSystolicPressure() {
		return systolicPressure;
	}

	public void setSystolicPressure(double systolicPressure) {
		this.systolicPressure = systolicPressure;
	}

	public double getDiastolicPressure() {
		return diastolicPressure;
	}

	public void setDiastolicPressure(double diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}

	public double getHeartBeats() {
		return heartBeats;
	}

	public void setHeartBeats(double heartBeats) {
		this.heartBeats = heartBeats;
	}

	public int getSumForMedium() {
		return sumForMedium;
	}

	public void setSumForMedium(int sumForMedium) {
		this.sumForMedium = sumForMedium;
	}

	public void setSituationOfTheMetric(String situationOfTheMetric) {
		this.situationOfTheMetric = situationOfTheMetric;
	}

	public double getMeanArterialPresure() {
		return meanArterialPresure;
	}

	public void setMeanArterialPresure(double meanArterialPresure) {
		this.meanArterialPresure = meanArterialPresure;
	} 
}