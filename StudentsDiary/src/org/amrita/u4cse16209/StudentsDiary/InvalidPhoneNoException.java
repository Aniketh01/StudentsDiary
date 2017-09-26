package org.amrita.u4cse16209.StudentsDiary;

public class InvalidPhoneNoException extends Exception {
	InvalidPhoneNoException(){
		super("Phone no must be 10 digits");
	}
}
