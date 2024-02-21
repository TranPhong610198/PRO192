package pt1_1_4;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {}
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight(){return weight;}
    public String getColour(){return colour;}
    
    public void setWeight(int weight){this.weight = weight;}
    public void setColour(String colour){this.colour = colour;}

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void inputStatue() {
        super.input();
        weight = scan.nextInt();
        colour = scan.next();
    }
}
