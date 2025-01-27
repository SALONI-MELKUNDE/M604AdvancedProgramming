package lecture1;

public class Main {
    public static void main(String[] args) {
        final CaesarCipher cipher = new CaesarCipher();
        final String message = "xyz";
        final String cipheredMessage = cipher.cipherWord(message);
        System.out.println(cipheredMessage);
    }
}
