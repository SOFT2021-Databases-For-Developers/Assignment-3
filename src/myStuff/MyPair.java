package myStuff;

public class MyPair {
    private MyAttribute attribue;
    private MyValue value;

    public MyPair(MyAttribute attribue, MyValue value) {
        this.attribue = attribue;
        this.value = value;
    }

    public MyAttribute getAttribue() {
        return attribue;
    }

    public MyValue getValue() {
        return value;
    }
}
