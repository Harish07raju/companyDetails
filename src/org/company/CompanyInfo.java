package org.company;

public class CompanyInfo {
	
	//method creation
	
	private void CompanyName()
	{
		System.out.println("ABC Private Limited Company");
	}
	
	private void CompanyID()
	{
		System.out.println("abc09876");
	}
	
	private void CompanyAddress()
	{
		System.out.println("No 07 OMR ROad 1st Cross Thoraipakkam, Chennai 600028.");
	}
	
	private void CompanyLocation()
	{
		System.out.println("The ABC company has been located in Mumbai");
	}
	
	private void CompanyEmployeeDetails()
	{
		System.out.println("The totall employees present upto date is 5000 people");
	}

	public static void main(String[] args) {
		//object creation
		CompanyInfo c = new CompanyInfo();
		//method calling
		c.CompanyID();
		c.CompanyName();
		c.CompanyAddress();

	}

}
