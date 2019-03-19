/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 19 MARCH 2019
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
*/

package model;
import java.util.*;

public class Veterinary{

//ATTRIBUTES
private String name;


//RELATIONSHIPS
private ArrayList<Person> client;
private MiniRoom[] room;

//METHODS

public Veterinary(){
	this.name = "Mi Pequenia Mascota";
	room = new MiniRoom[MiniRoom.ALLROOMS];
	client = new ArrayList<Person>();  
	 
}



public  String getName() {
return name;
}


public  String convertChoise2Type (int choise){
	String reply = "";

	switch (choise){
		case 1: reply += Pet.DOG;
		break;
		case 2: reply += Pet.CAT;
		break;
		case 3: reply += Pet.BIRD;
		break;
		case 4: reply += Pet.OTHER;
		break;
		default: reply += "ERROR: Invalid species selection.";
		break;
			
	}

	return reply;

} 


public  String createPerson(Person theNew, ArrayList<Pet> clientsPets){
	

	client.add(theNew);

	client.get((client.size()) - 1).createPet(clientsPets);

	 String reply  = "*******************************************\n";
	 reply += "* New client has been successfully added! *\n";
	 reply += "*******************************************";



	return reply;

}

public boolean miniRoomAvailable(){
	boolean reply = false;

	for(int i = 0 ; i < MiniRoom.ALLROOMS ; i++){

		if(room[i].getAvailable()){reply = true;};

	}

	return reply;

}



public String showClientsInfo(String clients, String clientsId){
	String reply = "*******************************************************\n";
		   reply += "* ERROR: There is not a client with that name and ID. *\n";
	 	   reply += "*******************************************************";
	boolean theStop = false;

	for (int i = 0; i < client.size() && !theStop ; i++ ) {

		if ((client.get(i).getName()).equals(clients) && (client.get(i).getId()).equals(clientsId)){

			reply = client.get(i).showMyinfo();
			theStop = true;

		}

		

		
	}


return reply;		
}







} //final