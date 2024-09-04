public class EvenOdd {
    static int EvenOdd(int range){
        if(range==0){
            return 0;
        }
        int sum=EvenOdd(range-1);
        


    }
    static void evenOdd(int range,int even,int odd){
        if(range==0){
            System.out.println("even count:" +even +"odd count:" +odd);
            return;
        }
        if(range % 2==0){
            even++;
        }
        else{
            odd++;
        }

        evenOdd(range-1,even,odd);

    }
    public static void main(String[] args) {
        evenOdd(26,0,0);
        System.out.println(evenOdd(12));
    }
}
