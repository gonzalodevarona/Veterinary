/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 1 MAY 2019
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

	/**
	* Constructor method for class Service which is a service offered by the veterinary. <br>
	* @param type The type of service. This param can only be 'b', 'd', 't', 'n' or 's'. It won't get any other char.
	* @param ownerId The pet's owner ID. This param must not be empty.
	* @param petId The pet's name. This param must not be empty.
	* @param clientPet The pet (object). This param must not be null.
	* @param dateJob The date (object) when the service took place. This param must not be null.
	*/

	public Service(char type, String ownerId, String petId, Pet clientPet, DateIn dateJob){
		this.type = type;
		this.ownerId = ownerId;
		this.petId = petId;
		this.clientPet = clientPet;
		this.dateJob = dateJob;
		price = setInitialPrice();
	}

	/**
	* Allows to get the type of a service. <br>
	* @return The type of a service
	*/

	public  char getType() {
		return type;
	}


	/**
	* Allows to change the type of service for a service (object). <br>
	* <b>post:</b> The type of service for a service (object) is changed. 
	* @param type The type of service
	*/

	public void setType(char type) {
		this.type = type;
	}

	/**
	* Allows to get the price of a service. <br>
	* @return The price of a service
	*/
	public  double getPrice() {
		return price;
	}

	/**
	* Allows to get the pet's owner ID of the service (object). <br>
	* @return The pet's owner ID
	*/
	public  String getOwnerId() {
		return ownerId;
	}


	/**
	* Allows to change the pet's owner ID of the service (object). <br>
	* <b>post:</b> The pet's owner ID for a service (object) is changed. 
	* @param ownerId The pet's owner ID
	*/

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}



	/**
	* Allows to get the pet's name from a service (object). <br>
	* @return The pet's name
	*/
	public  String getPetId() {
		return petId;
	}


	/**
	* Allows to change the pet's name of the service (object). <br>
	* <b>post:</b> The pet's name for a service (object) is changed. 
	* @param petId The pet's name
	*/

	public void setPetId(String petId) {
		this.petId = petId;
	}


	/**
	* Allows to get the pet (object) from a service. <br>
	* @return The pet (object)
	*/

	public  Pet getClientPet() {
		return clientPet;
	}


	/**
	* Allows to change the pet (object) of the service (object). <br>
	* <b>post:</b> The pet (object) for a service (object) is changed. 
	* @param clientPet The pet (object)
	*/

	public void setClientPet(Pet clientPet) {
		this.clientPet = clientPet;
	}


	/**
	* Allows to get the date (object) when a service took place. <br>
	* @return The date (object) when a service took place
	*/
	public  DateIn getDateJob() {
		return dateJob;
	}


	/**
	* Allows to change the date (object) when the service took place of the service (object). <br>
	* <b>post:</b> The date (object) when the service took place for a service (object) is changed. 
	* @param dateJob The date (object) when the service took place
	*/

	public void setDateJob(DateIn dateJob) {
		this.dateJob = dateJob;
	}

	/**
	* Allows to assign the cost of a service depending on the type of service. <br>
	* @return The cost of a service
	*/
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


	/**
	* Information of a serviced such as: type of service, service's price, pet's owner ID, pet who got the service's name and date when the service took place.
	* Is organized so it can be  shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing service <br>
	* @see type2String(type)
	* @return The information of a service in a format to be shown to the final user
	*/

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

	/**
	* This method "translates" the type of service from a char to String so it can be understood to the final user.<br>
	* <b>pre:</b> This method must be invocated over an existing service <br>
	* @param type This param can only be 'b', 'd', 't', 'n' or 's'. It won't get any other char.
	* @return The type of service 
	*/
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


	public int dateJobDayOfYear(){
		return (dateJob.calculateDayOfTheYear());
	}



} //end of class