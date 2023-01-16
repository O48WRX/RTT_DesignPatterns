package SPT_Visitor_DP;

import java.util.ArrayList;
import java.util.List;

public class Document implements Element{
    List<Element> elements = new ArrayList<Element>();

    @Override
    public void accept(Visitor v) {
        v.visit();
    }
}
