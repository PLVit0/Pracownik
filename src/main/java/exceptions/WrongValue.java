package exceptions;

public class WrongValue extends Exception{
    public WrongValue() {

    }

    public WrongValue(String s) {
        super(s);
    }
}
