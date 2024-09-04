public class Reversestring {
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String smallString = str.substring(1);
        String smallresult = reverse(smallString);
        return smallresult + str.charAt(0);
        
    }

    public static void main(String[] args) {
        System.out.println(reverse("Gagan"));
    }
}
