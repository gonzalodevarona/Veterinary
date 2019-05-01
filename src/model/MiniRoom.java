/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 22 MARCH 2019
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
	public MiniRoom(boolean available, int numberOfMiniRoom, String pet, String owner, Pet hostage){
		this.available = available;
		this.numberOfMiniRoom = numberOfMiniRoom;
		this.pet = pet;
		this.owner = owner;
		this.hostage = hostage;
	}


	public  boolean getAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public  int getNumberOfMiniRoom() {
		return numberOfMiniRoom;
	}


	public void setNumberOfMiniRoom(int numberOfMiniRoom) {
		this.numberOfMiniRoom = numberOfMiniRoom;
	}


	public  String getPet() {
		return pet;
	}


	public void setPet(String pet) {
		this.pet = pet;
	}


	public  String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public  Pet getHostage() {
		return hostage;
	}


	public void setHostage(Pet hostage) {
		this.hostage = hostage;
	}


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



} //final