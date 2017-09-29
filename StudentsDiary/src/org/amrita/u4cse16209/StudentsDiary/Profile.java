/**
 * @author Aniketh Girish
 * This class is used to get/set personal profile data of a particular student 
 * according to the data provided.
 */

package org.amrita.u4cse16209.StudentsDiary;

public class Profile {
	
		 private String name;
		 private String DOB;
		 private String age;
		 
		 public Profile() {}

		 public Profile(String name, String DOB, String age) {
			 this.name = name;
			 this.DOB = DOB;
			 this.age = age;
		 }
		 
		 public Profile addProfile(String name, String DOB, String age) {
			 this.name = name;
			 this.DOB = DOB;
			 this.age = age;
			return null;
		 }
		 
		 @Override
		 public String toString() {
		     return "Student Name: " + this.getName() + 
		            ", Student DOB: " + this.getDOB() +
		            ", Student Age: " + this.getAge();
		 }
		 
		 public String getName() {
			 return name;
		 }
		 
		 public String getDOB() {
			 return DOB;
		 }
		 
		 public String getAge() {
			 return age;
		 }
		 
		 public void Display() {
			 System.out.println("Name:" + " " + name + " " + "Age:" + " " + age + " " + "DOB:" + " " + DOB);
		 }
	}

	
	
