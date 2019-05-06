/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 16 APRIL 2019
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



	/**
	* Allows to get the veterinary's name. <br>
	* @return The veterinary's name
	*/

	public  String getName() {
	return name;
	}


	/**
	* Allows to convert a user choise for a animal type from int to String. <br>
	* @param choise User choise
	* @return The animal type as String
	*/

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


	/**
	* Allows to create the 8 roooms of a veterinary. <br>
	* <b>pre:</b> Used when creating a veterinary(object) for the first time
	* @param room1 The room number 1
	* @param room2 The room number 2
	* @param room3 The room number 3
	* @param room4 The room number 4
	* @param room5 The room number 5
	* @param room6 The room number 6
	* @param room7 The room number 7
	* @param room8 The room number 8
	*/

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


	/**
	* Allows to add a new person(object) to the <i>ArrayList Person</i> which means a new client for the veterinary <br>
	* <b>post:</b> The new person is added to the <i>ArrayList Person</i>
	* @param theNew The new person(object). This param must not be null
	* @param clientsPets The new person's pets
	*/

	public  void createPerson(Person theNew, ArrayList<Pet> clientsPets){
		
		client.add(theNew);
		theNew.createPet(clientsPets);

	}


	/**
	* Allows to check if any mini room is available<br>
	* @return If any mini room is available
	*/

	public boolean miniRoomAvailable(){
		boolean reply =  false;

		for(int i = 0 ; i < MiniRoom.ALLROOMS && !reply ; i++){

			if(room[i].getAvailable()){reply = true;};
		}

		return reply;
	}


	/**
	* Allows to get a specific client's information such as name, unique ID, address, phone number and pets information <br>
	* @see Person.findPerson(clients, clientsId) 
	* @see Person.showMyinfo()
	* @return An error message or a specific client's information
	*/
	public String showClientsInfo(String clients, String clientsId){
		String reply = "*******************************************************\n";
			   reply += "* ERROR: There is not a client with that name and ID. *\n";
		 	   reply += "*******************************************************";

		Person person = findPerson(clients, clientsId);

		if(person != null){
			reply = person.showMyinfo();
		}
		return reply;		
	}


	/**
	* Allows to get a specific client's information such as name, unique ID, address, phone number and pets information <br>
	* @see Person.getName()
	* @see Person.getId()
	* @return Null or a person (object)
	*/

	public Person findPerson(String clients, String clientsId){
		Person thePerson = null;

		boolean theStop = false;

		for (int i = 0; i < client.size() && !theStop ; i++ ) {

			if ((client.get(i).getName()).equalsIgnoreCase(clients) && (client.get(i).getId()).equalsIgnoreCase(clientsId)){
				thePerson = client.get(i);
				theStop = true;
			}
		}
			return thePerson;
	}


	public String showContactInfo(int kind, String theName, String personId) {
		String message = "";

		switch (kind) {
		
			case 1: 
			boolean hold = false;
			for (int i = 0 ; i < MiniRoom.ALLROOMS && !hold ; i++) {

				String itsHospitalized = room[i].checkIfItsHospitalized(kind, theName);

				if(itsHospitalized.equalsIgnoreCase("")){ 
					 hold = true;

					Person person = findPerson(theName, personId);
						if (person != null){
							message = person.contactInfo();
						}

					}
				else {message = itsHospitalized;}
			}
			
			break;

			case 2:
			boolean holdOn = false;
			for (int ind = 0 ; ind < MiniRoom.ALLROOMS && !holdOn ; ind++) {

				String itsHospitalized2 = room[ind].checkIfItsHospitalized(kind, theName);

				if(itsHospitalized2.equalsIgnoreCase("")){ 
					holdOn = true;

					String ownersName = room[ind].getOwner();

					boolean theStop2 = false;
					Person personInMatter = null;
					for (int inde = 0; inde < client.size() && !theStop2 ; inde++ ) {
						personInMatter = client.get(inde);

						if ((personInMatter.getName()).equalsIgnoreCase(ownersName) && personInMatter.reviewPet(theName)){

							message = personInMatter.contactInfo();
							theStop2 = true;

						}
					}
				}
				else {message = itsHospitalized2;}				
			}

			break;

			default:
			break;		
		} //switch end

		return message;
	}


	public boolean checkOwner(String name, String id, String petsName){
		boolean isReal = false;
		String evaluation = showClientsInfo(name, id);

		if(evaluation.charAt(0) != '*' && evaluation.toLowerCase().contains(petsName.toLowerCase())){

			isReal = true;
		}

		return isReal;

	}


	public void startHospitalizeVet(String name, String id, String petsName, MedRecord newMedRec, ArrayList<ReqMed> petsMeds, Pet sick){
		Person person = findPerson(name, id);
			if (person != null){
				person.startHospitalizePers(petsName, newMedRec, petsMeds);
			}

		boolean theStop = false;
		for (int in = 0; in < MiniRoom.ALLROOMS && !theStop ; in++ ) {

			if (room[in].getAvailable()){

				theStop = true;
				room[in].setOwner(name);
				room[in].setPet(petsName);
				room[in].setHostage(sick);
				room[in].setAvailable(false);

			}
		}
	}



	public Pet retrievePet(String name, String  id, String  petsName){
		Pet relationshipOfPet = null;

		Person person = findPerson(name, id);
			if (person != null){
				relationshipOfPet = person.givePet(petsName);
			}

		return relationshipOfPet;
	}


	public double gatherAllHospitalizationFees(){
		double income = 0.0;

	for (int i = 0; i < client.size(); i++ ) {

		income += client.get(i).myBill();
	}

	return income;

	}


	public double totalIncome(){
		double incomeT = 0.0;

		incomeT += gatherAllHospitalizationFees();
		incomeT += feeServicesVeterinary(0);

		return incomeT;
	}


	public double hospitalizationAverage(){
		double hAverage = 0.0;

	for (int i = 0; i < client.size(); i++ ) {

		hAverage += client.get(i).myBill();
	}

	hAverage = hAverage / countAllHospitalizations();

	return hAverage;

	}

	public int countAllHospitalizations(){
		int many = 0;

		for (int i = 0; i < client.size(); i++ ) {

			many += client.get(i).countHospitalizations();
		}

		return  many;
	}



	public String medRecsFromHPet(){
		String reply = "";
	for(int i = 0 ; i < MiniRoom.ALLROOMS ; i++){

		if(room[i].getAvailable() && room[i].getHostage() == null){ }
		else{
			reply += room[i].getHostage().showAllRecords();
		}

	}

	return reply;
	}	


	public int retrieveNumberMiniRoom(String petsName){
	int theNumber = 0;
	boolean theStop = false;

	for(int i = 0 ; i < MiniRoom.ALLROOMS && !theStop ; i++){

		if(room[i].getPet().equalsIgnoreCase(petsName) ){ 
			theNumber = room[i].getNumberOfMiniRoom();
			theStop = true;
			 }	

	}

	return theNumber;



	}


	public String showAPetMedRecs(String name, String  id, String  petsName){
	boolean theStop = false;
	String reply = "ERROR: No match found";
	
	
	Person person = findPerson(name, id);
	if (person != null){
		reply = person.givePet(petsName).showAllRecords();
	} 

	return reply;

	}


	public void removePet(String name, String  id, String  petsName) {
		Person person = findPerson(name, id);
		if (person != null){
			person.givePet(petsName).cutItOff();

			boolean wait = false;

				for(int in = 0 ; in < MiniRoom.ALLROOMS && !wait ; in++){

					if(room[in].getPet().equalsIgnoreCase(petsName) && room[in].getOwner().equalsIgnoreCase(name) ){ 
						room[in].setAvailable(true);
						room[in].setPet("");
						room[in].setOwner("");
						room[in].setHostage(null);

						wait = true;
					}
						

				}
		} 	
	}
	



	public String locatePersonWithPet2AddStuff(String name, String  id, String petsName, int edition, String symptomsEdit, String diagnosysEdit, String medsName, double medsDose, double medsPrice, String medsFrecuency){
		String reply = "";
		Person person = findPerson(name, id);
		if (person != null){
			reply += person.locatePet2AddStuff(petsName, edition, symptomsEdit, diagnosysEdit, medsName, medsDose, medsPrice, medsFrecuency);
		}
		return reply;
	}


	public String changeClientInfo(String name, String  id, String newAddress, String newPhone){
		String reply = "ERROR: No match found";
		Person person = findPerson(name, id);
		if (person != null){
			reply = "Information has been sucessfully updated!";
			person.modifyAddressOrPhone(newAddress, newPhone);
		}
		return reply;

	}



	public double feeServicesVeterinary(int serviceSelection){
		double reply = 0.0;
		switch (serviceSelection) {
			case 0:
				reply += feeServicesPeople(1);
				reply += feeServicesPeople(2);
				reply += feeServicesPeople(3);
				reply += feeServicesPeople(4);
				reply += feeServicesPeople(5);
				break;
			default:
				reply = feeServicesPeople(serviceSelection);	
				break;
		}
		return reply;
	}


	public double feeServicesPeople(int serviceSelection){
		double reply = 0.0;
		for (int i = 0; i<client.size() ; i++ ) {
			reply += client.get(i).petsFeeServices(serviceSelection);	
		}
		return reply;

	}


	public char convertChoise2Char(int serviceSelection){
		char answer = 'a';
		switch (serviceSelection) {
			case 1:
			answer = 'b';
				break;
			case 2:
			answer = 'd';
				break;
			case 3:
			answer = 't';
				break;
			case 4:
			answer = 'n';
				break;
			case 5:
			answer = 's';
				break;
			default:
				break;	
		}
		return answer;
	}


	public void startServiceVet(String name, String id, Pet clientPet, Service newService){
		Person person = findPerson(name, id);
		if (person != null){
			person.startServicePers(clientPet, newService);
		}

	}



	public double weeklyAverageIncome(DateIn initialDate){
		double reply = 0;
		int counter = 0;
		Person clientInMatter = null;
		for (int i = 0; i < client.size()  ; i++ ) {
			 clientInMatter = client.get(i);
			 reply += clientInMatter.petsServicesWeeklyIncome(initialDate);
			 counter += clientInMatter.petsServicesWeeklyIncomeCounter(initialDate);	
		}

		reply = reply / counter;


		return reply;
	}


	public String datesServiceReports(DateIn initialDate, DateIn finalDate){
		String reports = "";

		if(initialDate.getYear() == finalDate.getYear()){

			for (int i = 0; i < client.size() ; i++ ) {
				reports += client.get(i).myPetsServiceReports(initialDate, finalDate);	
			}

		}
		return reports;
	}






} //final