/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Student Class manages most of the details regarding the student accordance with the
 * college related profile rather than any person data.
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.io.Serializable;

public class Student implements Serializable{
	private String studentName;
    private String studentNo;
    private String email;
    private int year;
    private String campus;
    
    @Override
    public String toString() {
         return ("StudentName:"+this.getStudentName()+
                     " Student No: "+ this.getStudentNo() +
                     " Email: "+ this.getEmail() +
                     " Year : " + this.getYear() + 
                     " Campus: " + this.getCampus());
    }

    public Student() {
        this.studentName = null;
        this.studentNo = null;
        this.email = null;
        this.year = -1;
        this.campus = null;
    }

    public Student(String nName, String nNum, String nEmail, String campus, int nYr) {
        this.studentName = nName;
        this.studentNo = nNum;
        this.email = nEmail;
        this.year = nYr;
        this.campus = campus;
    }

    public void setStudentName(String newStudentName) {
        this.studentName = newStudentName;
    }

    public void setStudentNo(String newStudentNo) {
        this.studentNo = newStudentNo;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
    
    public void setCampus(String campus) {
    	this.campus = campus;
    }
    
    public String getCampus() {
    	return campus;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }
}
