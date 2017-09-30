package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner; // Need to change this into Arraylist and store it into a file or serialize it.


public class FirstPeriodical {
	
	public double mark;
	
	public FirstPeriodical(int mark) {
		this.mark = mark;
	}
	
	public double getMark() {
		return mark;
	}
	
    public void setMark(double mark) {
        this.mark = mark;
    }

    public void addMark() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark");
        this.mark  = sc.nextDouble();
    }

    public String toString() {
        return "First Periodical: "+ mark;
    }

    public void Display() {
        System.out.println(toString());
    }


}
