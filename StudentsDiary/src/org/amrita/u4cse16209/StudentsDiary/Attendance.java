package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Attendance {
	private boolean attendance;
	private String date;
	
	public Attendance() {
		attendance = false;
		date = "";
	}
	
	public Attendance(String date, boolean attendace) {
		this.date = date;
		this.attendance = attendace;
	}
	
	public void addAttendance() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the date");
		this.date = in.next();
		
		System.out.println("Enter the attendace: Yes/ No");
		String type = in.next();
		if(type == "Yes") {
			this.attendance = true;
		}
		else if(type == "No") {
			this.attendance = false;
		}
		else {
			System.out.println("Enter the type correctly");
		}
	}

}
