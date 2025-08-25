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
	
	private void CompanyGSTNumber()
	{
		System.out.println("The GST NUmber Is IND00998D3456");
	}


	public static void main(String[] args) {
		//object creation
		CompanyInfo c = new CompanyInfo();
		//method calling
		c.CompanyID();
		c.CompanyName();
		c.CompanyAddress();
		c.CompanyGSTNumber();
		

	}

}
