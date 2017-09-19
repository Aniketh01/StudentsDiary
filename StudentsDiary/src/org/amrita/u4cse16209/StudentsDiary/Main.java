package org.amrita.u4cse16209.StudentsDiary;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.Serializable;

public class Main {
	
	private static final String StudentPro = "StudentProfile.txt";
	
	public static void main(String[] args) throws IOException{
		
		File newFile = new File(StudentPro);
		FileReader file = new FileReader(newFile);
		BufferedReader buffer = new BufferedReader(file);
		
		String line = null;
		
		Profile prof = new Profile("Aniketh", "11/03/1998", "18");
		
		ArrayList<Profile> List = new ArrayList<Profile>();
		
		while((line = buffer.readLine()) != null) {
			String[] words = line.split(",");
			List.add(prof);
		}
		
		buffer.close();
	}

}
