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
import java.util.*;

public class Pet{

//CONSTANTS

public final static String DOG = "Dog";
public final static String CAT = "Cat";
public final static String BIRD = "Bird";
public final static String OTHER = "Other";



//ATTRIBUTES
private String name;
private String type;
private double age;
private double weight;
private boolean hospitalizedBefore;
private boolean hospitalizedNow;


//RELATIONSHIPS



//METHODS

public Pet(String name, String type, double age, double weight){
	this.name = name;
	this.type = type;
	this.age = age;
	this.weight = weight;
	this.hospitalizedBefore = false;
	this.hospitalizedNow = false;
}


public  String getName() {
return name;
}


public void setName(String name) {
	this.name = name;
}


public  String getType() {
return type;
}


public void setType(String type) {
	this.type = type;
}



public  double getAge() {
return age;
}


public void setAge(double age) {
	this.age = age;
}



public  double getWeight() {
return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}


public  boolean getHospitalizedBefore() {
return hospitalizedBefore;
}


public void setHospitalizedBefore(boolean hospitalizedBefore) {
	this.hospitalizedBefore = hospitalizedBefore;
}



public  boolean getHospitalizedNow() {
return hospitalizedNow;
}


public void setHospitalizedNow(boolean hospitalizedNow) {
	this.hospitalizedNow = hospitalizedNow;
}








 
 } //final