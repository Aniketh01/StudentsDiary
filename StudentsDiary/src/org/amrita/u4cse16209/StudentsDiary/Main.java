/**
 * @author Aniketh Girish
 * Main class manages the whole project. Every call each class create to get 
 * or retrieve data is through this main class. Writing to the database and reading 
 * from the particular databases are also cover through this main class itself. 
 */

package org.amrita.u4cse16209.StudentsDiary;

// To Read from a file.
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

// Exceptions
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.IndexOutOfBoundsException;
import java.util.InputMismatchException;

import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


// To Write into a file.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


public class Main implements Serializable {
	
	// This denotes to the path of the package
	public static final String rootpath = "src/org/amrita/u4cse16209/StudentsDiary/";
	
	public static void main(String[] args) throws IOException, FileNotFoundException, InputMismatchException{
		
		// Main section Student profile.
		
		String profileBasePath = new File(rootpath + "StudentProfile.txt").getAbsolutePath();
		
//		System.out.println(profileBasePath);
		
		File ProfileFile = new File(profileBasePath);
		FileReader file = new FileReader(ProfileFile);
		BufferedReader buffer = new BufferedReader(file);
				
		ArrayList<Profile> List = new ArrayList<Profile>();
		String line = null;
		
		while((line = buffer.readLine()) != null){
			String[] words = line.split(",");	
//			Profile item = profile.addProfile(words[0], words[1], words[2]);
			List.add(new Profile(words[0], words[1], words[2]));
		}
		
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i));
		}
		
		buffer.close();
		
		// Main section for the Student Data.
		
		String DataBasePath = new File(rootpath + "StudentData.ser").getAbsolutePath();
		
	    ArrayList<Student> Data = new ArrayList<Student>();   
	    Scanner input = new Scanner(System.in);
	    
	    Student student = new Student();
	    
	    System.out.println("Add new students: ");
	    
	    System.out.println("Enter the count of student data you want to enter: ");
	    int count = input.nextInt();
	    
	    System.out.println("Enter the name of the Student: ");
	    
	    try {
	    	
	    	FileOutputStream f = new FileOutputStream(DataBasePath);
			ObjectOutputStream oos = new ObjectOutputStream(f);
	    	
	    for (int i = 0; i < count; i++) {
          
	    	System.out.println("Enter details for student: " + (i + 1));

	    	System.out.println("Enter name: ");
	    	student.setStudentName(input.next());

	    	System.out.println("Enter Number: ");
	    	student.setStudentNo(input.next());
            System.out.println("Search by student number: ");

            System.out.println("Enter email: ");
            student.setEmail(input.next());

            System.out.println("Enter year: ");
            student.setYear(input.nextInt());
            
            Data.add(student);      
	    }
	    oos.writeObject(Data);
	    
//	    for(int i = 0; i < Data.size(); i++) {
//	    	System.out.println(Data.get(i));
//		}
	    
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    try {
	    	FileInputStream inp = new FileInputStream(DataBasePath);
	    	ObjectInputStream o = new ObjectInputStream(inp);
	    	ArrayList<Student> stu = (ArrayList<Student>)o.readObject();
	    	
	    	for(Student s : stu) {
	    		stu.add(s);
	    	}
		    for(int i = 0; i < stu.size(); i++) {
		    	System.out.println(stu.get(i));
			}
	    	
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }

	}

}
