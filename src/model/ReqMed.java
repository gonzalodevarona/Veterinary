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

public class ReqMed{


//ATTRIBUTES
private String name;
private double dose;
private double pricePerDose;
private String frecuency;


//RELATIONSHIPS



//METHODS

public ReqMed(String name, double dose, double pricePerDose, String frecuency){
	this.name = name;
	this.dose = dose;
	this.pricePerDose = pricePerDose;
	this.frecuency = frecuency;
}


public  String getName() {
return name;
}


public void setName(String name) {
	this.name = name;
}


public  double getDose() {
return dose;
}


public void setDose(double dose) {
	this.dose = dose;
}



public  double getPricePerDose() {
return pricePerDose;
}


public void setPricePerDose(double pricePerDose) {
	this.pricePerDose = pricePerDose;
}



public  String getFrecuency() {
return frecuency;
}


public void setFrecuency(String frecuency) {
	this.frecuency = frecuency;
}



public double priceMed(){
	double total = dose * pricePerDose;
	return total;
}


public String showMedsinfo(){

	String reply = "";

	
	reply += "| Prescribed medication's name is: "+name+"\n";
	reply += "| Prescribed medication's dose is: "+dose+"\n";
	reply += "| Prescribed medication's price per dose is: "+pricePerDose+"\n";
	reply += "| Prescribed medication's frecuency is: "+frecuency+"\n";
	reply += "| \n";

	

	return reply;

}









 
 } //final