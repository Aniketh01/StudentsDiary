package org.amrita.u4cse16209.StudentsDiary;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	
	public final static String PATH = "/home/aniketh/devel/src/StudentsDiary/StudentsDiary/src/org/amrita/u4cse16209/StudentsDiary/";
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		Profile profile = new Profile();
		
		final String FileName = PATH + "StudentProfile.txt";
		File newcreate = new File(FileName);
		FileReader file = new FileReader(newcreate);
		BufferedReader buffer = new BufferedReader(file);
				
		ArrayList<Profile> List = new ArrayList<Profile>();
		String line = null;
		
		while((line = buffer.readLine()) != null){
			String[] words = line.split(",");	
			Profile item = profile.addProfile(words[0], words[1], words[2]);
			List.add(item);
		}
		
		buffer.close();
	}

}
