package Utilities;

public class Criptografia {

	public static String encrypt(String user, String password) {   
		   String sign = user + password;   
		  
		   try {   
		      java.security.MessageDigest md =   
		         java.security.MessageDigest.getInstance("MD5");   
		      md.update(sign.getBytes());   
		      byte[] hash = md.digest();   
		      StringBuffer hexString = new StringBuffer();   
		      for (int i = 0; i < hash.length; i++) {   
		         if ((0xff & hash[i]) < 0x10)   
		            hexString.append(   
		               "0" + Integer.toHexString((0xFF & hash[i])));   
		         else   
		            hexString.append(Integer.toHexString(0xFF & hash[i]));   
		      }   
		      sign = hexString.toString();   
		   }   
		   catch (Exception nsae) {   
		      nsae.printStackTrace();   
		   }   
		   System.out.println(sign);
		   
		   return sign;   
		}  
	
}
