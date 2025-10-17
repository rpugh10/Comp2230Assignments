package Ch15Lists;

public class EmptyCollectionException extends RuntimeException {

    public EmptyCollectionException(String message){
        super("The " + message + " is empty");
    }
}
