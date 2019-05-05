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

public class ReqMed{


	//ATTRIBUTES
	private String name;
	private double dose;
	private double pricePerDose;
	private String frecuency;


	//THIS CLASS HAS NO RELATIONSHIPS

	//METHODS

	/**
	* Constructor method for class ReqMed which is a prescribed medication. <br>
	* @param name The name of a prescribed medication. This param must not be empty.
	* @param dose The dose of a prescribed medication. This param must be greater than zero.
	* @param pricePerDose The price per dose of a prescribed medication Ex. 1900.0 (in COP). This param must be greater or equal to zero.
	* @param frecuency The frecuency of a prescribed medication.
	*/

	public ReqMed(String name, double dose, double pricePerDose, String frecuency){
		this.name = name;
		this.dose = dose;
		this.pricePerDose = pricePerDose;
		this.frecuency = frecuency;
	}


	/**
	* Allows to get the name of a prescribed medication. <br>
	* @return The name of a prescribed medication
	*/

	public  String getName() {
		return name;
	}


	/**
	* Allows to change the name of a prescribed medication. <br>
	* <b>post:</b> The name of a prescribed medication is changed. 
	* @param name The name of a prescribed medication. This param must not be empty.
	*/

	public void setName(String name) {
		this.name = name;
	}


	/**
	* Allows to get the dose of a prescribed medication. <br>
	* @return The dose of a prescribed medication
	*/

	public  double getDose() {
		return dose;
	}


	/**
	* Allows to change the dose of a prescribed medication. <br>
	* <b>post:</b> The dose of a prescribed medication is changed. 
	* @param dose The dose of a prescribed medication. This param must be greater than zero.
	*/

	public void setDose(double dose) {
		this.dose = dose;
	}


	/**
	* Allows to get the price per dose of a prescribed medication. <br>
	* @return The price per dose of a prescribed medication
	*/

	public  double getPricePerDose() {
		return pricePerDose;
	}


	/**
	* Allows to change the price per dose of a prescribed medication. <br>
	* <b>post:</b> The price per dose of a prescribed medication is changed. 
	* @param pricePerDose The price per dose of a prescribed medication. 
	*/

	public void setPricePerDose(double pricePerDose) {
		this.pricePerDose = pricePerDose;
	}


	/**
	* Allows to get the frecuency of a prescribed medication. <br>
	* @return The frecuency of a prescribed medication
	*/

	public  String getFrecuency() {
		return frecuency;
	}


	/**
	* Allows to change the frecuency of a prescribed medication. <br>
	* <b>post:</b> The frecuency of a prescribed medication is changed. 
	* @param frecuency The frecuency of a prescribed medication. 
	*/

	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}


	/**
	* Allows to calculate the price of a prescribed medication by doing: <b>dose multiplied by price per dose.</b> <br>
	* @return The final price of a prescribed medication
	*/

	public double priceMed(){
		double total = dose * pricePerDose;
		return total;
	}

	/**
	* Information of a prescribed medication such as name, dose, price per dose and frecuency is organized in a way to fit in a report 
	* format for a medical record so it can shown to the final user<br>
	* @return The information of a prescribed medication such as name, dose, price per dose and frecuency in a format to be shown further to the user
	*/

	public String showMedsinfo(){
		String reply = "";	
		reply += "| Prescribed medication's name is: "+name+"\n";
		reply += "| Prescribed medication's dose is: "+dose+"\n";
		reply += "| Prescribed medication's price per dose is: "+pricePerDose+"\n";
		reply += "| Prescribed medication's frecuency is: "+frecuency+"\n";
		reply += "| \n";

		return reply;
	}

 } //end of class