package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Events {
	  String eventName;
	    String prize;

	    public Events(){
	        eventName = "";
	        prize = "";
	    }
	    public void addEvent(){
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter event name and prize");
	        this.eventName = s.next();
	        this.prize = s.next();
	        
	        s.close();
	    }
	    public String toString(){
	        return eventName + ":  " + prize + "\n";
	    }
	    public void Display(){
	        System.out.println(this.toString());
	    }
}
