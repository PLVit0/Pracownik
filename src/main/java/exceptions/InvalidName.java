package exceptions;

public class InvalidName extends Exception{
    public InvalidName() {

    }

    public InvalidName(String s) {
        super(s);
    }
}
