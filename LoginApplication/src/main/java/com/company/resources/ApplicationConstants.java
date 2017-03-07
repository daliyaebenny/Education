package com.company.resources;

public class ApplicationConstants {

	/* Action Mapping */
	public static final String SUCCESS  =  "success";
	public static final String FAILURE  =  "failure";
	/* Database Acess */
	public static final String dbUrl  =  "jdbc:mysql://localhost:3306/shopservice";
	public static final String dbUserName  =  "root";
	public static final String dbPassword  =  "root";

	/* Sqls used */
	public static final String trolleyInsert     =  "insert into trolley (pname,price,quantity,uname)"
			+ " values (?, ?, ?,?)";;
	public static final String stockFromProduct  =  "Select stock from product where pname = ?";
	public static final String updateStock       =  "Update product set stock = ? where pname = ?";

	public static final String addressInsert     =  "insert into address (fname,lname,street,city,state,country,postcode,uname,addrType) values (?, ?, ?,?,?,?,?,?,?)";
	public static final String addressFetch      =  "SELECT * FROM address WHERE  uname  =  ? and addrType  =  ?";

	public static final String paymentInsert     =  "insert into payment(cardtype,cardnumber,expirydate,pin,uname) values (?,?,?,?,?)";
	public static final String paymentFetch      =  "SELECT * FROM payment WHERE uname  =  ?";

	public static final String productFetch      =  "SELECT * from product";
	public static final String trolleyFetch      =  "SELECT * from trolley where uname =  ? and quantity > 0";

	public static final String nameFetch         =  "SELECT Name FROM users WHERE EmailId  =  ? AND Password  =  ?";
	public static final String productFetch1     =  "SELECT * from product where pname  =  ?";
	public static final String userInsert        =  "insert into users (Name,EmailId,Password) values (?, ?, ?)";
	public static final String trolleyFetch1     =  "SELECT pname,quantity from trolley where uname =  ? and quantity > 0";

	public static final String trolleyFetch2  	 =  "select quantity from trolley where uname  =  ? and pname = ?";
	public static final String trolleyUpdate  	 =  "update trolley set quantity  =  ? where uname  =  ? and pname = ?";
	public static final String trolleyDelete     =  "delete from trolley where quantity  =  0";
	public static final String productUpdate     =  "update product set stock = ? where pname = ?";
	
	public static final String paymentModeFetch  =  "Select type from payment_modes where Flag  =  ?";
	
}
