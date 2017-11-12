package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Hostel {
	  String hostelName;
	  int roomNo;
	  
	  public void addRecords() {
		  Scanner s = new Scanner(System.in);
	      System.out.println("Which hostel do you belong to?");
	      hostelName = s.next();
	      System.out.println("Which room are you in?");
	      roomNo = s.nextInt();
	      
	      s.close();
	    }
	  
	    public void setHostel(String h) {
	        hostelName = h;
	    }
	    
	    public void setRoomNo(int r) {
	        roomNo = r;
	    }
	    
	    public String toString() {
	        return "Hostel Name: " + hostelName + "\nRoom no: " + roomNo + "\n";
	    }
	    
	    public void Display() {
	        System.out.println(this.toString());
	    }
}
