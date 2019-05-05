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

public class MiniRoom { 

	//CONSTANTS
	public final static int ALLROOMS = 8;

	//ATTRIBUTES 
	private boolean available;
	private int numberOfMiniRoom;
	private String pet;
	private String owner;

	//RELATIONSHIPS
	private Pet hostage;


	//METHODS

	/**
	* Constructor method for class MiniRoom which is mini room of the veterinary where pets are hospitalized, there are only 8 mini rooms. <br>
	* @param available The mini room availability.
	* @param numberOfMiniRoom The mini room number.
	* @param pet The mini room's hosts name.
	* @param owner The mini room's host owners name
	* @param hostage The mini room's host (pet object)
	*/

	public MiniRoom(boolean available, int numberOfMiniRoom, String pet, String owner, Pet hostage){
		this.available = available;
		this.numberOfMiniRoom = numberOfMiniRoom;
		this.pet = pet;
		this.owner = owner;
		this.hostage = hostage;
	}


	/**
	* Allows to get mini room's availability. <br>
	* @return Mini room's availability 
	*/

	public  boolean getAvailable() {
		return available;
	}


	/**
	* Allows to change mini room's availability. <br>
	* <b>post:</b> The mini room's availability is changed. 
	* @param available Mini room's availability
	*/

	public void setAvailable(boolean available) {
		this.available = available;
	}


	/**
	* Allows to get the mini room's number. <br>
	* @return Mini room's number 
	*/

	public  int getNumberOfMiniRoom() {
		return numberOfMiniRoom;
	}


	/**
	* Allows to change mini room's number. <br>
	* <b>post:</b> The mini room's number is changed. 
	* @param numberOfMiniRoom Mini room's number
	*/

	public void setNumberOfMiniRoom(int numberOfMiniRoom) {
		this.numberOfMiniRoom = numberOfMiniRoom;
	}


	/**
	* Allows to get the mini room's hosts name. <br>
	* @return Mini room's hosts name 
	*/

	public  String getPet() {
		return pet;
	}


	/**
	* Allows to change mini room's hosts name. <br>
	* <b>post:</b> The mini room's hosts name is changed. 
	* @param pet Mini room's hosts name
	*/

	public void setPet(String pet) {
		this.pet = pet;
	}



	/**
	* Allows to get the mini room's host owners name. <br>
	* @return Mini room's hosts owners name 
	*/
	public  String getOwner() {
		return owner;
	}


	/**
	* Allows to change mini room's host owners name. <br>
	* <b>post:</b> The mini room's host owners name is changed. 
	* @param owner Mini room's host owners name
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}



	/**
	* Allows to get the mini room's host (pet object). <br>
	* @return Mini room's host (pet object). 
	*/

	public  Pet getHostage() {
		return hostage;
	}


	/**
	* Allows to change mini room's host (pet object). <br>
	* <b>post:</b> The mini room's host (pet object) is changed. 
	* @param hostage Mini room's host (pet object)
	*/

	public void setHostage(Pet hostage) {
		this.hostage = hostage;
	}


	/**
	* Allows to verify if a given name matches the host's name or a host owners name of a mini room. Depending on the param <i>kind</i>,
	* 1 seeks for matches of host owners name and 2 seeks for host's name <br>
	* <b>post:</b> Match (not) found
	* @param kind Search filtercoincidence
	* @param theName Name to look for 
	* @return If there is a match returns an empty String, otherwise an error message
	*/

	public String checkIfItsHospitalized(int kind, String theName){
		String reply = "";

		switch (kind) {
			case 1: if(theName.equalsIgnoreCase(owner)){}
					else{reply += "ERROR: No match found\n";}
			break;

			case 2: if(theName.equalsIgnoreCase(pet)){}
					else{reply += "ERROR: No match found\n";}
			break;

			default:
			break;
		
		}

		return reply;
	}



} //end of class