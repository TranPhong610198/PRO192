package pt1_1_4;
import java.util.*;
public class Item {
    Scanner scan = new Scanner(System.in);
    private int value;
    private String creator;
    
    public Item(){};
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }
    
    //getter
    public int getValue(){return value;}
    public String getCreator(){return creator;}
    
    //setter
    public void setValue(int value){this.value = value;}
    public void setCreator(String creator){this.creator = creator;}
    
    public void output(){
        System.out.println(value);
        System.out.println(creator);
    }
    
    public void input(){
        value = scan.nextInt();
        creator = scan.next();
    }
    
}
