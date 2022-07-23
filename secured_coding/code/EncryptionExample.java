package lab14;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;

public class EncryptionExample {
	public static void main(String args[]) throws Exception {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		keyPairGen.initialize(2048);
		KeyPair pair = keyPairGen.generateKeyPair();
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
		byte[] input = "DB Java Grads Program is Live".getBytes();
		cipher.update(input);
		byte[] cipherText = cipher.doFinal();
		System.out.println(new String(cipherText, "UTF8"));
	}
}

