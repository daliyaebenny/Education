package com.datascience.springboot.model;

public class User {

	private long   uId;
	private String fName;
	private String lName;
	private String eMail;
	private String phoneNo;
	private String password;

	/**
	 * @return the uId
	 */
	public long getuId() {
		return uId;
	}

	/**
	 * @param uId
	 *            the uId to set
	 */
	public void setuId(long uId) {
		this.uId = uId;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}

	/**
	 * @param eMail
	 *            the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		uId = 0;
	}

	public User(long uId, String fName, String lName, String eMail, String phoneNo, String password) {
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (uId ^ (uId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uId != other.uId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + uId + 
				", First_Name=" + fName + 
				", Last_Name=" + lName + 
				", Email=" + eMail + 
				", Phone_Number=" + phoneNo + 
				"]";
	}

}
