package pt.pa.Exceptions;

public class QueueEmptyException extends RuntimeException{

    public QueueEmptyException() {
        super("The queue is empty.");
    }

}