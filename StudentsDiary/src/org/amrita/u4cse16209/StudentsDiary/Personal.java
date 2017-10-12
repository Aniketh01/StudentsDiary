package org.amrita.u4cse16209.StudentsDiary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


public class Personal implements Serializable {
	String phoneNumber;
	String address;
	String email;
	
	public Personal() {
		phoneNumber = "";
		address = "";
		email = "";
	}
	
	public Personal(String phoneNumber, String address, String email) {
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void getPersonalData()
	{
	        try {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your phone number");
	        phoneNumber =sc.next();
	        int l = phoneNumber.length();
	        if(l!=10) throw new InvalidPhoneNoException();
	        System.out.println("Enter the address");
	        address=sc.next();
	        System.out.println("Enter the email");
	        email=sc.next();
	        String s = "@";
	        if(!email.contains(s)) throw new InvalidEmailException();

	        }

	        catch(InvalidPhoneNoException e) {
	                System.out.println(e);
	                System.exit(0);
	        }

	        catch(InvalidEmailException i) {
	                System.out.println(i);
	                System.exit(0);
	        }
	}
	
	public void readFile() {

        try {
                FileInputStream f = new FileInputStream("Personal.ser");
                ObjectInputStream o = new ObjectInputStream(f);
                Personal p = (Personal)o.readObject();
                phoneNumber = p.getPhoneNumber();
                address = p.getAddress();
                email = p.getEmail();
        }

        catch(FileNotFoundException fof) {
                System.out.println("File not found!");
        }

        catch(IOException ioe) {
                System.out.println("File may be corrupt!");
        }

        catch(ClassNotFoundException cnf) {
                System.out.println("Class not found!");
        }
	}

}



