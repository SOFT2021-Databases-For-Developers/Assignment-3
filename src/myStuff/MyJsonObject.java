package myStuff;

import java.util.ArrayList;

public class MyJsonObject implements MyValue {
    private ArrayList<MyPair> attributes;

    public MyJsonObject() {
        this.attributes = new ArrayList<>();
    }

    public void addAttribute(MyAttribute attribute, MyValue value)
    {
        attributes.add(new MyPair(attribute, value));
    }

    @Override
    public String stringPlz() {
        String res = "{ ";
        for (MyPair attribute: attributes) {
            res += attribute.getAttribue().stringPlz() + ": " + attribute.getValue().stringPlz() + ", ";
        }
        if(!attributes.isEmpty())
        {
            res = res.substring(0, res.length() - 2);
        }
        res += " }";
        return res;
    }
}
