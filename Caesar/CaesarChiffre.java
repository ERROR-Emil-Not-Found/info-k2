/*
 * This class is used to en-/decrypt text by the "caesar" encryption method.
 * @link https://en.wikipedia.org/wiki/Caesar_cipher
 * 
 */

public class CaesarChiffre {
    /*
     * stores the value by which each character is shifted by encryptions. 
     */
    final int KEY;
    public CaesarChiffre(int key) {
        this.KEY = key;
        System.out.println("successfully generated NASA-cracking key: " + key);
    }


    /*
     * encrypts a given string by shifting each character by the `KEY` class attribute.
     * 
     * @param text the source text to be encrypted
     * @return encrypted text
    */
    public String encrypt(String text) {
        String encrypted = "";
        for(char c : text.toUpperCase().toCharArray()) {
            char encryptedChar = (char) (
                (((c - 'A') + KEY) % 26) % 26 + 'A'
            );

            if (encryptedChar < 65) {
                encryptedChar += 26;
            }

            encrypted += encryptedChar;
        }

        return encrypted;
    }

    /*
     * decrypts a given text by shifting each character by the `KEY´ class attribute.
     * 
     * @param text encrypted text
     * @return decrypted source text
     */

    public String decrypt(String text) {
        String decrypted = "";
        for(char c : text.toUpperCase().toCharArray()) {
            char decryptedChar = (char) (
                (((c - 'A') - KEY) % 26) % 26 + 'A'
            );

            if(decryptedChar < 65) {
                decryptedChar += 26;
            }

            decrypted += decryptedChar;
        }

        return decrypted;
    }
}
