/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 4 MAY 2019
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


	/**
	* Constructor method for class Pet which is a pet offered by the veterinary. <br>
	* @param name The pet's name. This param must not be empty.
	* @param type The pet's species. This param can only be "Dog", "Cat", "Bird" or "Other". It won't get any other String.
	* @param age The pet's age. This param must be greater than zero.
	* @param weight The pet's weight. This param must be greater than zero.
	* @param height The pet's height. This param must be greater than zero.
	* @param owner The person (object) who is the pet's owner. This param must not be null.
	*/

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


	/**
	* Allows to get the pet's name. <br>
	* @return The pet's name
	*/

	public  String getName() {
	return name;
	}


	/**
	* Allows to change the pet's name. <br>
	* <b>post:</b> The pet's name is changed. 
	* @param name The pet's name
	*/
	public void setName(String name) {
		this.name = name;
	}


	/**
	* Allows to get the pet's type. <br>
	* @return The pet's type
	*/

	public  String getType() {
	return type;
	}


	/**
	* Allows to change the pet's type. <br>
	* <b>post:</b> The pet's type is changed. 
	* @param type The pet's type
	*/

	public void setType(String type) {
		this.type = type;
	}



	/**
	* Allows to get the pet's age. <br>
	* @return The pet's age
	*/

	public  double getAge() {
	return age;
	}


	/**
	* Allows to change the pet's age. <br>
	* <b>post:</b> The pet's age is changed. 
	* @param age The pet's age
	*/

	public void setAge(double age) {
		this.age = age;
	}


	/**
	* Allows to get the pet's weight. <br>
	* @return The pet's weight
	*/
	public  double getWeight() {
	return weight;
	}


	/**
	* Allows to change the pet's weight. <br>
	* <b>post:</b> The pet's weight is changed. 
	* @param weight The pet's weight
	*/

	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	* Allows to get the pet's height. <br>
	* @return The pet's height
	*/
	public  double getHeight() {
	return height;
	}


	/**
	* Allows to change the pet's height. <br>
	* <b>post:</b> The pet's height is changed. 
	* @param height The pet's height
	*/

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	* This method allows to calculate the body mass index for a pet. <br>
	* <b>pre:</b> The pet was created before and its attributes height and weight are not null neither height must be zero. <br>
	* <b>post:</b> The BMI is calculated.
	* @return The pet body mass index (BMI).
	* @throws  If the height is zero, so an exception is thrown due to the division on zero does not exist.
	*/

	public  double calculateBmi(){
		return (weight / (height * height));
	}


	/**
	* Information of a pet such as such as name, type, age, weight, height and BMI is organized in a way to fit in a report 
	* format for a medical record so it can shown to the final user<br>
	* @return The information of a pet such as name, type, age, weight, height and BMI in a format to be shown further to the user
	*/

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

	/**
	* Allows to add a new medical record to a pet (object) and its prescribed medications <br>
	* <b>pre:</b> Medical record and prescribed medications have been created before invocating this method. <br>
	* <b>post:</b> An new medical record and prescribed medications are added to a pet (object), and that medical record's cost is calculated
	* @see MedRecord.setPetInfo()
	* @see MedRecord.setOwnerInfo()
	* @see MedRecord.addMeds()
	* @see MedRecord.calculatingFee()
	* @param newMedRec New medical record to be added to a pet
	* @param petsMeds Prescribed medications for the new medical record
	*/
	public void addMedRec(MedRecord newMedRec, ArrayList<ReqMed> petsMeds){

		newMedRec.setPetInfo(showPetsinfo());
		newMedRec.setOwnerInfo(owner.contactInfo());
		newMedRec.addMeds(petsMeds);
		newMedRec.calculatingFee();
		record.add(newMedRec);	

	}


	/**
	* Allows to get the cost of all hospitalizations that a single pet (object) has/had<br>
	* @see MedRecord.getFee()
	* @return The cost of all hospitalizations that a single pet (object) has/had
	*/

	public double gatherCosts(){
		double full = 0.0;
		for (int i = 0; i < record.size(); i++ ) {
			full += record.get(i).getFee();
		}
		return full;
	}


	/**
	* Allows to get a report of every medical record information that a single pet (object) has/had<br>
	* @see MedRecord.medRecordInfo()
	* @return A report of every medical record that a single pet (object) has/had
	*/

	public String showAllRecords(){
		String reply = "";
		for (int i = 0; i < record.size(); i++ ) {
			reply += record.get(i).medRecordInfo();
		}
		return reply;
	}


	/**
	* Allows to close the actual medical record by setting its status to close and setting the closing date <br>
	* <b>pre:</b> The actual medical record was created before and its status is open
	* <b>post:</b> The medical record is closed 
	* @see MedRecord.setStatus(MedRecord.CLOSED)
	* @see MedRecord.setDateOut(todaysDate)
	*/

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
	* @param symptomsEdit The new symptom presented. This param must be not null.
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
	* @param diagnosysEdit The notes of possible diagnostic. This param must be not null.
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
	* @see MedRecord.addNewMed(medInMatter)
	* @param medsName The medicine name. This param must be not null.
	* @param medsDose The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned. This param must be not null.
	* @param medsPrice The medicine cost by each dose. This param could be empty.
	* @param medsFrecuency The frequency of medicine application. This param could be empty.
	* @return A message that indiques if medicine was added to the patient clinic story
	*/

	public String addMedicine(String medsName, double medsDose, double medsPrice, String medsFrecuency){
		ReqMed medInMatter = new ReqMed (medsName, medsDose, medsPrice, medsFrecuency);
		MedRecord recInMatter = record.get(record.size()-1);
		recInMatter.addNewMed(medInMatter);
		return "Prescribed medication successfully added!";
	}


	/**
	* Allows to count how many hospitalizations does a single pet (object) has/had
	* @return Number of hospitalizations for a single pet
	*/

	public int countMyHospitalizations(){
		int reply = 0;

		if(record != null){
			reply += record.size();
		}
		return reply;
	}


	/**
	* This method allows to get the added price for a specific service or the price of every service added<br>
	* @see feeServices()
	* @param serviceSelection Means what service's price is needed, 0 means the price of all services added
	* @return The added price of a specific service or the price of every service 
	*/

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


	/**
	* This method allows to get the added price of all services rendered of a specific type of service <br>
	* @see Service.getType()
	* @see Service.getPrice()
	* @param serviceChar The type of service
	* @return The price of a specific service or the price of every service added
	*/

	public double feeServices(char serviceChar){
		double reply = 0.0;

		for (int i = 0; i<services.size() ; i++ ) {
			if(serviceChar == services.get(i).getType()){
				reply += services.get(i).getPrice();
			}	
		}
		return reply;
	}




	/**
	* When registering a new service, this method allows to add a service to the <i>ArrayList<Service></i> that a pet has. <br>
	* <b>pre:</b> The service(object) has been created before invocating this method. <br>
	* <b>post:</b> The service is added to the <i>ArrayList<Service></i> that a pet has
	* @param newService The service. This param must not be null
	*/
	public void addService(Service newService){
		services.add(newService);
	}



	/**
	* Allows to calculate the weekly income after a given initial date<br>
	* @param initialDate The initial date to take as the beginning of the week. This param must not be null
	* @return The weekly income after the initial date
	*/

	public double weeklyIncome(DateIn initialDate){
		double reply = 0;
		int dayOfYearGiven = initialDate.calculateDayOfTheYear();
		int dayOfYearCase = 0;

		for (int i = 0; i < services.size() ; i++ ) {
			Service serviceInMatter = services.get(i);

			if(initialDate.getYear() == serviceInMatter.getDateJob().getYear()){
				dayOfYearCase = services.get(i).dateJobDayOfYear();
				if((dayOfYearCase - dayOfYearGiven) <= 7){

					reply += services.get(i).getPrice();

				}
			}
			
		}

		return reply;
	}



	/**
	* Allows to calculate the how many services have been rendered in a week after a given initial date<br>
	* @param initialDate The initial date to take as the beginning of the week. This param must not be null
	* @return How many services have been rendered in a week after a given initial date
	*/

	public int weeklyIncomeCounter(DateIn initialDate){
		int reply = 0;
		int dayOfYearGiven = initialDate.calculateDayOfTheYear();
		int dayOfYearCase = 0;

		for (int i = 0; i < services.size() ; i++ ) {
			Service serviceInMatter = services.get(i);

			if(initialDate.getYear() == serviceInMatter.getDateJob().getYear() || (serviceInMatter.getDateJob().getYear() - initialDate.getYear()) == 1){
				dayOfYearCase = services.get(i).dateJobDayOfYear();
				if((dayOfYearCase - dayOfYearGiven) <= 7){

					++reply;

				}
			}
			
		}

		return reply;
	}



	public ArrayList<Service> serviceBetweenDates(DateIn initialDate, DateIn finalDate){
		ArrayList<Service> myServices = new ArrayList<Service>();

		int initialDateInYear = initialDate.calculateDayOfTheYear();
		int finalDateInYear = finalDate.calculateDayOfTheYear();

		for (int i = 0; i < services.size() ; i++ ) {

			int dayOfYearOfServiceInMatter = services.get(i).getDateJob().calculateDayOfTheYear();

			if (dayOfYearOfServiceInMatter >= initialDateInYear && dayOfYearOfServiceInMatter <= finalDateInYear) {
				myServices.add(services.get(i));
				System.out.println(services.get(i).toString());
			}
		}
		
		return myServices;
	}





 } //end of class