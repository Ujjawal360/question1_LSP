package org.howard.edu.lsp.assignment4;

public class SecurityOps {
	  public static String encrypt(String text){

		    String newText = "";
		    for (char c : text.toCharArray()) {
		      if(Character.isLetterOrDigit(c)){
		        newText += c;
		      }
		    }

		    String res1 = "";
		    String res2 = "";
		    for (int i = 0; i < newText.length(); i++) {
		      if(i % 2 == 0){
		        res1 += newText.charAt(i);
		      } else {
		        res2 += newText.charAt((i));
		      }
		    }

		    return res1 + res2;
		  }
		  
		  public static void main(String[] args) {
		    String result = encrypt("I love CSCI363");
		    System.out.println(result);
		  }
}
