/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 21 MARCH 2019
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


	public void createRooms(MiniRoom room1, MiniRoom room2, MiniRoom room3 , MiniRoom room4, MiniRoom room5, MiniRoom room6, MiniRoom room7, MiniRoom room8){
		room[0] = room1;
		room[1] = room2;
		room[2] = room3;
		room[3] = room4;
		room[4] = room5;
		room[5] = room6;
		room[6] = room7;
		room[7] = room8;
		

	}


	public  void createPerson(Person theNew, ArrayList<Pet> clientsPets){
		
		client.add(theNew);

		client.get((client.size()) - 1).createPet(clientsPets);

	}

	public String miniRoomAvailable(){
		String reply =  "ERROR: All mini rooms are occupied";

		for(int i = 0 ; i < MiniRoom.ALLROOMS ; i++){

			if(room[i].getAvailable()){reply = "";};

		}

		return reply;

	}



	public String showClientsInfo(String clients, String clientsId){
		String reply = "*******************************************************\n";
			   reply += "* ERROR: There is not a client with that name and ID. *\n";
		 	   reply += "*******************************************************";
		boolean theStop = false;

		for (int i = 0; i < client.size() && !theStop ; i++ ) {

			if ((client.get(i).getName()).equalsIgnoreCase(clients) && (client.get(i).getId()).equalsIgnoreCase(clientsId)){

				reply = client.get(i).showMyinfo();
				theStop = true;

			}
	
		}


	return reply;		
	}



	public String showContactInfo(int kind, String theName, String personId) {
		String message = "";

		switch (kind) {

			
			case 1: boolean hold = false;
			for (int i = 0 ; i < MiniRoom.ALLROOMS && !hold ; i++) {

				String itsHospitalized = room[i].checkIfItsHospitalized(kind, theName);

				if(itsHospitalized.equalsIgnoreCase("")){ 
					 hold = true;

					 boolean wait = false;

					for (int in = 0; in < client.size() && !wait ; in++ ) {

						if ((client.get(in).getName()).equalsIgnoreCase(theName) && (client.get(in).getId()).equalsIgnoreCase(personId)){

							message = client.get(in).contactInfo();

							wait = true;
							

						}

					}

				}
					else {message = itsHospitalized;}
				
			}
			
			break;

			case 2: boolean holdOn = false;
			 for (int ind = 0 ; ind < MiniRoom.ALLROOMS && !holdOn ; ind++) {

				String itsHospitalized2 = room[ind].checkIfItsHospitalized(kind, theName);

				if(itsHospitalized2.equalsIgnoreCase("")){ 
					holdOn = true;

					String ownersName = room[ind].getOwner();

					boolean theStop2 = false;
					for (int inde = 0; inde < client.size() && !theStop2 ; inde++ ) {

						if ((client.get(inde).getName()).equals(ownersName) && client.get(inde).reviewPet(theName)){

							message = client.get(inde).contactInfo();
							theStop2 = true;

						}
	
					}







				}
					else {message = itsHospitalized2;}
				
			}

			break;

			default:
			break;
				
			
				
			
			
		}

		return message;
	}










} //final