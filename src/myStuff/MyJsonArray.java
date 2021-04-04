package myStuff;

import java.util.ArrayList;

public class MyJsonArray implements MyValue{
    private ArrayList<MyValue> list;

    public MyJsonArray() {
        this.list = new ArrayList<>();
    }

    public void addItem(MyValue value)
    {
        list.add(value);
    }

    @Override
    public String stringPlz() {
        String res = "[ ";
        for (MyValue value : list) {
            res += value.stringPlz() + ", ";
        }
        if(!list.isEmpty()) {
            res = res.substring(0, res.length() - 2);
        }
        res += " ]";
        return res;
    }
}
