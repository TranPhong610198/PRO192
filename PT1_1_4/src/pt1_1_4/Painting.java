package pt1_1_4;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting(){}
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight(){return height;}
    public int getWidth(){return width;}
    public boolean isWatercolour(){return isWatercolour;}
    public boolean isFramed(){return isFramed;}
    
    public void setHeight(int height){this.height = height;}
    public void setWidth(int width){this.width = width;}
    public void setWatercolour(boolean watercolour){isWatercolour = watercolour;}
    public void setFramed(boolean framed){isFramed = framed;}

    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Watercolour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }

    public void inputPainting() {
        super.input();
        height = scan.nextInt();
        width = scan.nextInt();
        isWatercolour = scan.nextBoolean();
        isFramed = scan.nextBoolean();
    }
}
