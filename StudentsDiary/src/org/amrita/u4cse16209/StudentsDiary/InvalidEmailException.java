package org.amrita.u4cse16209.StudentsDiary;

public class InvalidEmailException extends Exception{
	public InvalidEmailException() {
		super("Entered email address is not acceptable");
	}

}
