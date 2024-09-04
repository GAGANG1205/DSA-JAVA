
public class RopeCut {

    static int maxCut(int RopeLength, int a, int b, int c) {
        if (RopeLength == 0) {
            return 0;
        }
        
        if (RopeLength < 0) {
            return -1;
        }

       

        int cutA = maxCut(RopeLength - a, a, b, c);
        int cutB = maxCut(RopeLength - b, a, b, c);
        int cutC = maxCut(RopeLength - c, a, b, c);

        int maxCuts = Math.max(cutA, Math.max(cutB, cutC));

        if (maxCuts == -1) {
            return -1;
        }

        return maxCuts + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxCut(6, 3,2,1));
    }
}
