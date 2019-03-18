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

package model;

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



//RELATIONSHIPS



//METHODS

public MedRecord(String petInfo, String ownerInfo, String symptoms, String diagnosys, String status){
	this.petInfo = petInfo;
	this.ownerInfo = ownerInfo;
	this.symptoms = symptoms;
	this.diagnosys = diagnosys;
	this.status = status;
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










 
 } //final