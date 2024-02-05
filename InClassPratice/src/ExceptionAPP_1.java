import java.util.Scanner;

public class ExceptionAPP_1{
    public static int ExceptionAPP_1(){
        
        Scanner in = new Scanner(System.in);
        int n;
        
        try {
            System.out.printf("Enter a whole number: ");
            n = Integer.parseInt(in.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Required integer!");
            n=0;
        }
        return n;
    }
    
    public static void main(String[] args){
       int n= ExceptionAPP_1();
       System.out.printf("number:  " + n);
   }
}