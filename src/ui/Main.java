

/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 24 MARCH 2019
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
*/
package ui;



import model.*;
import java.util.*;

public class Main{

//ATTRIBUTES 
private Scanner reader;



//RELATIONSHIPS
private Veterinary goForIt;



//EMPTY CONSTRUCTOR
	public Main (){

		init ();
		reader = new Scanner(System.in);


	}



	public void init(){
		goForIt = new Veterinary();	

		MiniRoom room1 = new MiniRoom(true, 1, "", "", null);
		MiniRoom room2 = new MiniRoom(true, 2, "", "", null);
		MiniRoom room3 = new MiniRoom(true, 3, "", "", null);
		MiniRoom room4 = new MiniRoom(true, 4, "", "", null);
		MiniRoom room5 = new MiniRoom(true, 5, "", "", null);
		MiniRoom room6 = new MiniRoom(true, 6, "", "", null);
		MiniRoom room7 = new MiniRoom(true, 7, "", "", null);
		MiniRoom room8 = new MiniRoom(true, 8, "", "", null);
		goForIt.createRooms(room1, room2, room3 ,room4, room5, room6, room7, room8);


		
		Person gonza = new Person("Gonzalo De Varona", "1006017263", "Infinite Loop", "3127061833");
		Pet benji = new Pet("Benji", "Cat", 1.0, 15.0, gonza);
		ArrayList<Pet> gonzaPets = new ArrayList<Pet>();
		gonzaPets.add(benji);
		goForIt.createPerson(gonza, gonzaPets);



		Person andrea = new Person("Andrea Melendez", "1003274632", "Infinite Loop", "3135625927");
		Pet rocco = new Pet("Rocco", "Dog", 1.0, 23.0, andrea);
		ArrayList<Pet> andreaPets = new ArrayList<Pet>();
		andreaPets.add(rocco);
		goForIt.createPerson(andrea, andreaPets);

		
		
		Person gretel = new Person("Gretel De Varona", "1006078287", "Roosevelt Ave", "5142841922");
		Pet paul = new Pet("Paul", "Other", 7.0, 70.0, gretel);
		Pet daisy = new Pet("Daisy", "Dog", 3.0, 39.0, gretel);
		ArrayList<Pet> gretelPets = new ArrayList<Pet>();
		gretelPets.add(paul); gretelPets.add(daisy);
		goForIt.createPerson(gretel, gretelPets);

		DateIn daisyDate = new DateIn (12, 3, 2019);
		MedRecord daisyMedRec = new MedRecord("", "", "Persistent sneeze ", "Pacient seems to have a flu", "Open", daisyDate , daisy);
		ArrayList<ReqMed> petsMedsDaisy = new ArrayList<ReqMed>();
		ReqMed noxpirin = new ReqMed("Noxpirin", 24, 2000, "every 7 hours");
		petsMedsDaisy.add(noxpirin);
		goForIt.startHospitalizeVet("Gretel De Varona", "1006078287", "Daisy", daisyMedRec, petsMedsDaisy);

		DateIn paulDate = new DateIn (21, 1, 2019);
		MedRecord paulMedRec = new MedRecord("", "", "Low blood pressure ", "Pacient seems to have a diabetes", "Open", paulDate , paul);
		ArrayList<ReqMed> petsMedsPaul = new ArrayList<ReqMed>();
		ReqMed metformin = new ReqMed("Metformin", 21, 4600, "every 12 hours");
		ReqMed chocolate = new ReqMed("Chocolate", 1, 22600, "once a month");
		petsMedsPaul.add(metformin);
		petsMedsPaul.add(chocolate);

		goForIt.startHospitalizeVet("Gretel De Varona", "1006078287", "Paul", paulMedRec, petsMedsPaul);



		Person pablolondra = new Person("Pablo Londra", "1001237483", "Little Puerto Rico", "3128934055");
		Pet arnold = new Pet("Arnold", "Cat", 2.0, 20.0, pablolondra);
		Pet francis = new Pet("Francis", "Bird", 4.0, 3.2, pablolondra);
		ArrayList<Pet> pablolondraPets = new ArrayList<Pet>();
		pablolondraPets.add(arnold); pablolondraPets.add(francis);
		goForIt.createPerson(pablolondra, pablolondraPets);

		DateIn arnoldDate = new DateIn (2, 1, 2019);
		MedRecord arnoldMedRec = new MedRecord("", "", "Chills, persistent diarrhea, vomiting ", "Pacient seems to have cancer", "Open", arnoldDate , francis);
		ArrayList<ReqMed> petsMedsArnold = new ArrayList<ReqMed>();
		ReqMed acetaminophen = new ReqMed("Acetaminophen", 24, 2000, "every 7 hours");
		petsMedsArnold.add(acetaminophen);
		goForIt.startHospitalizeVet("Pablo Londra", "1001237483", "Arnold", arnoldMedRec, petsMedsArnold);


		DateIn francisDate = new DateIn (12, 2, 2019);
		MedRecord aMedRec = new MedRecord("", "", "Weakness, fatigue, persistent diarrhea, vomiting ", "Pacient seems to have aids", "Open", francisDate , francis);
		ArrayList<ReqMed> petsMeds = new ArrayList<ReqMed>();
		ReqMed dolex = new ReqMed("Dolex", 12, 3000, "every 3 hours");
		petsMeds.add(dolex);

		goForIt.startHospitalizeVet("Pablo Londra", "1001237483", "Francis", aMedRec, petsMeds);

		

		
		
	}




//  ******MAIN METHOD******
	public static void main(String[] args) {

		Main execute = new Main();
		execute.menu();	
	}




// *************************************INTERFACE'S METHODS*************************************

	public void showMenuOptions(){
		System.out.println("");
		System.out.println("1. Register a new client.");
		System.out.println("2. Show clients & pets information.");
		System.out.println("3. Show person’s contact info of a hospitalized pet by putting owner’s name or pet’s name");
		System.out.println("4. Hospitalize a pet.");
		System.out.println("5. Show medical records from hospitalized pets.");
		System.out.println("6. Edit a medical record from a pet.");
		System.out.println("7. Discharge a pet.");
		System.out.println("8. Show income for hospitalizations.");
		System.out.println("9. Show occupied mini room based on pet's full name.");
		System.out.println("10.Show records from a pet.");
		System.out.println("11.QUIT PROGRAM");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
	}

	public void typeSelectionMssg() {	
		System.out.println("--------------------------------------");
		System.out.print("| Type the number of your selection: ");	
	} 


	public void plainLine(){
		System.out.println("--------------------------------------");
	}

	


	//************************ MAIN INTERFACE ************************
	public void menu(){
		int userInput = 0;

		System.out.println("");
		System.out.println("");

		//WELCOME 	
		System.out.println("M''MMM''MMM''M          dP                                          M''''''''M             M'''''`''''`YM             M''MMMMMMMM oo dP    MM'''''''`YM            dP   "); 
		System.out.println("M  MMM  MMM  M          88                                          Mmmm  mmmM             M  mm.  mm.  M             M  MMMMMMMM    88    MM  mmmmm  M            88   ");
		System.out.println("M  MMP  MMP  M .d8888b. 88 .d8888b. .d8888b. 88d8b.d8b. .d8888b.    MMMM  MMMM .d8888b.    M  MMM  MMM  M dP    dP    M  MMMMMMMM dP 88    M'        .M .d8888b. d8888P ");
		System.out.println("M  MM'  MM' .M 88ooood8 88 88'  `"+"   88'  `88 88'`88'`88 88ooood8    MMMM  MMMM 88'  `88    M  MMM  MMM  M 88    88    M  MMMMMMMM 88 88    MM  MMMMMMMM 88ooood8   88   ");
		System.out.println("M  `' . '' .MM 88.  ... 88 88.  ... 88.  .88 88  88  88 88.  ...    MMMM  MMMM 88.  .88    M  MMM  MMM  M 88.  .88    M  MMMMMMMM 88 88    MM  MMMMMMMM 88.  ...   88   ");
		System.out.println("M    .d  .dMMM `88888P' dP `88888P' `88888P' dP  dP  dP `88888P'    MMMM  MMMM `88888P'    M  MMM  MMM  M `8888P88    M         M dP dP    MM  MMMMMMMM `88888P'   dP   ");
		System.out.println("MMMMMMMMMMMMMM                                                      MMMMMMMMMM             MMMMMMMMMMMMMM      .88    MMMMMMMMMMM          MMMMMMMMMMMM                 ");
		System.out.println("                                                                   	      	                           d8888P ");                                                      
                                                                                          

		while (userInput != 11){

			showMenuOptions();

			System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {

				//REGISTER A NEW CLIENT
				case 1: 
					registerANewClient();
					break;

				//SHOW CLIENTS & PETS INFORMATION
				case 2: 
					clientsInfoByGivenName();
					break; 


				//SHOW PERSON’S CONTACT INFO OF A HOSPITALIZED PET BY PUTTING OWNER’S NAME OR PET’S NAME
				case 3: 
					contactInfoByNameOrPet(); 
					break;


				//HOSPITALIZE A PET
				case 4:
					hospitalizeAPet();
					break; 

				//SHOW MEDICAL RECORDS FROM HOSPITALIZED PETS
				case 5: 
					showMedRecsFromHPet();
					break; 

				//EDIT A MEDICAL RECORD FROM A PET
				case 6: 
					editMedRecFromAPet();
					break;

				//DISCHARGE A PET
				case 7: 
					dischargeAPet();
					break;

				//SHOW INCOME FOR HOSPITALIZATIONS
				case 8: 
					showIncome();
					break;

				//SHOW OCCUPIED MINI ROOM BASED ON PET'S NAME
				case 9: 
					showMiniRoomNumberByPetsName();
					break;

				//SHOW RECORDS FROM A PET
				case 10: 
					showAllMedRecs4Pet();
					break;


				//QUIT PROGRAM
				case 11: 
					theGoodbye();
					break;

				default:
					break;
				
			}

		}
		

		
		


 	

		



	





	}

	public void registerANewClient() {
		System.out.println("");
		System.out.print("Please type the client's full name: "); String name = reader.nextLine();
		System.out.print("Please type the client's ID: "); String id = reader.nextLine();
		System.out.print("Please type the client's address: "); String address = reader.nextLine();
		System.out.print("Please type the client's phone number: "); String phone = reader.nextLine();
		System.out.println("");

		if(!(name.equals("")) && !(id.equals("")) && !(address.equals("")) && !(phone.equals(""))){

			Person theNew = new Person(name, id, address, phone);

			System.out.print("How many pets of the client are customers here?\n"); int loopsy = reader.nextInt(); reader.nextLine();

			ArrayList<Pet> clientsPets = new ArrayList<Pet>();

			for(int i = 0; i < loopsy; ++i){

				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
				System.out.println("");
				System.out.println("Please choose the pet's species: "); 
				System.out.println("1. Dog.");
				System.out.println("2. Cat.");
				System.out.println("3. Bird.");
				System.out.println("4. Other.");
				System.out.println("");
				typeSelectionMssg();
				int choise = reader.nextInt(); reader.nextLine();
				plainLine();
				System.out.println("");

				String species = goForIt.convertChoise2Type(choise);

				System.out.print("Please type the pet's age (years): "); double age = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.print("How much does the pet weight (Kg)? "); double weight = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.println("");

				

					if(species.equals("ERROR: Invalid species selection.")){
					System.out.println(species);
					--i;


					} else{ Pet theNewPet = new Pet(petsName, species, age, weight, theNew);
							clientsPets.add(theNewPet);
					}

				
			}
				

		


				
			
			goForIt.createPerson(theNew, clientsPets);
			System.out.println("*******************************************\n");
			System.out.println("* New client has been successfully added! *\n");
		 	System.out.println("*******************************************\n");

						

					} else{System.out.println("ERROR: Missing information.");}

		
			


		
	}



	public void clientsInfoByGivenName(){

		System.out.println("");
		System.out.print("Please type the client's full name to get his/her information: "); String clients = reader.nextLine();
		System.out.print("Please type the client's ID to get his/her information: "); String clientsId = reader.nextLine();
		System.out.println("");
		System.out.println(goForIt.showClientsInfo(clients, clientsId));
		System.out.println("");


	}


	


	public void theGoodbye() {
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("");
		System.out.println("THANK YOU FOR USING MY LIL PET SOFTWARE");
		System.out.println("");
	}
						

	public void contactInfoByNameOrPet(){

		System.out.println("");
		System.out.println("Please choose which kind of customer you will type his/her/its full name: "); 
		System.out.println("1. Person.");
		System.out.println("2. Animal."); 
		System.out.println("");

		typeSelectionMssg();
		int kind = reader.nextInt(); reader.nextLine();
		plainLine();

		if (kind == 1 || kind == 2) {
			System.out.print("Please type the full name: "); 
			String theName = reader.nextLine();
			System.out.println("");

			System.out.print("Please type the person's ID if you picked Person on the first question, otherwise just press ENTER : "); 
			String personId = reader.nextLine();
			System.out.println("");

			System.out.println(goForIt.showContactInfo(kind, theName, personId));
			
		} else {System.out.println("ERROR: Invalid selection.");
				System.out.println("");}
		

	}


	public void hospitalizeAPet(){

		if(goForIt.miniRoomAvailable()){

			System.out.println("");
			System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
			System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
			System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
			System.out.println("");
			System.out.println("");

			if(goForIt.checkOwner(name, id, petsName)){

				System.out.println("*************************************************");
				System.out.println("*** NEEDED INFORMATION FOR THE MEDICAL RECORD ***");
				System.out.println("*************************************************");

				System.out.println("");
				System.out.print("Please type the day that the pet got hospitalized: "); int day = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the month that the pet got hospitalized: "); int month = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the year that the pet got hospitalized: "); int year = reader.nextInt(); reader.nextLine();

				Calendar today = new GregorianCalendar();
					int yearT = today.get(Calendar.YEAR);

				if (year <= yearT ) {

					DateIn newDateIn = new DateIn(day, month, year);
					System.out.print("Please type the pet's symptoms, if you do not know them just press ENTER and add them later: "); String symptoms = reader.nextLine();
					System.out.print("Please type the pet's diagnosys, if you do not know it just press ENTER and add it later: "); String diagnosys = reader.nextLine();
					System.out.println("");

					Pet sick = goForIt.retrievePet(name, id, petsName);
					

					MedRecord newMedRec = new MedRecord("", "", symptoms, diagnosys, "Open", newDateIn, sick);

					System.out.println("******************");
					System.out.println("*** MEDICATION ***");
					System.out.println("******************");
					System.out.println("");
					System.out.print("How many prescribed medicines does the pet have?\n"); int quantity = reader.nextInt(); reader.nextLine();


					ArrayList<ReqMed> petsMeds = new ArrayList<ReqMed>();

					for(int i = 0; i < quantity; ++i){

						System.out.println("");
						System.out.println("___________________________________________________________________");
						System.out.print("Please type the medicine's name: "); String medsName = reader.nextLine();
						System.out.print("Please type the medicine's dose: "); double medsDose = reader.nextDouble(); reader.nextLine();
						System.out.print("Please type the medicine's price per dose: "); double medsPrice = reader.nextDouble(); reader.nextLine();
						System.out.print("Please type the medicine's frecuency: "); String medsFrecuency = reader.nextLine();

						ReqMed newMed = new ReqMed(medsName, medsDose, medsPrice, medsFrecuency);

						if(!(medsName.equals("")) && medsDose != 0 && !(medsFrecuency.equals(""))){
							petsMeds.add(newMed);
						}

					}

					goForIt.startHospitalizeVet(name, id, petsName, newMedRec, petsMeds);

					System.out.println("");
					System.out.println(petsName+" was successfully hospitalized!");
					System.out.println("");
				

				} else {System.out.println("");
						System.out.println("ERROR: Invalid date.");
						System.out.println("");}

			} else {System.out.println("");
					System.out.println("ERROR: No match found.");
					System.out.println("");}


		} else {System.out.println("");
				System.out.println("ERROR: All rooms are occupied.");
				System.out.println("");}

	}


	public void showIncome(){

		System.out.println("");
		System.out.println("This is the income for every hospitalization: "+goForIt.gatherAllFees()+" COP");
		System.out.println("");

	}

	public void showMedRecsFromHPet(){
		System.out.println(goForIt.medRecsFromHPet());

	}


	public void showMiniRoomNumberByPetsName(){
		System.out.println("");
		System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();

		int theNumber = goForIt.retrieveNumberMiniRoom(petsName);

		if(theNumber != 0){
		System.out.println("The number of the mini room occupied by " +petsName+ " is " +theNumber);
		} else{System.out.println("ERROR: No match found");}
	}


	public void showAllMedRecs4Pet(){
		System.out.println("");
		System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
		System.out.println("");

		if(goForIt.checkOwner(name, id, petsName)){

			String records = goForIt.showAPetMedRecs(name, id, petsName);

			if(records.equals("")){
				System.out.println("This pet does not have any medical record.");
			}else{System.out.println("");
			System.out.println(records);}

		} else{System.out.println("ERROR: No match found");}


	}



	public void dischargeAPet() {
		System.out.println("");
		System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
		System.out.println("");

		if(goForIt.checkOwner(name, id, petsName)){

			if(goForIt.retrieveNumberMiniRoom(petsName) != 0 ){
			
			System.out.println(goForIt.showAPetMedRecs(name, id, petsName));
			goForIt.removePet(name, id, petsName);
			} else{ System.out.println("This pet does not have any medical record."); }

		} else{ System.out.println("ERROR: No match found"); }

	}


	public void editMedRecFromAPet(){

		System.out.println("");
		System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
		System.out.println("");

		if(goForIt.checkOwner(name, id, petsName)){
			if(goForIt.retrieveNumberMiniRoom(petsName) != 0 ){
			
			System.out.println("");
			System.out.println("Please select what you would like to add:");
			System.out.println("1. Symptoms.");
			System.out.println("2. Diagnosys.");
			System.out.println("3. Prescribed medications.");
			typeSelectionMssg();
			int edition = reader.nextInt(); reader.nextLine();
			plainLine();

			String symptomsEdit = "";
			String diagnosysEdit = "";
			ArrayList<ReqMed> addedPetsMeds = new ArrayList<ReqMed>();
			
			
			switch (edition) {
				case 1: 	
					System.out.print("Please type the pet's symptoms: "); symptomsEdit = reader.nextLine();
					goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, addedPetsMeds);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
					break;

				case 2: 
					System.out.print("Please type the pet's diagnosys: "); diagnosysEdit = reader.nextLine();
					goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, addedPetsMeds);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
					break;

				case 3:
					System.out.print("How many prescribed medicines does the pet have?\n"); int quantityMeds = reader.nextInt(); reader.nextLine();


					

					for(int i = 0; i < quantityMeds; ++i){

						System.out.println("");
						System.out.println("___________________________________________________________________");
						System.out.print("Please type the medicine's name: "); String medsName = reader.nextLine();
						System.out.print("Please type the medicine's dose: "); double medsDose = reader.nextDouble(); reader.nextLine();
						System.out.print("Please type the medicine's price per dose: "); double medsPrice = reader.nextDouble(); reader.nextLine();
						System.out.print("Please type the medicine's frecuency: "); String medsFrecuency = reader.nextLine();

						if(!(medsName.equals("")) && medsDose != 0 && !(medsFrecuency.equals(""))){
							ReqMed newMedAdded = new ReqMed(medsName, medsDose, medsPrice, medsFrecuency);
							addedPetsMeds.add(newMedAdded);
							System.out.println("");
							System.out.println("Current medical record from "+petsName+" has been edited");
							System.out.println("");
							
						} else{ System.out.println("ERROR: Prescribed medication could not be added, fields are incomplete"); }

					}
					if(addedPetsMeds.get(0) != null){
						goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, addedPetsMeds);
					}
					break;
				
				default: 
					System.out.println("");
					System.out.println("ERROR: Invalid selection.");
					System.out.println("");
					break;
					
				
					
				
					
				
				
				}
			} else{ System.out.println("ERROR: Pet does not have an open medical record"); }

		} else{ System.out.println("ERROR: No match found"); }

	}

	



						


} //final