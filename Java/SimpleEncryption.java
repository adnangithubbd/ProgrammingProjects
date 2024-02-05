public class SimpleEncryption{

    private static String encrypt(String plainText, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if ((Character.isUpperCase(c) && shifted > 'Z') || (Character.isLowerCase(c) && shifted > 'z')) {
                    shifted = (char) (c - (26 - shift));
                }
                encryptedText.append(shifted);
            } else {
                encryptedText.append(c); // Non-alphabetic characters remain unchanged
            }
        }
        return encryptedText.toString();
    }
    private static String decrypt(String encryptedText, int shift) {
        return encrypt(encryptedText, -shift);
    }

    public static void main(String[] args) {
        String originalText = "This 12 is a secret message.";
        int shiftValue = 12; // Shift value for the substitution cipher

        String encryptedText = encrypt(originalText, shiftValue);
        System.out.println("Encrypted: ---------- " + encryptedText);

        String decryptedText = decrypt(encryptedText, shiftValue);
        System.out.println("Decrypted: " + decryptedText);
    }
}