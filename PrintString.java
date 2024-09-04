
import java.util.ArrayList;

public class PrintString {
    static void printsubsequences(String str , String result){
        if(str.length()==0){
            System.out.println(result + " ");
            return;
        }
        printsubsequences(str.substring(1), result);
        printsubsequences(str.substring(1), result+ str.charAt(0));
    }
    static ArrayList<String> subsequence(String str){
    if(str.length()==0){
        ArrayList<String> list=new ArrayList<>();
        list.add("");
        return list;
    }
    char currentChar = str.charAt(0);
    String remaining = str .substring(1);
    ArrayList<String> result =new ArrayList<>();
    ArrayList<String> temp= subsequence(remaining);
    for(String s:temp){
        result.add(s);
        result.add(currentChar + s );
        
    }
     return result;
    
}
      

    public static void main(String[] args) {
        String str="abc"; 
        printsubsequences(str , "");

        
        
    }
}
