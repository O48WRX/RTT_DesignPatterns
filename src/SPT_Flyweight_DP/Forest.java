package SPT_Flyweight_DP;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<Tree>();

    public void plantTree(int x, int y, String name, String color, int texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x,y,type);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree:
             trees) {
            tree.Draw();
        }
    }
}
