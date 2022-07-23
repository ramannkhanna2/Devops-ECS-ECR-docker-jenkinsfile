package lab14;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;

import javax.crypto.Cipher;

public class DecryptExample {
	public static void main(String args[]) throws Exception {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		keyPairGen.initialize(2048);
		KeyPair pair = keyPairGen.generateKeyPair();
		PublicKey publicKey = pair.getPublic();
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] input = "Vinsys IT Services".getBytes();
		cipher.update(input);
		byte[] cipherText = cipher.doFinal();
		System.out.println(new String(cipherText, "UTF8"));
		cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
		byte[] decipheredText = cipher.doFinal(cipherText);
		System.out.println(new String(decipheredText));
	}
}