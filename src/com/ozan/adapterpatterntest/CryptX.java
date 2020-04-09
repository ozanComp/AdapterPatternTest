package com.ozan.adapterpatterntest;

	public class CryptX implements Crypt {
		@Override
	    public void encrypt(String text) {
	        System.out.println("CryptX -> encrypt " + text);
	    }
	
		@Override
	    public void decrypt(String text) {
	        System.out.println("CryptX -> decrypt " + text);
	    }
	}
	
	
