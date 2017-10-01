/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains every Second Periodical marks of any course provided to it, by the 
 * student. 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class SecondPeriodical {
public double mark;
	
	public SecondPeriodical(int mark) {
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
        return "Second Periodical: "+ mark;
    }

    public void Display() {
        System.out.println(toString());
    }


}
