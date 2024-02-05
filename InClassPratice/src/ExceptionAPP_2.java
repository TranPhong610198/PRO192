import java.util.Scanner;
public class ExceptionAPP_2{
    public static int inputInteger(){
        Scanner in = new Scanner(System.in);
        int n;
        try {
            System.out.print("Enter a whole number: ");
            n = Integer.parseInt(in.nextLine());
            if( n<10 || n>50) throw new Exception();
        }
        catch (Exception e) {
            System.out.println("Required integer!");
            n=0;
        }
        return n;
    }

    public static void main(String[] args){
        int n= inputInteger();
        System.out.print("number: " + n);
    }
}