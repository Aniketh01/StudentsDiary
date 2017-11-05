package org.amrita.u4cse16209.StudentsDiary;

import java.util.ArrayList;
import java.util.Scanner;

public class Semester {
	int semester;
	ArrayList<Course> courses;
    SGPA sgpa;
    
    public Semester() {
    	semester = 0;
    	Course cr = new Course(); 
    	sgpa = new SGPA();
    	courses = new ArrayList<Course>();
    }
    
    public void addCourse()
    {
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter Which Semester?");
    	this.semester = in.nextInt();
    	
        Course cr = new Course();
        cr.addCourse();
        courses.add(cr);
    }

    public void calculateSGPA()
    {
        sgpa.setSGPA(courses);
    }
    

}
