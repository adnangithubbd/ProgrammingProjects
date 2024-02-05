import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
//Advanced Encryption Standard
public class message {
    public static void main(String[] args) {
        try{
            SecretKey secretKey = generateSecretKey();
             
          
            System.out.println("secret key    "+secretKey);
            String originalMessage = "This is a secret message.";

            String encryptedMessage = encrypt(originalMessage, secretKey);
            System.out.println("Encrypted Message: " + encryptedMessage);
            System.out.println(decrypt(encryptedMessage, secretKey));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


      private static SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // You can use 128, 192, or 256 bits key size
        return keyGenerator.generateKey();
    }

    // Encrypt data using AES algorithm
    private static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Decrypt data using AES algorithm
    private static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}
