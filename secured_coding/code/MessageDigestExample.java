package lab14;

import java.security.MessageDigest;
import java.util.Base64;

public class MessageDigestExample {
	public static void main(String args[]) throws Exception {
		String someSecretMessage = "Vinsys Grads Program is Live ";
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(someSecretMessage.getBytes());
		byte[] digest = md.digest();
		System.out.println(digest);
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			hexString.append(Integer.toHexString(0xFF & digest[i]));
		}
		System.out.println("Hex format : " + hexString.toString());
		
		System.out.println(new String(Base64.getEncoder().encode(digest)));
	}
}