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

public class Person{


	//ATTRIBUTES
	private String name;
	private String id;
	private String address;
	private String phone;


	//RELATIONSHIPS
	private ArrayList<Pet> animal;



	//METHODS

	public Person(String name, String id, String address, String phone){
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		animal = new ArrayList<Pet>(); 
	}


	public  String getName() {
	return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public  String getId() {
	return id;
	}


	public void setId(String id) {
		this.id = id;
	}



	public  String getAddress() {
	return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



	public  String getPhone() {
	return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void createPet(ArrayList<Pet> clientsPets){

		animal = clientsPets;

	}



	public String showMyinfo(){
		String reply = "";

		reply += "+--------------------------------------------------------------+\n";
		reply += "| The client's name is: "+name+"\n";
		reply += "| The client's id is: "+id+"\n";
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


	public boolean reviewPet(String theName){

		boolean hasIt = false;

		for (int i = 0; i < animal.size() && !hasIt ; i++ ) {

			if ((animal.get(i).getName()).equalsIgnoreCase(theName)) {

				hasIt = true;
			}

		}

		return hasIt;
	}



	public void startHospitalizePers( String petsName, MedRecord newMedRec, ArrayList<ReqMed> petsMeds){

		Pet pet = givePet(petsName);

		if(pet != null){
			pet.addMedRec(newMedRec, petsMeds);
		}
	}



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


	public double myBill(){
		double bill = 0.0;

		for (int i = 0; i < animal.size(); i++ ) {

			bill += animal.get(i).gatherCosts();
		}

		return bill;
	}

	public int countHospitalizations(){
		int counter = 0;

		for (int i = 0; i < animal.size(); i++ ) {
			counter += animal.get(i).countMyHospitalizations();
		}
		return counter;	
	}

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
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	*pre: The client was created before.
	*post: The address and /or phone number of the client is updated.
	*@param The new address of the client. This param could be empty.
	*@param The new phone number of the client. This param could be empty.
	*/

	public void modifyAddressOrPhone(String newAddress, String newPhone){

		if(newAddress.equalsIgnoreCase("")){
			phone = newPhone;

		} else{address = newAddress;}
	}
		


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


	public double petsFeeServices(int serviceSelection){
		double reply = 0.0;
		for (int i = 0; i<animal.size() ; i++ ) {
			reply += animal.get(i).servicesFees(serviceSelection);	
		}
		return reply;
	}

	public void startServicePers(Pet clientPet, Service newService){
		clientPet.addService(newService);
	}


	public String myPetsServiceReports(DateIn initialDate, DateIn finalDate){
		String reply = "";

		for (int i = 0; i<animal.size() ; i++ ) {

			ArrayList<Service> myServices = animal.get(i).serviceBetweenDates(initialDate, finalDate);

			for (int in = 0; in<myServices.size() ; in++ ) {
			reply += myServices.get(in).toString();
			}
		}
		return reply;
	}








 
 } //final