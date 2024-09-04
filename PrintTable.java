
public class PrintTable {
    static String helper(int num, int val) {
    if(val==0){
        return "";
    }

        String smallresult = helper(num, val-1);
        String expression = num + "*"+val+"="+(num * val);
        smallresult = smallresult + expression+"\n";
        return smallresult;

    }

    static String createtable(int num) {

        return helper(num, 10);



    }

    public static void main(String[] args) {
        String r = createtable(5);
        System.out.println(r);
    }

}
