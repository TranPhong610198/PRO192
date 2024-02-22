package pt1_1_4;

import java.util.*;
public class AntiqueShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int input = System.in.read();
        int input = scanner.nextInt();
        Vase item1;
        Statue item2;
        Painting item3;
        switch (input) {
            case 1:
                item1 = new Vase(scanner);
                item2 = new Statue(scanner);
                item3 = new Painting(scanner);
                Vase item4 = new Vase(scanner);
                System.out.println("one Vase was added");
                
                item1.inputVase();
                item2.inputStatue();
                item3.inputPainting();
                item4.inputVase();
                
                item1.outputVase();
                item2.outputStatue();
                item3.outputPainting();
                item4.outputVase();
                break;
            case 2:
                item1 = new Vase(scanner);
                item2 = new Statue(scanner);
                item3 = new Painting(scanner);
                Statue item5 = new Statue(scanner);
                System.out.println("one Vase was added");
                
                item1.inputVase();
                item2.inputStatue();
                item3.inputPainting();
                item5.inputStatue();
                
                item1.outputVase();
                item2.outputStatue();
                item3.outputPainting();
                item5.outputStatue();
                break;
            case 3:
                item1 = new Vase(scanner);
                item2 = new Statue(scanner);
                item3 = new Painting(scanner);
                Painting item6 = new Painting(scanner);
                System.out.println("one Vase was added");
                
                item1.inputVase();
                item2.inputStatue();
                item3.inputPainting();
                item6.inputPainting();
                
                item1.outputVase();
                item2.outputStatue();
                item3.outputPainting();
                item6.outputPainting();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
