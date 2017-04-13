package com.pgp.example;

import org.mule.api.MuleEvent;
import org.mule.api.security.CredentialsAccessor;

public class MyCredentialAccessor implements CredentialsAccessor {

	private String credentials = "Priyobroto (Testing) <pbghosh@test.com>";
	
	public MyCredentialAccessor() {
		// TODO Auto-generated constructor stub
	}

	public MyCredentialAccessor(String credentials) {
		super();
		this.credentials = credentials;
	}

	@Override
	public Object getCredentials(MuleEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Inside getCredentials() method");
		return this.credentials;
	}

	public void setCredentials(String credentials) {
		System.out.println("Inside setCredentials() method");
		this.credentials = credentials;
	}

	@Override
	public void setCredentials(MuleEvent event, Object credentials) {
		// TODO Auto-generated method stub
		System.out.println("Inside setCredentials(MuleEvent event, Object credentials) method");

	}
}
