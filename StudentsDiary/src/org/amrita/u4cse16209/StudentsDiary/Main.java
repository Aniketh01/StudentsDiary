package org.amrita.u4cse16209.StudentsDiary;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	
	public final static String PATH = "/home/aniketh/devel/src/StudentsDiary/StudentsDiary/src/org/amrita/u4cse16209/StudentsDiary/";
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		final String FileName = PATH + "StudentProfile.dat";
		FileReader file = new FileReader(FileName);
		BufferedReader buffer = new BufferedReader(file);
		
		String line = null;
		
		Profile prof = new Profile("Aniketh", "11/03/1998", "18");
		
		ArrayList<Profile> List = new ArrayList<Profile>();
		
		while((line = buffer.readLine()) != null) {
			String[] words = line.split(",");
			
		}
		
		buffer.close();
	}

}
