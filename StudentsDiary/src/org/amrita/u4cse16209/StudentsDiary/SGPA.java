/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains the SGPA of any particular student according to the needs 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.ArrayList;

public class SGPA {
	private double sgpa;
	
	public SGPA() {
		sgpa = 0;
	}
	
	public void setSGPA(ArrayList<Course> CourseList) {
		for(Course courses: CourseList) {
			sgpa = courses.gpa.getGPA();
		}
		sgpa = sgpa / CourseList.size();
	}
	
	public double getSGPA() {
		return sgpa;
	}
	
	public String toString() {
		return "SGPA is" + getSGPA();
	}
	
	public void Display() {
		System.out.println(toString());
	}
}
