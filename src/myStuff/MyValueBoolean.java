package myStuff;

public class MyValueBoolean implements MyValue{
    private boolean value;

    public MyValueBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public String stringPlz() {
        return "" + value;
    }
}
