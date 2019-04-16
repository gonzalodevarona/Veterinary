/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 15 APRIL 2019
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
*/

package model;
import java.util.*;

public class Pet{

//CONSTANTS

public final static String DOG = "Dog";
public final static String CAT = "Cat";
public final static String BIRD = "Bird";
public final static String OTHER = "Other";



//ATTRIBUTES
private String name;
private String type;
private double age;
private double weight;
private double height;
private double bmi;





//RELATIONSHIPS

private ArrayList<MedRecord> record;
private Person owner;



//METHODS

public Pet(String name, String type, double age, double weight, double height, Person owner){
	this.name = name;
	this.type = type;
	this.age = age;
	this.weight = weight;
	this.height = height;
	bmi = calculateBmi();


	this.owner = owner;
	record = new ArrayList<MedRecord>();
}


public  String getName() {
return name;
}


public void setName(String name) {
	this.name = name;
}


public  String getType() {
return type;
}


public void setType(String type) {
	this.type = type;
}



public  double getAge() {
return age;
}


public void setAge(double age) {
	this.age = age;
}



public  double getWeight() {
return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}


public  double getHeight() {
return height;
}

public void setHeight(double height) {
	this.height = height;
}

public  double calculateBmi(){
	return (weight / (height * height));
}


public String showPetsinfo(){
	String reply = "";

	
	reply += "| Pet's name is: "+name+"\n";
	reply += "| Pet's species is: "+type+"\n";
	reply += "| Pet's age is: "+age+" year(s) old\n";
	reply += "| Pet's weight is: "+weight+" Kg\n";
	reply += "| Pet's height is: "+height+" m\n";
	reply += "| Pet's BMI is: "+bmi+" \n";
	reply += "| \n";
	

	return reply;

}


public void addMedRec(MedRecord newMedRec, ArrayList<ReqMed> petsMeds){

	newMedRec.setPetInfo(showPetsinfo());
	newMedRec.setOwnerInfo(owner.contactInfo());
	newMedRec.addMeds(petsMeds);
	newMedRec.calculatingFee();
	record.add(newMedRec);
	

}

public double gatherCosts(){
	double full = 0.0;
	for (int i = 0; i < record.size(); i++ ) {
		full += record.get(i).getFee();
	}
	return full;
}


public String showAllRecords(){
	String reply = "";
	for (int i = 0; i < record.size(); i++ ) {
		reply += record.get(i).medRecordInfo();
	}


	return reply;
}

public void cutItOff(){
	MedRecord aboutToEnd = record.get(record.size() - 1);

	Calendar today = new GregorianCalendar();
			int monthT = today.get(Calendar.MONTH) + 1;
			int dayT = today.get(Calendar.DATE);
			int yearT = today.get(Calendar.YEAR);

			DateIn todaysDate = new DateIn (dayT, monthT, yearT);

	aboutToEnd.setStatus(MedRecord.CLOSED);
	aboutToEnd.setDateOut(todaysDate);

}


public void addStuff2MedRec(int edition, String symptomsEdit, String diagnosysEdit, ArrayList<ReqMed> addedPetsMeds){
	MedRecord recInMatter = record.get(record.size()-1);
	ReqMed medInMatter = null;
	switch (edition) {
		case 1: 
			String previousS = recInMatter.getSymptoms();
			previousS += " | "+symptomsEdit;
			recInMatter.setSymptoms(previousS);
			break;

		case 2: 
			String previousD = recInMatter.getDiagnosys();
			previousD += " | "+diagnosysEdit;
			recInMatter.setDiagnosys(previousD);
			break;

		case 3:
			for (int i = 0 ; i < addedPetsMeds.size() ; i++ ) {
				medInMatter = addedPetsMeds.get(i);
				recInMatter.addNewMed(medInMatter);
				
				

				
			}
			break;
			
		
			
		
			
		
		
	}

	
	

}










 
 } //final