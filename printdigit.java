public class printdigit {
    static void printdigit(int n){
     
      if(n==0){
        return;
      }
printdigit(n/10);
System.out.println(n%10);
    }

    public static void main(String[] args) {
        printdigit(12345);

        
    }
    
}
