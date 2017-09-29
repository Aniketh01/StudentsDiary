/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Implements a custom Exception condition on for detecting Invalid phone
 * Number. 
 */
package org.amrita.u4cse16209.StudentsDiary;

public class InvalidPhoneNoException extends Exception {
	InvalidPhoneNoException(){
		super("Phone no must be 10 digits");
	}
}
