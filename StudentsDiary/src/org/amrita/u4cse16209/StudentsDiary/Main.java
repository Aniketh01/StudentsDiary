/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Main class manages the whole project. Every call each class create to get 
 * or retrieve data is through this main class. Writing to the database and reading 
 * from the particular databases are also cover through this main class itself. 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws Exception{
		
		int Scount = 0;
		int ch = 0;
		System.out.println("Enter the count of students you want to enter");
		Scanner input = new Scanner(System.in);
		Scount = input.nextInt();
		// Main section Student profile.
	
		DataBaseManager manager = new DataBaseManager();
		Student s1[] = new Student[Scount];
		Dues due = new Dues();
		Internals internal = new Internals();
		Hostel hostel = new Hostel();
		Personal personal = new Personal();
		
		Events event = new Events();
		Library lib = new Library();
		ParentDetails parent = new ParentDetails();
		Club club = new Club();
		
		
		int b=0;
	    while(b!=1) {
	    System.out.println("Enter your choice :\n1.Write files into Student and Display \n2. Enter and display dues \n3.Write and display personal data \n4.Enter and display Hostel details \n5. Details of Events \n6. Enter parents details \n7. Enter library details \n8. Enter club details \n9. Exit");
	    ch=input.nextInt();
	    
	    switch(ch) {
	    case 1: for (int i = 0; i < Scount; i++) {
	    			manager.serializeWriteData();
	    		}
	    break;
	    case 2: for(int k=0; k < Scount; k++) {
	    			due.newDue();
	    			due.Display();
	    		}
	    break;
	    case 3: for (int j = 0; j < Scount; j++) {
	    			personal.getPersonalData();
	    			personal.writeToFile();
	    			personal.readFile();
	    }
	    break;	    
	    case 4: for (int c = 0; c < Scount; c++) {
	    			hostel.addRecords();
	    			hostel.Display();
	    }
	    break;
	    case 5: for(int a = 0; a < Scount; a++) {
	    	event.addEvent();
	    	event.Display();
	    }
	    	break;
	    case 6: for(int x = 0; x < Scount; x++) {
	    	lib.addFine();
	    	lib.getFine();
	    	lib.toString();
	    }
	    	break;
	    case 7: for(int y = 0; y < Scount; y++) {
	    	parent.getParentDetails();
	    	parent.displayData();
	    }
	    	break;
	    case 8: for(int y = 0; y < Scount; y++) {
	    	club.addDetail();
	    	club.Display();
	    }
	    	break;
	    case 9: return;		
	}
	    }
	}
}
