package SPT_Flyweight_DP;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
    private static List<TreeType> treeTypes = new ArrayList<TreeType>();
    public static TreeType getTreeType(String name, String color, int texture) {
        TreeType type = treeTypes.get(treeTypes.indexOf(new TreeType(name, color, texture)));
        return type;
    }
}
