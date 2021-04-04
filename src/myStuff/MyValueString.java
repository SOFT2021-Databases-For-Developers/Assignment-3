package myStuff;

public class MyValueString implements MyValue {
    private String value;

    public MyValueString(String value) {
        this.value = value;
    }

    @Override
    public String stringPlz() {
        return "\"" + value + "\"";
    }
}
