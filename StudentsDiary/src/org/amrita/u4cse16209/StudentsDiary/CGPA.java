/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains the CGPA of any particular student according to the needs.
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.ArrayList;

public class CGPA {
	private double cgpa;
	
	public CGPA() {
		cgpa = 0;
	}
	
	public void SetCgpa(ArrayList<SGPA> sgpaList) {
		for (SGPA sgpa: sgpaList) {
			cgpa = sgpa.getSGPA();
		}
		cgpa = cgpa / sgpaList.size();
	}
	
	public double getCGPA() {
		return cgpa;
	}
	
	public String toString() {
		return 	"CGPA" + getCGPA();
	}
	
	public void Display() {
		System.out.println(toString());
	}
}


