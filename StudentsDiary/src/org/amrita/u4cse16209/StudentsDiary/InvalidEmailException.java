/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Implements a custom Exception condition on for detecting Invalid Email
 * Address. 
 */

package org.amrita.u4cse16209.StudentsDiary;

public class InvalidEmailException extends Exception{
	public InvalidEmailException() {
		super("Entered email address is not acceptable");
	}

}
