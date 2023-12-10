package task.Person;

public class InvalidName extends Exception{
    public InvalidName() {

    }

    public InvalidName(String s) {
        super(s);
    }
}
