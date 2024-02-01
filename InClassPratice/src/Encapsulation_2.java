class IntPoint2{
    int x= 7;
    int y= 3;
    public IntPoint2(){
       output();
       x = 100;
       y = 1000;
       output();
    }
    public IntPoint2(int x, int y){
       output();
       this.x = x;
       this.y = y;
       output();
    }
    public void output(){
        String S ="[" + x + ","  + y + "]";
        System.out.println(S);
    }
}
public class Encapsulation_2{
    public static void main(String[] args){
        System.out.println("Use default constructor:");
        IntPoint2 p1 = new IntPoint2();
        System.out.println("Use parametric constructor:");
        IntPoint2 p2 = new IntPoint2(-7, 90);
    }
}