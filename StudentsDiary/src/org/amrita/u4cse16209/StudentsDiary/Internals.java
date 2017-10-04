/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains every internal of any course provided to it, by the 
 * student. 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

public class Internals {
	private double mark;
	
	public Internals() {
		mark = 0;
	}
	
	public void calculate(FirstPeriodical first, SecondPeriodical second, ContinuousAssessment continuous) {
		double f, s;
		f = (first.getMark()/50) * 15;
		s = (second.getMark()/50) * 15;
		mark = f + s + continuous.getMark();
	}
	
	public double getMark() {
		return mark;
	}
	
	public void Display() {
		System.out.println("Internal Marks:" + mark);
	}
}
