package com.functionhalls.vedikas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "listOfFunctionHalls")
public class ListOfFunctionHalls {
  @Id
  private String id;

  private String name;
	private String ownername;
	private String location;
	private String street;
	private double pincode;

  public ListOfFunctionHalls() {

  }

 

  public ListOfFunctionHalls(String name, String ownername, String location, String street, double pincode) {
	this.name = name;
	this.ownername = ownername;
	this.location = location;
	this.street = street;
	this.pincode = pincode;
}



public String getId() {
    return id;
  }

 
  public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getOwnername() {
	return ownername;
}



public void setOwnername(String ownername) {
	this.ownername = ownername;
}



public String getLocation() {
	return location;
}



public void setLocation(String location) {
	this.location = location;
}



public String getStreet() {
	return street;
}



public void setStreet(String street) {
	this.street = street;
}



public double getPincode() {
	return pincode;
}



public void setPincode(double pincode) {
	this.pincode = pincode;
}



@Override
public String toString() {
	return "ListOfFunctionHalls [id=" + id + ", name=" + name + ", ownername=" + ownername + ", location=" + location
			+ ", street=" + street + ", pincode=" + pincode + "]";
}
}