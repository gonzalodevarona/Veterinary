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


	boolean found = false;

	for (int i = 0; i < animal.size() && !found ; i++ ) {

		if ((animal.get(i).getName()).equalsIgnoreCase(petsName)) {

			found = true;

			animal.get(i).addMedRec( newMedRec, petsMeds);

		}

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





 
 } //final