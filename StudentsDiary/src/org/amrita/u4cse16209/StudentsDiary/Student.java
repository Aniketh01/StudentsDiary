package org.amrita.u4cse16209.StudentsDiary;

import java.io.Serializable;

public class Student implements Serializable{
	private String studentName;
    private String studentNo;
    private String email;
    private int year;
    
    @Override
    public String toString() {
         return ("StudentName:"+this.getStudentName()+
                     " Student No: "+ this.getStudentNo() +
                     " Email: "+ this.getEmail() +
                     " Year : " + this.getYear());
    }

    public Student() {
        this.studentName = null;
        this.studentNo = null;
        this.email = null;
        this.year = -1;
    }

    public Student(String nName, String nNum, String nEmail, int nYr) {
        this.studentName = nName;
        this.studentNo = nNum;
        this.email = nEmail;
        this.year = nYr;
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
