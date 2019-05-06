/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 3 MAY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.*;

public class MedRecord{

	//CONSTANTS

	public final static String OPEN = "Open";
	public final static String CLOSED = "Closed";
	public final static int P10 = 10000;
	public final static int P12 = 12000;
	public final static int P15 = 15000;
	public final static int P17 = 17000;
	public final static int P20 = 20000;
	public final static int P25 = 25000;
	public final static int P30 = 30000;
	public final static int P33 = 33000;



	//ATTRIBUTES
	private String petInfo;
	private String ownerInfo;
	private String symptoms;
	private String diagnosys;
	private String status;
	private double fee;



	//RELATIONSHIPS
	private DateIn dateInn;
	private DateIn dateOut;
	private Pet sick;
	private ArrayList<ReqMed> med;



	//METHODS

	/**
	* Constructor method for class MedRecord which is a medical record for the veterinary. <br>
	* @param petInfo The pet's information for the hospitalization. This param must not be empty.
	* @param ownerInfo The pet's owner information for the hospitalization. This param must not be empty.
	* @param symptoms The symptoms of the pet for the medical record. 
	* @param diagnosys The diagnosys of the pet for the medical record. 
	* @param status The status of the medical record. This param must not be empty.
	* @param dateInn The date (object) when the hospitalization started. This param must not be null.
	* @param sick The pet (object) in matter for the medical record. This param must not be null.
	*/

	public MedRecord(String petInfo, String ownerInfo, String symptoms, String diagnosys, String status, DateIn dateInn, Pet sick){
		this.petInfo = petInfo;
		this.ownerInfo = ownerInfo;
		this.symptoms = symptoms;
		this.diagnosys = diagnosys;
		this.status = status;
		this.dateInn = dateInn;
		this.sick = sick;
		this.dateOut = dateOut;
		med = new ArrayList<ReqMed>();
		this.fee = calculatingFee(); 
		
	}


	/**
	* Allows to get the information (name, type of animal, age in years, weight in Kg, height in metres and BMI) 
	* from the pet in matter of a medical record. <br>
	* @return The information of the pet in matter of a medical record
	*/

	public  String getPetInfo() {
		return petInfo;
	}


	/**
	* Allows to change the pet's information for a hospitalization. <br>
	* <b>post:</b> The pet's information for a hospitalization is changed. 
	* @param petInfo The pet's information for a hospitalization
	*/

	public void setPetInfo(String petInfo) {
		this.petInfo = petInfo;
	}



	/**
	* Allows to get the information (name, ID, address and phone number) from the owner of pet in matter of a medical record. <br>
	* @return The information from the owner of the pet in matter of a medical record
	*/

	public  String getOwnerInfo() {
		return ownerInfo;
	}


	/**
	* Allows to change the pet's owner information for a hospitalization. <br>
	* <b>post:</b> The pet's owner information for a hospitalization is changed. 
	* @param ownerInfo The pet's owner information for a hospitalization
	*/

	public void setOwnerInfo(String ownerInfo) {
		this.ownerInfo = ownerInfo;
	}



	/**
	* Allows to get the symptoms of a medical record. <br>
	* @return The symptoms of a medical record
	*/

	public  String getSymptoms() {
		return symptoms;
	}


	/**
	* Allows to change the symptoms of a hospitalization. <br>
	* <b>post:</b> The symptoms of a hospitalization is changed. 
	* @param symptoms The symptoms of a hospitalization.
	*/

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}



	/**
	* Allows to get the diagnosys of a medical record. <br>
	* @return The diagnosys of a medical record
	*/

	public  String getDiagnosys() {
		return diagnosys;
	}


	/**
	* Allows to change the diagnosys of a hospitalization. <br>
	* <b>post:</b> The diagnosys of a hospitalization is changed. 
	* @param diagnosys The diagnosys of a hospitalization.
	*/

	public void setDiagnosys(String diagnosys) {
		this.diagnosys = diagnosys;
	}


	/**
	* Allows to get the status (open or closed) of a medical record. <br>
	* @return The status of a medical record
	*/

	public  String getStatus() {
		return status;
	}


	/**
	* Allows to change the status of a hospitalization. <br>
	* <b>post:</b> The status of a hospitalization is changed. 
	* @param status The status (open/closed) of a hospitalization.
	*/

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	* Allows to get the date when the veterinary created the medical record. <br>
	* @return The date when the veterinary created the medical record
	*/
	public  DateIn getDateInn() {
		return dateInn;
	}


	/**
	* Allows to change the date (object) when the hospitalization started. <br>
	* <b>post:</b> The date (object) when the hospitalization started is changed. 
	* @param dateInn The date (object) when the hospitalization started
	*/

	public void setDateInn(DateIn dateInn) {
		this.dateInn = dateInn;
	}



	/**
	* Allows to get the date when the veterinary discharged the medical record. <br>
	* @return The date when the veterinary discharged the medical record
	*/

	public  DateIn getDateOut() {
		return dateOut;
	}


	/**
	* Allows to change the date (object) when the hospitalization ended. <br>
	* <b>post:</b> The date (object) when the hospitalization ended is changed. 
	* @param dateOut The date (object) when the hospitalization ended
	*/

	public void setDateOut(DateIn dateOut) {
		this.dateOut = dateOut;
	}



	/**
	* Allows to get the pet (object) of the medical record. <br>
	* @return The pet (object) of the medical record
	*/

	public  Pet getSick() {
		return sick;
	}


	/**
	* Allows to change the pet(object) in matter of a hospitalization . <br>
	* <b>post:</b> The pet(object) in matter of a hospitalization is changed. 
	* @param sick A pet(object)
	*/
	public void setSick(Pet sick) {
		this.sick = sick;
	}


	/**
	* Allows to get the cost of a hospitalization. <br>
	* @return The cost a hospitalization
	*/
	public  double getFee() {
		return fee;
	}


	/**
	* Allows to change the final cost of a hospitalization (for now it should not be used but maybe any time in the future it should). <br>
	* <b>post:</b> The final cost of a hospitalization is changed. 
	* @param fee The final cost of a hospitalization.
	*/
	public void setFee(double fee) {
		this.fee = fee;
	}

	/**
	* When creating a new medical record, this method allows to add the prescribed medications to the medical record for the first time. <br>
	* <b>pre:</b> The prescribed medications have been created before invocating this method. <br>
	* <b>post:</b> The prescribed medications have been added to a medical record for the first time.
	* @param petsMeds The prescribed medications. The size of this param could be greater or equal to zero.
	*/
	public void addMeds(ArrayList<ReqMed> petsMeds){
		med = petsMeds;
	}


	/**
	* Allows to calculate the cost of a hospitalization depending on the status of the medical record, the type of animal 
	* of the hospitalization and the days of the hospitalization. <br>
	* @see DateIn.getDay()
	* @see DateIn.getMonth()
	* @see DateIn.getYear()
	* @see Pet.getType()
	* @see Pet.getWeight()
	* @see ReqMed.priceMed()
	* @return The final cost a hospitalization
	*/

	public double calculatingFee(){
		double total = 0.0;

		if(sick !=  null){

			if (dateOut == null){

				Calendar today = new GregorianCalendar();
					int monthT = today.get(Calendar.MONTH) + 1;
					int dayT = today.get(Calendar.DATE);
					int yearT = today.get(Calendar.YEAR);


					dayT -= dateInn.getDay();
					
					monthT = (monthT - dateInn.getMonth()) * 30;
					
					yearT = (yearT - dateInn.getYear()) * 360;
				
					int daysDifference = (dayT + monthT + yearT);


					switch (sick.getType()) {

						case Pet.DOG:

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifference * P15);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifference * P17);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifference * P20);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifference * P25);

							}

						break;
						case Pet.CAT:

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifference * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifference * P12);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifference * P15);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifference * P20);

							}

						break;
						case Pet.BIRD: 

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifference * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifference * P12);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifference * P20);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifference * P25);

							}

						break;
						case Pet.OTHER:


							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifference * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifference * P17);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifference * P30);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifference * P33);

							}
						break;
							
					}	
					

			} else { int dayE = dateOut.getDay();
					
					int monthE = dateOut.getMonth();
					
					int yearE = dateOut.getYear();



					dayE -= dateInn.getDay();
					
					monthE = (monthE - dateInn.getMonth()) * 30;
					
					yearE = (yearE - dateInn.getYear()) * 360;

					int daysDifferenceWithEndDate = (dayE + monthE+ yearE);


					switch (sick.getType()) {

						case Pet.DOG:

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifferenceWithEndDate * P15);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifferenceWithEndDate * P17);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifferenceWithEndDate * P20);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifferenceWithEndDate * P25);

							}

						break;
						case Pet.CAT:

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifferenceWithEndDate * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifferenceWithEndDate * P12);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifferenceWithEndDate * P15);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifferenceWithEndDate * P20);

							}

						break;
						case Pet.BIRD: 

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifferenceWithEndDate * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifferenceWithEndDate * P12);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifferenceWithEndDate * P20);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifferenceWithEndDate * P25);

							}

						break;
						case Pet.OTHER:

							if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
								total = (double)(daysDifferenceWithEndDate * P10);
								
							} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
								total = (double)(daysDifferenceWithEndDate * P17);

							} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
								total = (double)(daysDifferenceWithEndDate * P30);

							} else if(sick.getWeight() > 20.0){
								total = (double)(daysDifferenceWithEndDate * P33);

							}
						break;
							
					}				
			}

			for (int i = 0; i < med.size(); i++ ) {
				total += med.get(i).priceMed();
			}					
		}
		return total;
	}


	/**
	* Information of a medical record such as pet's information, pet's owner information, dose, date when the hospitalization started and/or ended, 
	* symptoms of the pacient, diagnosys of the pacient, status of the hospitalization (open/closed), cost of the hospitalization and prescribed 
	* medication info is organized so it can be  shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing medical record <br>
	* @see ReqMed.showMedsinfo()
	* @see DateIn.convertDateToString()
	* @return The information of a medical record in a format to be shown to the final user
	*/
	public String medRecordInfo(){
		String reply = "\n";
			   reply += "\n";
		       reply +=  "+-----------------------------------------------------------------------------+\n";
			   reply += "| ****************************** MEDICAL RECORD ***************************** +\n";
			   reply += "+-----------------------------------------------------------------------------+\n";
			   reply += "|\n";
			   reply += petInfo;
			   reply += ownerInfo;
			   reply += "|\n";
			   reply += "| The date when this hospitalization started is: " +dateInn.convertDateToString()+"\n";

			   if (dateOut != null) {
			   reply += "| The date when this hospitalization ended is:" +dateOut.convertDateToString()+"\n";
			   }
			   
			   reply += "| The symptoms are: "+symptoms+"\n";
			   reply += "| The diagnosys is: "+diagnosys+"\n";
			   reply += "| The status is: "+status+"\n";
			   reply += "| The cost is: "+fee+"\n";
			   reply += "|\n";
			   reply += "+-----------------------------------------------------------------------------+\n";
			   reply += "| Prescribed medications:\n";
			   reply += "|\n";

			   int number = 0;

				for (int i = 0; i < med.size() ; i++ ) {
					++number;
					reply += "| Med #"+number+"\n";
					reply += med.get(i).showMedsinfo();			
				}

				 reply += "+-----------------------------------------------------------------------------+\n";
					   



		return reply;

	}

	/**
	* Allows to add a new prescribed medication to a medical record. <br>
	* <b>pre:</b> The new prescribed medication was created before. <br>
	* <b>post:</b> A new prescribed medication is added to a medical record.
	* @param medInMatter A new prescribed medication. Param must not be null.
	*/
	public void addNewMed(ReqMed medInMatter){
		med.add(medInMatter);
	}


 } //end of class