public class Maze {
    static void mazePath(int startrow,int startcol,int endrow, int endcol, String result){
if(startcol==endcol || startrow==endrow){
    System.out.println(result);
    return;
}
if(startcol>endcol || startrow>endrow){
    return;

}
mazePath(startrow+1, startcol, endrow, endcol, result + "V");
mazePath(startrow, startcol+1, endrow, endcol, result + "H");
    }
    public static void main(String[] args) {
        mazePath(0, 0, 3, 3, "");
    }
}
