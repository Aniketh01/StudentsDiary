/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains the courses provided by the university to the students.
 * This is handled according to the FirstPeriodical, SecondPeriodical, EndSemester, 
 * Internals and Even Continuous Assessment. 
 * 
 * Provision to Add courses and calculations of different items such as internals are also 
 * Integrated to this class. 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Course {
	
	private String courseName;
	private String courseCode;
	private FirstPeriodical one;
	private SecondPeriodical two;
	private EndSemesterExam ese;
	private Internals in;
	private ContinuousAssessment ca;
	private GPA gpa;
	
	public Course() {
		one = new FirstPeriodical();
		two = new SecondPeriodical();
		ese = new EndSemesterExam();
		in = new Internals();
		ca = new ContinuousAssessment();
	}
	
	public void addCourse() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the CourseName");
		courseName = input.nextLine();
		System.out.println("Enter the courseCode");
		courseCode = input.nextLine();
	}
	
	public void CalculateInternal() {
		in.calculate(one, two, ca);
	}
	
	public void CalculateGPA() {
		gpa.calculateGPA(in, ese);
	}
	
    public String toString()
    {
        return "Course Name:"+ courseName + " " + "Course Code:" + courseCode + " "+one.toString()+two.toString()+ese.toString()+in.toString()+ca.toString();
    }
    
    public void Display() {
    	System.out.println(toString());    	
    }

}
