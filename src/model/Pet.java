/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 29 APRIL 2019
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
	private ArrayList<Service> services;


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
		services = new ArrayList<Service>();
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

	/**
	* This method allows to calculate the body mass index for a pet. <br>
	* <b>pre:</b> The pet was created before and its attributes height and weight are not null neither height must be zero. <br>
	* <b>post:</b> The BMI is calculated.
	* @return The pet body mass index.
	* @throws  If the height is zero, so an exception is thrown due to the division on zero does not exist.
	*/


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



	/**
	* This method allows to add a new symptom presented during the hospitalization at the patient stories. <br>
	* <b>pre:</b> The patient clinic story must be not null. <br>
	* <b>post:</b> A new symptom were added to the patient clinic story. <br>
	* @param The new symptom presented. This param must be not null.
	*/

	public void addSymptoms(String symptomsEdit){
		MedRecord recInMatter = record.get(record.size()-1);
		String previousS = recInMatter.getSymptoms();
		previousS += " | \n"+symptomsEdit;
		recInMatter.setSymptoms(previousS);
	}


	/**
	* This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories. <br>
	* <b>pre:</b> The patient clinic story must be not null. <br>
	* <b>post:</b> New notes were added to the possible diagnostic in the patient clinic story.
	* @param The notes of possible diagnostic. This param must be not null.
	*/

	public void addDiagnosys(String diagnosysEdit){
		MedRecord recInMatter = record.get(record.size()-1);
		String previousD = recInMatter.getDiagnosys();
		previousD += " | \n"+diagnosysEdit;
		recInMatter.setDiagnosys(previousD);
	}


	/**
	* This method allows to add new medicines that were prescription during the hospitalization at the patient stories. <br>
	* <b>pre:</b> The patient clinic story must be not null. <br>
	* <b>post:</b> New medicines were added to the patient clinic story. <br>
	* @param The medicine name. This param must be not null.
	* @param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
	* @param The medicine cost by each dose. This param could be empty.
	* @param The frequency of medicine application. This param could be empty.
	* @return A message that indiques if medicine was added to the patient clinic story
	*/

	public String addMedicine(String medsName, double medsDose, double medsPrice, String medsFrecuency){
		ReqMed medInMatter = new ReqMed (medsName, medsDose, medsPrice, medsFrecuency);
		MedRecord recInMatter = record.get(record.size()-1);
		recInMatter.addNewMed(medInMatter);
		return "Prescribed medication successfully added!";
	}


	public int countMyHospitalizations(){
		int reply = 0;

		if(record != null){
			reply += record.size();
		}

		return reply;
	}


	public double servicesFees(int serviceSelection){
		double reply = 0.0;
		switch (serviceSelection) {
			case 0:
				reply += feeServices(Service.BATH);
				reply += feeServices(Service.BATHDOM);
				reply += feeServices(Service.TEETH);
				reply += feeServices(Service.NAILS);
				reply += feeServices(Service.SHOT);
				break;
			case 1:
				reply = feeServices(Service.BATH);
				break;
			case 2:
				reply = feeServices(Service.BATHDOM);
				break;
			case 3:
				reply = feeServices(Service.TEETH);
				break;
			case 4:
				reply = feeServices(Service.NAILS);
				break;
			case 5:
				reply = feeServices(Service.SHOT);
				break;	
		}
		return reply;
	}


	public double feeServices(char serviceChar){
		double reply = 0.0;

		for (int i = 0; i<services.size() ; i++ ) {
			if(serviceChar == services.get(i).getType()){
				reply += services.get(i).getPrice();
			}	
		}
		return reply;
	}

	public void addService(Service newService){
		services.add(newService);
	}



	public ArrayList<Service> serviceBetweenDates(DateIn initialDate, DateIn finalDate){
		ArrayList<Service> myServices = new ArrayList<Service>();

		int initialDateInYear = initialDate.calculateDayOfTheYear();
		int finalDateInYear = finalDate.calculateDayOfTheYear();

		for (int i = 0; i < services.size() ; i++ ) {

			int dayOfYearOfServiceInMatter = services.get(i).getDateJob().calculateDayOfTheYear();

			if (dayOfYearOfServiceInMatter >= initialDateInYear && dayOfYearOfServiceInMatter <= finalDateInYear) {
				myServices.add(services.get(i));
			}
		}
		
		return myServices;
	}





 } //final