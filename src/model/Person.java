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

public class Person{


	//ATTRIBUTES
	private String name;
	private String id;
	private String address;
	private String phone;


	//RELATIONSHIPS
	private ArrayList<Pet> animal;



	//METHODS

	/**
	* Constructor method for class Person which is a human client of the veterinary and is the owner of as minimum of one pet. <br>
	* @param name The person's name. This param must not be empty.
	* @param id The person's unique ID. This param must not be empty.
	* @param address The person's address. This param must not be empty.
	* @param phone The person's phone number. This param must not be empty.
	*/

	public Person(String name, String id, String address, String phone){
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		animal = new ArrayList<Pet>(); 
	}


	/**
	* Allows to get the person's name. <br>
	* @return The person's name
	*/

	public  String getName() {
		return name;
	}


	/**
	* Allows to change the person's name. <br>
	* <b>post:</b> The person's name is changed. 
	* @param name The person's name
	*/

	public void setName(String name) {
		this.name = name;
	}


	/**
	* Allows to get the person's unique ID. <br>
	* @return The person's unique ID
	*/

	public  String getId() {
		return id;
	}


	/**
	* Allows to change the person's unique ID. <br>
	* <b>post:</b> The person's unique ID is changed. 
	* @param id The person's unique ID
	*/

	public void setId(String id) {
		this.id = id;
	}



	/**
	* Allows to get the person's address. <br>
	* @return The person's address
	*/

	public  String getAddress() {
		return address;
	}


	/**
	* Allows to change the person's address. <br>
	* <b>post:</b> The person's address is changed. 
	* @param address The person's address
	*/

	public void setAddress(String address) {
		this.address = address;
	}



	/**
	* Allows to get the person's phone number. <br>
	* @return The person's phone number
	*/

	public  String getPhone() {
		return phone;
	}


	/**
	* Allows to change the person's phone number. <br>
	* <b>post:</b> The person's phone number is changed. 
	* @param phone The person's phone number
	*/

	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	* When creating a new human client (a person object), this method allows to add its pets the first time. <br>
	* <b>pre:</b> The human client (a person object) has been created before invocating this method. <br>
	* <b>post:</b> The pet(s) has/have been added to a human client (a person object) for the first time.
	* @param clientsPets The pet(s). The size of this param must be greater than zero.
	*/
	public void createPet(ArrayList<Pet> clientsPets){
		animal = clientsPets;
	}



	/**
	* Information of a person such as name, unique ID, address, phone number and its pets info is organized in a format
	* so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing person <br>
	* @see Pet.showPetsinfo()
	* @return The information of a person in a format to be shown to the final user
	*/

	public String showMyinfo(){
		String reply = "";

		reply += "+--------------------------------------------------------------+\n";
		reply += "| The client's name is: "+name+"\n";
		reply += "| The client's ID is: "+id+"\n";
		reply += "| The client's address is: "+address+"\n";
		reply += "| The client's phone number is: "+phone+"\n";
		reply += "+--------------------------------------------------------------+\n";
		reply += "| \n";
		reply += "| The client's pets are:\n";
		reply += "| \n";

		int number = 0;
		for (int i = 0; i < animal.size() ; i++ ) {
			++number;
		reply += "| Pet #"+number+"\n";
		reply += animal.get(i).showPetsinfo();			
		}

		reply += "+--------------------------------------------------------------+\n";

		return reply;

	}



	/**
	* Contact information of a person such as name, unique ID, address and phone number is organized in a format
	* so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing person <br>
	* @return The contact information of a person in a format to be shown to the final user
	*/

	public String contactInfo(){
		String reply = "";

		reply += "+--------------------------------------------------------------+\n";
		reply += "| The owner's name is: "+name+"\n";
		reply += "| The owner's id is: "+id+"\n";
		reply += "| The owner's address is: "+address+"\n";
		reply += "| The owner's phone number is: "+phone+"\n";
		reply += "+--------------------------------------------------------------+\n";


		return reply;
	}



	/**
	* This method allows to get the added price for a specific service or the price of every service added<br>
	* @see Pet.getName()
	* @param theName The given name to make the search in order to know if it matches a pet's name from a single person (object)
	* @return If the given name matches or no to a pet's name from a single person
	*/

	public boolean reviewPet(String theName){
		boolean hasIt = false;

		for (int i = 0; i < animal.size() && !hasIt ; i++ ) {
			if ((animal.get(i).getName()).equalsIgnoreCase(theName)) {
				hasIt = true;
			}
		}
		return hasIt;
	}



	/**
	* Allows to  get the pet (object) and then add a new medical record with its prescribed medications <br>
	* <b>post:</b> A new medical record with its prescribed medications is added to a pet  <br>
	* @see  givePet(petsName)
	* @see Pet.addMedRec(newMedRec, petsMeds)
	* @param petsName The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @param newMedRec The new medical record to be a added to a pet (object).  This param must not be null.
	* @param petsMeds The prescribed medications for the medical record to be a added.
	*/

	public void startHospitalizePers( String petsName, MedRecord newMedRec, ArrayList<ReqMed> petsMeds){
		Pet pet = givePet(petsName);

		if(pet != null){
			pet.addMedRec(newMedRec, petsMeds);
		}
	}



	/**
	* Allows to  get a pet (object) <br>
	* @see Pet.getName()
	* @param theName The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @return  A pet (object) or null if there was no match
	*/

	public Pet givePet(String theName){

		Pet found = null;
		boolean hasIt = false;

		for (int i = 0; i < animal.size() && !hasIt ; i++ ) {

			if ((animal.get(i).getName()).equalsIgnoreCase(theName)) {

				hasIt = true;
				found = animal.get(i);
			}

		}

		return found;
	}


	/**
	* Allows to  get the added cost of every hospitalization that every pet of a single person has had <br>
	* @see Pet.gatherCosts()
	* @return  The added cost of every hospitalization that every pet of a single person has had
	*/

	public double myBill(){
		double bill = 0.0;

		for (int i = 0; i < animal.size(); i++ ) {
			bill += animal.get(i).gatherCosts();
		}
		return bill;
	}



	/**
	* Allows to count how many hospitalizations all pets from a single person has had<br>
	* @see Pet.countMyHospitalizations()
	* @return  How many hospitalizations all pets from a single person  has had
	*/

	public int countHospitalizations(){
		int counter = 0;

		for (int i = 0; i < animal.size(); i++ ) {
			counter += animal.get(i).countMyHospitalizations();
		}
		return counter;	
	}



	/**
	* Allows to  edit a pet's medical record by adding new symptoms, notes to a diagnosys or adding a new prescribed medication to the medical record <br>
	* @see givePet(petsName)
	* @see Pet.addSymptoms(symptomsEdit)
	* @see Pet.addDiagnosys(diagnosysEdit)
	* @see Pet.addMedicine(medsName, medsDose, medsPrice, medsFrecuency)
	* @param petsName The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @param edition A selection of the edition that the user wants to make to an open medical record. This param is always 1,2 or 3.
	* @param symptomsEdit The symptoms edit in case the user want to add more symptoms to a medical record.
	* @param diagnosysEdit The diagnosys edit in case the user want to add more notes to the diagnosys of a medical record.
	* @param medsName The name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @param medsDose The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @param medsPrice The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @param medsFrecuency The given name to make the search in order to know if it matches a pet's name from a single person (object). This param must not be empty.
	* @return An empty message or a message saying that a new prescribed medication has been added, in both cases the edit is done
	*/

	public String locatePet2AddStuff(String petsName, int edition, String symptomsEdit, String diagnosysEdit, String medsName, double medsDose, double medsPrice, String medsFrecuency){
		String reply = "";
		Pet pet = givePet(petsName);

		switch (edition) {
			case 1: pet.addSymptoms(symptomsEdit);
				break;
			case 2: pet.addDiagnosys(diagnosysEdit);
				break;
			case 3: reply += pet.addMedicine(medsName, medsDose, medsPrice, medsFrecuency);
				break;
			
		}

		return reply;
	}



	/**
	*This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	* <b>pre:</b> The client was created before.
	* <b>post:</b> The address and /or phone number of the client is updated.
	*@param newAddress The new address of the client. This param could be empty.
	*@param newPhone The new phone number of the client. This param could be empty.
	*/

	public void modifyAddressOrPhone(String newAddress, String newPhone){

		if(newAddress.equalsIgnoreCase("")){
			phone = newPhone;

		} else{address = newAddress;}
	}
		

	/**
	* Allows to call a method in order to get the added cost of all rendered services or just one specific type of service
	* @see petsFeeServices(serviceSelection)
	* @param serviceSelection The specific type of service that will be used to get the cost of all rendered services. This param is always 1, 2, 3, 4 or 5.
	* @return The cost of all rendered services of an specific type or every type
	*/

	public double allPetsServicesFees(int serviceSelection){
		double reply = 0.0;
		switch (serviceSelection) {
			case 0:
				reply += petsFeeServices(1);
				reply += petsFeeServices(2);
				reply += petsFeeServices(3);
				reply += petsFeeServices(4);
				reply += petsFeeServices(5);
				break;
			default:
				reply = petsFeeServices(serviceSelection);	
				break;	
		}
		return reply;
	}


	/**
	* Allows to get the added cost of one specific type of rendered service
	* @see Pet.servicesFees(serviceSelection)
	* @param serviceSelection The specific type of service.
	* @return The cost of every rendered service of an specific type
	*/

	public double petsFeeServices(int serviceSelection){
		double reply = 0.0;
		for (int i = 0; i<animal.size() ; i++ ) {
			reply += animal.get(i).servicesFees(serviceSelection);	
		}
		return reply;
	}


	/**
	* Allows to add a new rendered service to a pet (object)
	* <b>post:</b> The new rendered service is added to a pet (object).
	* @see Pet.addService(newService)
	* @param clientPet The pet (object) that will have the new rendered service. This param must not be null.
	* @param newService The new rendered service to be added to a pet (object). This param must not be null.
	*/

	public void startServicePers(Pet clientPet, Service newService){
		clientPet.addService(newService);
	}


	public double petsServicesWeeklyIncome(DateIn initialDate){
		double reply = 0;

		for (int i = 0; i< animal.size() ; i++) {
			reply += animal.get(i).weeklyIncome(initialDate);	
		}

		return reply;
	}


	public int petsServicesWeeklyIncomeCounter(DateIn initialDate){
		int reply = 0;

		for (int i = 0; i< animal.size() ; i++) {
			reply += animal.get(i).weeklyIncomeCounter(initialDate);	
		}

		return reply;
	}




	public String myPetsServiceReports(DateIn initialDate, DateIn finalDate){
		String reply = "";

		ArrayList<Service> myServices = new ArrayList<Service>();

		for (int i = 0; i<animal.size() ; i++ ) {

			myServices = animal.get(i).serviceBetweenDates(initialDate, finalDate);
		}

		for (int in = 0; in<myServices.size() ; in++ ) {
			reply += myServices.get(in).toString();
		}

		return reply;
	}








 
 } //end of class