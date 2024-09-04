public class CountEvenOdd {
    static int countED(int range){
        if(range==0){
            int result[]= new int[2] ;
            return result;
        }
       int result[]= countED(range-1);
       if(range % 2==0){
        result[0]=result[0]+1;
       }
       else{
        result[1]++;
       }
       return result;

    }
    static  void  countED(int range ,int even , int odd ){
        if(range == 0){
        
            System.out.println("Even count" +even +"odd count" + odd);
            
            return;

        }
        if(range % 2==0){
            even++;


        }
        else{
            odd++;
        }
        countED(range-1, even, odd);
    }
        public static void main(String[] args) {
            countED(20, 0, 0);
            int arr[]=countED(10);
            System.out.println("even count" +arr[0]);
            System.out.println("odd count" +arr[1]);
        }
    
}
