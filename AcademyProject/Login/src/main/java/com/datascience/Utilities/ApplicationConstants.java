package com.datascience.Utilities;

public interface ApplicationConstants {
	
	/* Database Access */
	String dbUrl       =  "jdbc:mysql://localhost:3306/DataScience";
	String dbUserName  =  "root";
	String dbPassword  =  "root";
	
	/*SQL's used by the application*/	
	String uIdFetch    = "Select u_Id from LOGIN where uName = ? and password = ?";
	String nameFetch   = "Select fName,lName from REGISTRATION where u_Id = ?";
	
	
	
	

}
