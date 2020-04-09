package com.ozan.adapterpatterntest;

	public class Main {
		public static void main(String[] args) {
			try{
				Crypt crypt = new CryptX();
		        crypt.encrypt("XXXX");
		        crypt.decrypt("XXXX");
	
		        CodeX codeX = new CodeX();
		        crypt = new CodeXAdapter(codeX);
		        crypt.encrypt("XXXX");
		        crypt.decrypt("XXXX");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	