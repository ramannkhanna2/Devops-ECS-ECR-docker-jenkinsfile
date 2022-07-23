package lab7;

public class EncryptorFacade implements IEncryptorFacade {
	public String encrypt(String type, String text) {
		String hash = "";
		if (type == "MD5") {
			MD5 e = new MD5();
			hash = e.encrypt(text);
		} else if (type == "SHA") {
			SHA e = new SHA();
			hash = e.encrypt(text);
		} else if (type == "SHA256") {
			SHA256 e = new SHA256();
			hash = e.encrypt(text);
		}
		return hash;
	}
}