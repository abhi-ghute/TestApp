package com.auth;

import java.util.HashMap;
import java.util.Map;

public class Authentication {

	Map<String, String> cred = new HashMap<String, String>();

	{
		cred.put("abg@gmail.com", "@23KJSjN$^&*!");
		cred.put("ajay@gmail.com", "@*(23KJNnK@#kjn");
		cred.put("ram@gmail.com", "@$LLnDL@32&*!");
		cred.put("om@gmail.com", "@$lknN342^&*!");
		cred.put("rajesh@gmail.com", "@$ojoNK234^&*!");
		cred.put("gopal@gmail.com", "@$32KJNNK&*!");
	}

	public String authenticate(String userID, String password) {

		if (cred.containsKey(userID)) {
			if (cred.get(userID).equals(password)) {
				return "success";
			} else {
				return "failure";
			}
		} else {
			return "failure";
		}
	}

}
