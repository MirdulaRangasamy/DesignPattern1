/**
 * @Placed com.exterro.structural
 */
package com.exterro.structural;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author mrangasamy
 *
 * @date 28-May-2024
 */

class BankDetails{
	private String bankName;
	private String accHolderName;
	private long accNumber;
	public BankDetails(String bankName, String accHolderName, long accNumber) {
		super();
		this.bankName = bankName;
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
	}
	public BankDetails() {
		super();
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", accHolderName=" + accHolderName + ", accNumber=" + accNumber
				+ "]";
	}
}

interface CreditCard{
	void giveBankDetails();
	String getCreditCard();
}

class BankCustomer extends BankDetails implements CreditCard{

	@Override
	public void giveBankDetails() {
		try {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      
		   System.out.print("Enter the account holder name :");  
		   String customername=br.readLine();  
		   System.out.print("\n");  
		      
		   System.out.print("Enter the account number:");  
		   long accno=Long.parseLong(br.readLine());  
		   System.out.print("\n");  
		      
		   System.out.print("Enter the bank name :");  
		   String bankname=br.readLine();  
		      
		   setAccHolderName(customername);  
		   setAccNumber(accno);  
		   setBankName(bankname);  
		   }catch(Exception e){  
		        e.printStackTrace();  
		   }  
	}

	@Override
	public String getCreditCard() {
		long accno=getAccNumber();  
		   String accholdername=getAccHolderName();  
		   String bname=getBankName();  
		          
		   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  

	}
	
}
public class AdapterDPDemo {

	public static void main(String[] args) {
		CreditCard targetInterface= new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  
	}

}
