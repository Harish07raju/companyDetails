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

	public void CompanyProjrct()
	{
		System.out.println("Project of amazon delivary");
	}
	
	public void CompanyGSTNumber()
	{
		System.out.println("GST Number is 00000000000");
	}

	public void CompanyManager()
	{
		System.out.println("COmpany Manager is Mr.Rajiv");
	}
	public static void main(String[] args) {
		//object creation
		CompanyInfo c = new CompanyInfo();
		c.CompanyName();
		c.CompanyID();
		c.CompanyName();
		c.CompanyAddress();
		c.CompanyLocation();
		c.CompanyEmployeeDetails();
		c.CompanyProjrct();
		c.CompanyGSTNumber();
		
		


	}

}
