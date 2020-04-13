package cryptography;

public class Stage002 {
    public static void main(String[] args) {
        char ascii; 
        String msg, d\ecrypted;
        int cipher;
        
        msg = "rs sri lexiw wsjxaevi qsvi xler wsjxaevi hizipstivw. nijj exassh";
        cipher = 4;
        decrypted = "";
          
        for (int i = 0; i < msg.length(); i++) {
            char letter = (char) msg.charAt(i); 
            if (msg.charAt(i) >= 97 && msg.charAt(i) <= 122) {
                int asciiPosition = (int) msg.charAt(i) - cipher;
                if (asciiPosition < 97) {
                    asciiPosition = asciiPosition + 26;
                }
                letter = (char) asciiPosition;
            }
            decrypted = decrypted + letter;
            
        } 
        
        System.out.println(decrypted);
    }
}