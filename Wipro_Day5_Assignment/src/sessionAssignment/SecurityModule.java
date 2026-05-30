package sessionAssignment;

final class SecureMod{
	
	public void encryptiondata(String data) {
		System.out.println("Encrypting data : " + data);
	}
	
	public void decryptiondata(String data) {
		System.out.println("Decrypting data : " + data);
	}
	
}


/*
class AdvancedSecurity extends SecureMod {
    // Not allowed
}*/

public class SecurityModule {

	 public static void main(String[] args) {

		 SecureMod obj = new SecureMod();
	        obj.encryptiondata("Hello");
	        obj.decryptiondata("EncryptedText");
	    }
}
