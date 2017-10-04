/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * This class maintains the GPA of any particular student according to the needs 
 * 
 */

package org.amrita.u4cse16209.StudentsDiary;

public class GPA {
	
	private double gpa;
	
	public GPA()
    {
        gpa = 0;
    }

    public void calculateGPA(Internals i, EndSemesterExam s)
    {
        gpa = (i.getMark()+s.getMark())/10;
    }

    public double getGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return "GPA: "+gpa;
    }

    public void Display()
    {
        System.out.println(toString());
    }

}
