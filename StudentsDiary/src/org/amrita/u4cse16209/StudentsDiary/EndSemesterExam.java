package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class EndSemesterExam {
	
	public double mark;
	
	public EndSemesterExam() {
		mark = 0;
	}
	
	public EndSemesterExam(double mark) {
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
		return "End Sem:" + mark;
	}
	
	public void Display() {
		System.out.println(toString());
	}
}
