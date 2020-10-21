package pt.pa.adts;

/**
 * This interface defines the methods of a queue (that will be implemented in other classes).
 * @param <T>
 */
public interface Queue<T> {

    /**
     *
     * @return the number of elements of the queue.
     */
    public int size();

    /**
     * This method checks if the queue is empty.
     * @return true or false.
     */
    public boolean isEmpty();

    /**
     * This method adds a new element to the end of the queue.
     * @param elem element to be added to the queue.
     */
    public void enqueue(T elem); //throws QueueFullException;

    /**
     * This method removes the element in the begining of the queue.
     * @return the removed element.
     */
    public T dequeue(); //throws QueueEmptyException;

    /**
     *
     * @return the element in the begining of the queue.
     */
    public T front(); //throws QueueEmptyException;

    /**
     * This method removes and returns all the elements of the queue.
     */
    public void clear();

}





