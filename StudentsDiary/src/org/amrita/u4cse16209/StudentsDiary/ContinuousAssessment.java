/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains the continuous Assessment marks of any course provided to it, by the 
 * student. 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class ContinuousAssessment {
	
public double mark;
	
	public ContinuousAssessment() {
		mark = 0;
	}
	
	public ContinuousAssessment(double mark) {
		this.mark = mark;
	}
	
	public double getMark() {
		return mark;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void addMark() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks");
		this.mark = in.nextDouble();
	}
	
	public String toString() {
		return "ContinuousAssessment:" + mark;
	}
	
	public void Display() {
		System.out.println(toString());
	}

}
