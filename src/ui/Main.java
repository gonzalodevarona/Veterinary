

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
		
		Person gonza = new Person("Gonzalo De Varona", "1006017263", "Infinite Loop", "3127061833");
		Pet benji = new Pet("Benji", "Cat", 1.0, 15.0, false, false, gonza);
		ArrayList<Pet> gonzaPets = new ArrayList<Pet>();
		gonzaPets.add(benji);
		goForIt.createPerson(gonza, gonzaPets);

		Person andrea = new Person("Andrea Melendez", "1003274632", "Infinite Loop", "3135625927");
		Pet rocco = new Pet("Rocco", "Dog", 1.0, 23.0, false, false, andrea);
		ArrayList<Pet> andreaPets = new ArrayList<Pet>();
		andreaPets.add(rocco);
		goForIt.createPerson(andrea, andreaPets);

		
		
		Person gretel = new Person("Gretel De Varona", "1006078287", "Roosevelt Ave", "5142841922");
		Pet paul = new Pet("Paul", "Other", 7.0, 70.0, true, true, gretel);
		Pet daisy = new Pet("Daisy", "Dog", 3.0, 39.0, false, true, gretel);
		ArrayList<Pet> gretelPets = new ArrayList<Pet>();
		gretelPets.add(paul); gretelPets.add(daisy);
		goForIt.createPerson(gretel, gretelPets);

		
		
		Person pablolondra = new Person("Pablo Londra", "1001237483", "Little Puerto Rico", "3128934055");
		Pet arnold = new Pet("Arnold", "Cat", 2.0, 20.0, false, true, pablolondra);
		Pet francis = new Pet("Francis", "Bird", 4.0, 3.2, true, true, pablolondra);
		ArrayList<Pet> pablolondraPets = new ArrayList<Pet>();
		pablolondraPets.add(arnold); pablolondraPets.add(francis);
		goForIt.createPerson(pablolondra, pablolondraPets);

		MiniRoom room1 = new MiniRoom(false, 1, "Francis", "Pablo Londra", francis);
		MiniRoom room2 = new MiniRoom(false, 2, "Daisy", "Gretel De Varona", daisy);
		MiniRoom room3 = new MiniRoom(false, 3, "Paul", "Gretel De Varona", paul);
		MiniRoom room4 = new MiniRoom(true, 4, "", "", null);
		MiniRoom room5 = new MiniRoom(true, 5, "", "", null);
		MiniRoom room6 = new MiniRoom(false, 6, "Arnold", "Pablo Londra", arnold);
		MiniRoom room7 = new MiniRoom(true, 7, "", "", null);
		MiniRoom room8 = new MiniRoom(true, 8, "", "", null);
		goForIt.createRooms(room1, room2, room3 ,room4, room5, room6, room7, room8);

		
		
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

		//WELCOME TEDDY BEAR
		System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n───█▒▒░░░░░░░░░▒▒█───\n────█░░█░░░░░█░░█────\n─▄▄──█░░░▀█▀░░░█──▄▄─\n█░░█─▀▄░░░░░░░▄▀─█░░█\n█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n█░░║║║╠─║─║─║║║║║╠─░░█\n█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█");					
		
		System.out.println("");




		

		

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
					break; 

				//EDIT A MEDICAL RECORD FROM A PET.
				case 6:
					break;

				//DISCHARGE A PET
				case 7:
					break;

				//SHOW INCOME FOR HOSPITALIZATIONS
				case 8: showIncome();
					break;

				//SHOW OCCUPIED MINI ROOM BASED ON PET'S NAME
				case 9: 
					break;

				//SHOW RECORDS FROM A PET
				case 10:
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


					} else{ Pet theNewPet = new Pet(petsName, species, age, weight, false, false, theNew);
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

					Pet sickPet = goForIt.retrievePet(name, id, petsName);

					MedRecord newMedRec = new MedRecord("", "", symptoms, diagnosys, "Open", newDateIn, sickPet);

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

						if(!(medsName.equals("")) && medsDose != 0 && medsPrice != 0 && !(medsFrecuency.equals(""))){
							petsMeds.add(newMed);
						}

					}

					goForIt.startHospitalizeVet(name, id, petsName, newMedRec, petsMeds);

					System.out.println("");
					System.out.println(petsName+" was successfully hospitalized!");
					System.out.println("");
				

				} else {System.out.println("ERROR: Invalid date.");}

			} else {System.out.println("ERROR: No match found.");}


		} else {System.out.println("ERROR: All rooms are occupied.");}

	}


	public void showIncome(){

		System.out.println("");
		System.out.println("This is the income for every hospitalization: "+goForIt.gatherAllFees()+" COP");
		System.out.println("");

	}


						


} //final