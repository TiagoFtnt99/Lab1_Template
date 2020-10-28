package pt.pa.Exceptions;

public class QueueFullException extends RuntimeException {

    public QueueFullException() {
        super("The queue is full.");
    }
}
