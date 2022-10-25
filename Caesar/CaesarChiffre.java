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
     * works by first mapping the character to the range (0; 25) [`(c - 'A')`], then moving and applying modulo. Because of javas dumbest 
     * modulo shit-design, negative modulo-values are possible, that's why there's 26 added in the statement to remove that possibility.
     * Afterwards, the new value is moved back to the original range by adding 'A'.
     * 
     * @param text the source text to be encrypted
     * @return encrypted text
    */
    public String encrypt(String text) {
        String encrypted = "";
        for(char c : text.toUpperCase().toCharArray()) {
            encrypted += (char) (
                (((c - 'A') + KEY + 26) % 26) % 26 + 'A'
            );
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
            decrypted += (char) (
                (((c - 'A') - KEY + 26) % 26) % 26 + 'A'
            );
        }

        return decrypted;
    }
}
