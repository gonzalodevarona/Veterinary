/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 23 APRIL 2019
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
*/
package model;


public class Service{

	public final static double BATHP = 20000.0 ;
	public final static double BATHDOMP = 30000.0;
	public final static double TEETHP = 12000.0;
	public final static double NAILSP = 8000.0;
	public final static double SHOTP = 45000.0;

	public final static char BATH = 'b';
	public final static char BATHDOM = 'd';
	public final static char TEETH = 't';
	public final static char NAILS = 'n';
	public final static char SHOT = 's';


	//ATTRIBUTES
	private char type;
	private double price;
	private String ownerId;
	private String petId;


	//RELATIONSHIPS
	private Pet clientPet;
	private DateIn dateJob;



	//METHODS

	public Service(char type, String ownerId, String petId, Pet clientPet, DateIn dateJob){
		this.type = type;
		this.ownerId = ownerId;
		this.petId = petId;
		this.clientPet = clientPet;
		this.dateJob = dateJob;
		price = setInitialPrice();
	}


	public  char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}

	public  double getPrice() {
		return price;
	}

	public  String getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}



	public  String getPetId() {
		return petId;
	}


	public void setPetId(String petId) {
		this.petId = petId;
	}


	public  Pet getClientPet() {
		return clientPet;
	}


	public void setClientPet(Pet clientPet) {
		this.clientPet = clientPet;
	}


	public  DateIn getDateJob() {
		return dateJob;
	}


	public void setDateJob(DateIn dateJob) {
		this.dateJob = dateJob;
	}

	public double setInitialPrice(){
		double cost = 0.0;

		switch (type) {
			case 'b':
				cost = BATHP;
				break;
			case 'd':
				cost = BATHDOMP;
				break;
			case 't':
				cost = TEETHP;
				break;
			case 'n':
				cost = NAILSP;
				break;
			case 's':
				cost = SHOTP;
				break;	
		}

		return cost;
	}


	public String toString(){
		String reply = "\n";
			   reply += "\n";
			   reply += "+-----------------------------------------------------------------------------+\n";
			   reply += "| Service: "+type2String(type)+"\n";
			   reply += "| Price: "+price+" COP\n";
			   reply += "| Owner ID: "+ownerId+"\n";
			   reply += "| Pet's name: " +petId+ "\n";
			   reply += "| Date of the service: " +dateJob.convertDateToString()+"\n";
			   reply += "+-----------------------------------------------------------------------------+\n";
		return reply;

	}

	public String type2String(char type){
		String word = "";
		switch (type) {
			case BATH:
				word = "Bath";
				break;
			case BATHDOM:
				word = "Bath to go";
				break;
			case TEETH:
				word = "Dental prophylaxis";
				break;
			case NAILS:
				word = "Cutting nails";
				break;
			case SHOT:
				word = "Vaccination";
				break;	
		}
		return word;
	}



} //end