package com.auth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class AuthenticationTest {
	
	@DisplayName("Checking with invalid username")
	@Test
	public void testWithInvalidUser() {
		
		Authentication auth = new Authentication();
		
		Assertions.assertEquals("failure", auth.authenticate("abg1@gmail.com", "@23KJSjN$^&*!"));
		
	}
	
	@DisplayName("Checking with invalid password")
	@Test
	public void testWithInvalidPassword() {
		
		Authentication auth = new Authentication();
		
		Assertions.assertEquals("failure", auth.authenticate("abg@gmail.com", "N$^&*!"));
		
	}
	
	@DisplayName("Checking with invalid userName and passworrd")
	@Test
	public void testWithInvalidDetails() {
		
		Authentication auth = new Authentication();
		
		Assertions.assertEquals("failure", auth.authenticate("gKJN@gmail.com", "JSjN$^&*!"));
		
	}
	
	@DisplayName("Checking with valid Credentials")
	@Test
	public void testWithvalidDetails() {
		
		Authentication auth = new Authentication();
		
		Assertions.assertEquals("success", auth.authenticate("abg@gmail.com", "@23KJSjN$^&*!"));
		
	}
	
}
