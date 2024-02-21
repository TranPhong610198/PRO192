package pt1_1_4;

import java.io.IOException;
public class AntiqueShop extends Item {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        int input = System.in.read();

        switch (input) {
            case 1:
                Vase item1 = new Vase();
                item1.inputVase();
                item1.outputVase();
                break;
            case 2:
                Statue item2 = new Statue();
                item2.inputStatue();
                item2.outputStatue();
                break;
            case 3:
                Painting item3 = new Painting();
                item3.inputPainting();
                item3.outputPainting();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
