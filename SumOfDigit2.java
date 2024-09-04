public class SumOfDigit2 {
    static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        // int sum=sumOfDigit(num/10);
        // int digit=num%10;
        // sum=sum+digit;
        // return sum;
       return num%10+ sumOfDigit(num/10);


    }
    static void sumOfDigit(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
int digit=num%10;
sum=sum+digit;

sumOfDigit(num/10,sum);

    }
    public static void main(String[] args) {
       sumOfDigit(123,0 ); 
       System.out.println(sumOfDigit(123));
       
    }
}
