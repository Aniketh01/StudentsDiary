package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Club {
	  String clubName;

	    public Club(){
	    	clubName = "";
	    }
	    
	    public Club(String clubName) {
	    	this.clubName = clubName;
	    }
	    
	    public void addDetail() {
	        System.out.println("Enter the club you belong to,otherwise enter NIL");
	        Scanner sc = new Scanner(System.in);
	        clubName = sc.next();
	        
	        sc.close();
	    }

	    public String getClub() {
	        return clubName;
	    }

	    public void setClub(String s) {
	        this.clubName = s;
	    }

	    public String toString() {
	        return "Club:" + clubName;
	    }
	    public void Display() {
	        System.out.println(this.toString());
	    }
	
}
