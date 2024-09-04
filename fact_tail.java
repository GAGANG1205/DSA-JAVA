public class fact_tail {
    static void fact_tail(int num , int r){
        if(num==1){
            System.out.println(r);
            return;
        }
        fact_tail(num-1 , num*r);
}


public static void main(String[] args) {
    fact_tail(5,1);
}
}