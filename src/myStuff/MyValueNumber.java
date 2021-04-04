package myStuff;

public class MyValueNumber implements MyValue{
    private int value;

    public MyValueNumber(int value) {
        this.value = value;
    }

    @Override
    public String stringPlz() {
        return "" + value;
    }
}
