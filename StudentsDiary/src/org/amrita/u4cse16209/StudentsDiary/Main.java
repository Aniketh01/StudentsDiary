package org.amrita.u4cse16209.StudentsDiary;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		String basePath = new File("src/org/amrita/u4cse16209/StudentsDiary/StudentProfile.txt").getAbsolutePath();
		
//		System.out.print(basePath);
		
		File ProfileFile = new File(basePath);
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
	}

}
