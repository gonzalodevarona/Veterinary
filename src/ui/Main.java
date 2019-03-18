/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 17 MARCH 2019
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
	
}




//  ******MAIN METHOD******
	public static void main(String[] args) {

		Main execute = new Main();
		execute.menu();	
	}




// *************************************INTERFACE'S METHODS*************************************

	public void showMenuOptions(){
		System.out.println("1. Register a new client.");
		System.out.println("2. Show clients & pets information.");
		System.out.println("3. Show contact information from a client.");
		System.out.println("4. Hospitalize a pet.");
		System.out.println("5. Calculate hospitalization fee.");
		System.out.println("6. Discharge a pet.");
		System.out.println("7. Show income for hospitalizations.");
		System.out.println("8. Show occupied mini room based on pet's name.");
		System.out.println("9. Show all records.");
		System.out.println("10.QUIT PROGRAM");
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




		

		

		while (userInput != 10){

			showMenuOptions();

					System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {

				//REGISTER A NEW CLIENT
				case 1: System.out.println("");
						System.out.print("Please type the client's name: "); String name = reader.nextLine();
						System.out.print("Please type the client's ID: "); int id = reader.nextInt(); reader.nextLine();
						System.out.print("Please type the client's address: "); String address = reader.nextLine();
						System.out.print("Please type the client's phone number: "); int phone = reader.nextInt(); reader.nextLine();
						System.out.println("");

						

						System.out.print("How many pets of the client are customers here?\n"); int loopsy = reader.nextInt(); reader.nextLine();

						ArrayList<Pet> clientsPets = new ArrayList();

							for(int i = 0; i < loopsy; i++){

								System.out.print("Please type the pet's name: "); String petsName = reader.nextLine();
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


								
								System.out.print("Please type the pet's age (years): "); int age = reader.nextInt(); reader.nextLine();
								System.out.println("");
								System.out.print("How much does the pet weight (Kg)? "); double weight = reader.nextDouble(); reader.nextLine();
								System.out.println("");
								System.out.println("");

								Pet theNewPet = new Pet(petsName, species, age, weight);

								clientsPets.add(theNewPet);
							}


						Person theNew = new Person(name, id, address, phone);

						System.out.println(goForIt.createPerson(theNew, clientsPets));
						System.out.println("");
						


						
				break;

				//SHOW CLIENTS & PETS INFORMATION
				case 2: 

				break; 


				//SHOW CONTACT INFORMATION FROM A CLIENT
				case 3: 
				


				break;


				//HOSPITALIZE A PET
				case 4:

				break; 

				//CALCULATE HOSPITALIZATION FEE
				case 5: 

				break; 

				//DISCHARGE A PET
				case 6:


				break;

				//SHOW INCOME FOR HOSPITALIZATIONS
				case 7:


				break;

				//SHOW OCCUPIED MINI ROOM BASED ON PET'S NAME
				case 8: 

				break;

				//SHOW ALL RECORDS
				case 9:


				break;


				//QUIT PROGRAM
				case 10: System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
						System.out.println("");
						System.out.println("THANK YOU FOR USING MY LIL PET SOFTWARE");
						System.out.println("");


				break;

				default:

				break;
			
				

				
				
				
			}

			}
		

		
		


 	

		



	





	}


} //final