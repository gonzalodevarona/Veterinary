

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
		Pet benji = new Pet("Benji", "Cat", 1.0, 15.0, 0.37, gonza);
		ArrayList<Pet> gonzaPets = new ArrayList<Pet>();
		gonzaPets.add(benji);
		goForIt.createPerson(gonza, gonzaPets);



		Person andrea = new Person("Andrea Melendez", "1003274632", "Infinite Loop", "3135625927");
		Pet rocco = new Pet("Rocco", "Dog", 1.0, 23.0, 0.47, andrea);
		ArrayList<Pet> andreaPets = new ArrayList<Pet>();
		andreaPets.add(rocco);
		goForIt.createPerson(andrea, andreaPets);

		
		
		Person gretel = new Person("Gretel De Varona", "1006078287", "Roosevelt Ave", "5142841922");
		Pet paul = new Pet("Paul", "Other", 7.0, 70.0, 1.80, gretel);
		Pet daisy = new Pet("Daisy", "Dog", 3.0, 39.0, 1.0, gretel);
		ArrayList<Pet> gretelPets = new ArrayList<Pet>();
		gretelPets.add(paul); gretelPets.add(daisy);
		goForIt.createPerson(gretel, gretelPets);

		DateIn daisyDate = new DateIn (12, 3, 2019);
		MedRecord daisyMedRec = new MedRecord("", "", "Persistent sneeze ", "Pacient seems to have a flu", "Open", daisyDate , daisy);
		ArrayList<ReqMed> petsMedsDaisy = new ArrayList<ReqMed>();
		ReqMed noxpirin = new ReqMed("Noxpirin", 24, 2000, "every 7 hours");
		petsMedsDaisy.add(noxpirin);
		goForIt.startHospitalizeVet("Gretel De Varona", "1006078287", "Daisy", daisyMedRec, petsMedsDaisy, daisy);

		DateIn paulDate = new DateIn (21, 1, 2019);
		MedRecord paulMedRec = new MedRecord("", "", "Low blood pressure ", "Pacient seems to have a diabetes", "Open", paulDate , paul);
		ArrayList<ReqMed> petsMedsPaul = new ArrayList<ReqMed>();
		ReqMed metformin = new ReqMed("Metformin", 21, 4600, "every 12 hours");
		ReqMed chocolate = new ReqMed("Chocolate", 1, 22600, "once a month");
		petsMedsPaul.add(metformin);
		petsMedsPaul.add(chocolate);

		goForIt.startHospitalizeVet("Gretel De Varona", "1006078287", "Paul", paulMedRec, petsMedsPaul, paul);



		Person pablolondra = new Person("Pablo Londra", "1001237483", "Little Puerto Rico", "3128934055");
		Pet arnold = new Pet("Arnold", "Cat", 2.0, 20.0, 0.48, pablolondra);
		Pet francis = new Pet("Francis", "Bird", 4.0, 3.2, 0.15, pablolondra);
		ArrayList<Pet> pablolondraPets = new ArrayList<Pet>();
		pablolondraPets.add(arnold); pablolondraPets.add(francis);
		goForIt.createPerson(pablolondra, pablolondraPets);

		DateIn arnoldDate = new DateIn (2, 1, 2019);
		MedRecord arnoldMedRec = new MedRecord("", "", "Chills, persistent diarrhea, vomiting ", "Pacient seems to have cancer", "Open", arnoldDate , francis);
		ArrayList<ReqMed> petsMedsArnold = new ArrayList<ReqMed>();
		ReqMed acetaminophen = new ReqMed("Acetaminophen", 24, 2000, "every 7 hours");
		petsMedsArnold.add(acetaminophen);
		goForIt.startHospitalizeVet("Pablo Londra", "1001237483", "Arnold", arnoldMedRec, petsMedsArnold, arnold);


		DateIn francisDate = new DateIn (12, 2, 2019);
		MedRecord aMedRec = new MedRecord("", "", "Weakness, fatigue, persistent diarrhea, vomiting ", "Pacient seems to have aids", "Open", francisDate , francis);
		ArrayList<ReqMed> petsMeds = new ArrayList<ReqMed>();
		ReqMed dolex = new ReqMed("Dolex", 12, 3000, "every 3 hours");
		petsMeds.add(dolex);

		goForIt.startHospitalizeVet("Pablo Londra", "1001237483", "Francis", aMedRec, petsMeds, francis);

		

		
		
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
		System.out.println("3. Show person’s contact info of a hospitalized pet by putting owner’s name or pet’s name.");
		System.out.println("4. Register a service.");
		System.out.println("5. Hospitalize a pet.");
		System.out.println("6. Show service reports between two dates.");
		System.out.println("7. Show medical records from hospitalized pets.");
		System.out.println("8. Edit a medical record from a pet.");
		System.out.println("9. Discharge a pet.");
		System.out.println("10.Show income.");
		System.out.println("11.Show average income per service.");
		System.out.println("12.Show average income by week.");
		System.out.println("13.Show occupied mini room based on pet's full name.");
		System.out.println("14.Show records from a pet.");
		System.out.println("15.Edit address or phone number from a client.");
		System.out.println("16.QUIT PROGRAM");
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
                                                                                          

		while (userInput != 16){

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


				//REGISTER A DONE SERVICE
				case 4: 
					registerAService();
					break;


				//HOSPITALIZE A PET
				case 5:
					hospitalizeAPet();
					break; 

				//SHOW SERVICE REPORTS BETWEEN TWO DATES
				case 6:
					serviceReportsBetweenDates();
					break; 

				//SHOW MEDICAL RECORDS FROM HOSPITALIZED PETS
				case 7: 
					showMedRecsFromHPet();
					break; 

				//EDIT A MEDICAL RECORD FROM A PET
				case 8: 
					editMedRecFromAPet();
					break;

				//DISCHARGE A PET
				case 9: 
					dischargeAPet();
					break;

				//SHOW TOTAL INCOME AND INCOME BY SERVICE
				case 10: 
					showIncome();
					break;

				//SHOW AVERAGE INCOME 
				case 11: 
					showAverageIncome();
					break;

				//SHOW AVERAGE INCOME 
				case 12: 
					showAverageIncomeByWeek();
					break;


				//SHOW OCCUPIED MINI ROOM BASED ON PET'S NAME
				case 13: 
					showMiniRoomNumberByPetsName();
					break;

				//SHOW RECORDS FROM A PET
				case 14: 
					showAllMedRecs4Pet();
					break;


				//EDIT CLIENTS INFO
				case 15: 
					changeClientsInfo();
					break;

				//QUIT PROGRAM
				case 16: 
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
				System.out.print("How tall is the pet (metres)? "); double height = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.println("");

				

					if(species.equals("ERROR: Invalid species selection.")){
					System.out.println(species);
					--i;


					} else{ Pet theNewPet = new Pet(petsName, species, age, weight, height, theNew);
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

					goForIt.startHospitalizeVet(name, id, petsName, newMedRec, petsMeds, sick);

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
		System.out.println("TOTAL INCOME: "+goForIt.totalIncome()+" COP");
		System.out.println("");
		System.out.println("INCOME BY SERVICE ");
		System.out.println("Income for hospitalizations: "+goForIt.gatherAllHospitalizationFees()+" COP");
		System.out.println("Income for baths: "+goForIt.feeServicesVeterinary(1)+" COP");
		System.out.println("Income for baths to go: "+goForIt.feeServicesVeterinary(2)+" COP");
		System.out.println("Income for dental prophylaxis: "+goForIt.feeServicesVeterinary(3)+" COP");
		System.out.println("Income for cutting nails: "+goForIt.feeServicesVeterinary(4)+" COP");
		System.out.println("Income for vaccinations: "+goForIt.feeServicesVeterinary(5)+" COP");
		System.out.println("");

	}


	public void showAverageIncome(){

		System.out.println("");
		System.out.println("AVERAGE INCOME BY SERVICE");
		System.out.println("");
		System.out.println("Hospitalizations: "+goForIt.hospitalizationAverage()+" COP");

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
			System.out.println("");
			System.out.println(petsName+" has been successfully discharged!");
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
			System.out.println("3. Prescribed medication.");
			typeSelectionMssg();
			int edition = reader.nextInt(); reader.nextLine();
			plainLine();

			String symptomsEdit = "";
			String diagnosysEdit = "";
			String medsName = "";
			double medsDose = 0.0;
			double medsPrice = 0.0;
			String medsFrecuency = "";			
			
			switch (edition) {
				case 1: 	
					System.out.print("Please type the pet's symptoms: "); symptomsEdit = reader.nextLine();
					goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, medsName, medsDose, medsPrice, medsFrecuency);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
					break;

				case 2: 
					System.out.print("Please type the pet's diagnosys: "); diagnosysEdit = reader.nextLine();
					goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, medsName, medsDose, medsPrice, medsFrecuency);
					System.out.println("");
					System.out.println("Current medical record from "+petsName+" has been edited");
					System.out.println("");
					break;

				case 3:

					System.out.println("");
					System.out.print("Please type the medicine's name: ");  medsName = reader.nextLine();
					System.out.print("Please type the medicine's dose: ");  medsDose = reader.nextDouble(); reader.nextLine();
					System.out.print("Please type the medicine's price per dose: ");  medsPrice = reader.nextDouble(); reader.nextLine();
					System.out.print("Please type the medicine's frecuency: ");  medsFrecuency = reader.nextLine();

					if(!(medsName.equals("")) && medsDose != 0 ){
						System.out.println("");
						System.out.println(goForIt.locatePersonWithPet2AddStuff(name, id, petsName, edition, symptomsEdit, diagnosysEdit, medsName, medsDose, medsPrice, medsFrecuency));
						System.out.println("");
						
					} else{ System.out.println("ERROR: Prescribed medication could not be added, fields are incomplete"); }
					
					break;
				
				default: 
					System.out.println("");
					System.out.println("ERROR: Invalid selection.");
					System.out.println("");
					break;
				}
			} else{ System.out.println("ERROR: Pet does not have an open medical record"); }

		} else { System.out.println("ERROR: No match found"); }

	}


	public void changeClientsInfo(){
		System.out.println("");
		System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
		System.out.println("");
		System.out.println("Please select what you would like to edit:");
		System.out.println("1. Address.");
		System.out.println("2. Phone.");
		typeSelectionMssg();
		int edition = reader.nextInt(); reader.nextLine();
		plainLine();
		String newAddress = "";
		String newPhone = "";

		switch (edition) {
			case 1: 
				System.out.print("Please type the new address: ");  newAddress = reader.nextLine();
				System.out.println("");
				System.out.println(goForIt.changeClientInfo(name, id, newAddress, newPhone));
				break;
			case 2:	
				System.out.print("Please type the new phone number: ");  newPhone = reader.nextLine();
				System.out.println("");
				System.out.println(goForIt.changeClientInfo(name, id, newAddress, newPhone));
				break;
			default:
				System.out.println("");
				System.out.println("ERROR: Invalid selection.");
				System.out.println("");
				break;	
		}

	}


	public void registerAService(){
		System.out.println("");
		System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
		System.out.print("Please type the owner's full name: "); String name = reader.nextLine();
		System.out.print("Please type the owner's ID: "); String id = reader.nextLine();
		System.out.println("");

		if(goForIt.checkOwner(name, id, petsName)){

			System.out.println("Please select the service to register:");
			System.out.println("1. Bath.");
			System.out.println("2. Bath to go.");
			System.out.println("3. Dental prophylaxis.");
			System.out.println("4. Cutting nails.");
			System.out.println("5. Vaccination.");
			typeSelectionMssg();
			int serviceSelection = reader.nextInt(); reader.nextLine();
			plainLine();

			char serviceChar = goForIt.convertChoise2Char(serviceSelection);

			if(serviceChar != 'a'){

				System.out.println("");
				System.out.print("Please type the day that the service is taking/took place: "); int day = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the month that the service is taking/took place: "); int month = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the year that the service is taking/took place: "); int year = reader.nextInt(); reader.nextLine();

				Calendar today = new GregorianCalendar();
				int yearT = today.get(Calendar.YEAR);

				if (year <= yearT ) {
					DateIn newDateJob = new DateIn(day, month, year);
					Pet clientPet = goForIt.retrievePet(name, id, petsName);
					Service newService = new Service(serviceChar, id, petsName, clientPet, newDateJob);
					goForIt.startServiceVet(name, id, clientPet, newService);
					System.out.println("");
					System.out.println("The service has been successfully registered!");
					System.out.println("");


				}else {System.out.println("");
						System.out.println("ERROR: Invalid date.");
						System.out.println("");}

			}else {System.out.println("");
				   System.out.println("ERROR: Invalid selection.");
				   System.out.println("");}

		} else {System.out.println("");
				System.out.println("ERROR: No match found.");
				System.out.println("");}


	}



	public void serviceReportsBetweenDates(){

		System.out.println("");
		System.out.print("Please type the day of the initial date: "); int day = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the month of the initial date: "); int month = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the year of the initial date: "); int year = reader.nextInt(); reader.nextLine();

		Calendar today = new GregorianCalendar();
		int yearT = today.get(Calendar.YEAR);

		if (year <= yearT ) {
			System.out.println("");
			System.out.print("Please type the day of the final date: "); int dayE = reader.nextInt(); reader.nextLine();
			System.out.print("Please type the month of the final date: "); int monthE = reader.nextInt(); reader.nextLine();
			System.out.print("Please type the year of the final date: "); int yearE = reader.nextInt(); reader.nextLine();

			if (yearE <= yearT ) {

				if (year <= yearE) {
					DateIn initialDate = new DateIn (day, month, year);
					DateIn finalDate = new DateIn (dayE, monthE, yearE);
					
					System.out.println(goForIt.datesServiceReports(initialDate, finalDate));

				} else {System.out.println("");
				   System.out.println("ERROR: Invalid date.");
				   System.out.println("");}
				

			} else {System.out.println("");
				   System.out.println("ERROR: Invalid date.");
				   System.out.println("");}

		} else {System.out.println("");
			   System.out.println("ERROR: Invalid date.");
			   System.out.println("");}
	}


	public void showAverageIncomeByWeek(){
		System.out.println("");
		System.out.print("Please type the day of the initial date: "); int day = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the month of the initial date: "); int month = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the year of the initial date: "); int year = reader.nextInt(); reader.nextLine();

		Calendar today = new GregorianCalendar();
		int yearT = today.get(Calendar.YEAR);

		if (year <= yearT ) {

			DateIn initialDate = new DateIn (day, month, year);

			//****************************************
			//******************TODO******************
			//****************************************

		}else {System.out.println("");
				   System.out.println("ERROR: Invalid date.");
				   System.out.println("");}

	}
	



						


} //final