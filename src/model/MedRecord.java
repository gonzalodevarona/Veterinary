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

public class MedRecord{

//CONSTANTS

public final static String OPEN = "Open";
public final static String CLOSED = "Closed";



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


public  String getPetInfo() {
return petInfo;
}


public void setPetInfo(String petInfo) {
	this.petInfo = petInfo;
}



public  String getOwnerInfo() {
return ownerInfo;
}


public void setOwnerInfo(String petInfo) {
	this.ownerInfo = ownerInfo;
}



public  String getSymptoms() {
return symptoms;
}


public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}



public  String getDiagnosys() {
return diagnosys;
}


public void setDiagnosys(String diagnosys) {
	this.diagnosys = diagnosys;
}



public  String getStatus() {
return status;
}


public void setStatus(String status) {
	this.status = status;
}


public  DateIn getDateInn() {
return dateInn;
}


public void setDateInn(DateIn dateInn) {
	this.dateInn = dateInn;
}



public  DateIn getDateOut() {
return dateOut;
}


public void setDateOut(DateIn dateOut) {
	this.dateOut = dateOut;
}



public  Pet getSick() {
return sick;
}


public void setSick(Pet sick) {
	this.sick = sick;
}



public  double getFee() {
return fee;
}


public void setFee(double fee) {
	this.fee = fee;
}

public void addMeds(ArrayList<ReqMed> petsMeds){
	med = petsMeds;


}



public double calculatingFee(){
	double total = 0.0;

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
						total = (double)(daysDifference * 15000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifference * 17000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifference * 20000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifference * 25000);

					}

				break;
				case Pet.CAT:

					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifference * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifference * 12000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifference * 15000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifference * 20000);

					}

				break;
				case Pet.BIRD: 

					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifference * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifference * 12000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifference * 20000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifference * 25000);

					}

				break;
				case Pet.OTHER:


					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifference * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifference * 17000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifference * 30000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifference * 33000);

					}
				break;
					
			}

			for (int i = 0; i < med.size(); i++ ) {
					total += med.get(i).priceMed();

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
						total = (double)(daysDifferenceWithEndDate * 15000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifferenceWithEndDate * 17000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifferenceWithEndDate * 20000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifferenceWithEndDate * 25000);

					}

				break;
				case Pet.CAT:

					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifferenceWithEndDate * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifferenceWithEndDate * 12000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifferenceWithEndDate * 15000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifferenceWithEndDate * 20000);

					}

				break;
				case Pet.BIRD: 

					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifferenceWithEndDate * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifferenceWithEndDate * 12000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifferenceWithEndDate * 20000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifferenceWithEndDate * 25000);

					}

				break;
				case Pet.OTHER:


					if (sick.getWeight() >= 1.0 && sick.getWeight() <= 3.0 ) {
						total = (double)(daysDifferenceWithEndDate * 10000);
						
					} else if(sick.getWeight() > 3.0 && sick.getWeight() <= 10.0 ){
						total = (double)(daysDifferenceWithEndDate * 17000);

					} else if(sick.getWeight() > 10.0 && sick.getWeight() <= 20.0 ){
						total = (double)(daysDifferenceWithEndDate * 30000);

					} else if(sick.getWeight() > 20.0){
						total = (double)(daysDifferenceWithEndDate * 33000);

					}
				break;
					
			}
			for (int in = 0; in < med.size(); in++ ) {
					total += med.get(in).priceMed();

					}
	}


	return total;
}







 
 } //final