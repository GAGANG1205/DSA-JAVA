public class PangramChecker {

    
       public static boolean isPangram(String str, boolean[] alphabetUsed, int index) {
       
        if (index == str.length()) {
       
            for (boolean letterUsed : alphabetUsed) {
                if (!letterUsed) {
                    return false;
            }
            return true;  

       
        char currentChar = Character.toLowerCase(str.charAt(index));
        if (currentChar >= 'a' && currentChar <= 'z') {
            alphabetUsed[currentChar - 'a'] = true;
        }

        
        return isPangram(str, alphabetUsed, index + 1);
    }

   
    public static boolean isPangram(String str) {
        boolean[] alphabetUsed = new boolean[26];  
        return isPangram(str, alphabetUsed, 0);
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog";
        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
  }
 }
}