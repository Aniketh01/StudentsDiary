package org.amrita.u4cse16209.StudentsDiary;

public class Profile {
	
		 private String name;
		 private String college;
		 private String campus;
		 private String branch;
		 private int DOB;
		 private int age;
		 private int year_of_joining;
		 private int year_of_graduation;
		 
		 public void setPersonalDetails(String name, int age, int DOB) {
			 this.name = name;
			 this.age = age;
			 this.DOB = DOB;	 
		 }
		 
		 public void setCollegeDetails(String college, String campus, String branch) {
			 this.college = college;
			 this.campus = campus;
			 this.branch = branch;
		 }
		 
		 public void setYears(int year_of_joining, int year_of_graduation) {
			 this.year_of_joining = year_of_joining;
			 this.year_of_graduation = year_of_graduation;
		 }
		 
		 public void displayProfile() {
			 System.out.println(name + " " + age + " " + DOB + " ");
			 System.out.println(college + " " + campus + " " + branch + " ");
			 System.out.println(year_of_joining + " " + year_of_graduation);
		 }
	}

	
	
