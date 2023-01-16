package SPT_Flyweight_DP;

public class TreeType {
    private String name;
    private String color;
    private int texture;

    public TreeType(String name, String color, int texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw() {
        System.out.println("Tree drawn!");
    }
}
