package hu.ak_akademia.dssprojektakakademia;

import java.util.List;

public class Disease {

	String name;
	List<Symptom> symptoms;
	final String treatment;
	

	public Disease(String name, List<Symptom> symptoms, String treatment) {
		super();
		this.name = name;
		this.symptoms = symptoms;
		this.treatment = treatment;
		
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Symptom> getSymptoms() {
		return symptoms;
	}


	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}


	public String getTreatment() {
		return treatment;
	}
}
