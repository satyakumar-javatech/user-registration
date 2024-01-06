package com.ibm.registration.userregistration.validation;

import java.util.regex.Pattern;

public class Utility {
	
	
	public static boolean isValid(String password) {
	    
	    Pattern passwordPattern =  Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[_#$%.]).{8,}$");

	    boolean flag=true;
	    
	    if (!passwordPattern.matcher(password).find()) {
	        flag=false;
	    }
	    
	   return flag;
	}
}
