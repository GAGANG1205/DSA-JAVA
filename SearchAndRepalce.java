public class SearchAndRepalce {
    static String searchAndReplace(String str , char search, char replace ){
        if(str.length()==0){
            return "";
        }
       String smallOutput= searchAndReplace(str.substring(1), search, replace);
if(str.charAt(0)==search){
return smallOutput + replace;
}
else{
    return  str.charAt(0)+ smallOutput ;

    }
}
    public static void main(String[] args) {
        System.out.println(searchAndReplace("hello", 'l', 'w'));
    }
}
