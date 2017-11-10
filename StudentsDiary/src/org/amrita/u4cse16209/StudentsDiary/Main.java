/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Main class manages the whole project. Every call each class create to get 
 * or retrieve data is through this main class. Writing to the database and reading 
 * from the particular databases are also cover through this main class itself. 
 */

package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws Exception{
		
		// Main section Student profile.
		DataBaseManager manager = new DataBaseManager();
		
		manager.serializeWriteData();
//		manager.serializeReadData();
		
		try {
			Scanner input = new Scanner(System.in);
		}
		
		
	}
}
