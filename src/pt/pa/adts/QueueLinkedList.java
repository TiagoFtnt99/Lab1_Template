package pt.pa.adts;

import pt.pa.Exceptions.QueueFullException;
import pt.pa.Exceptions.QueueEmptyException;

/**
 * TODO: Fornecer documentação da classe.
 * Implementation of a Queue LinkedList using a Node class.
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    /**
     * This constructor initializes an empty queue.
     */
    public QueueLinkedList() {
        //TODO: construtor deve inicializar uma fila vazia
        this.header = new Node(null, null, this.trailer);
        this.trailer = new Node(null, null, null);
        this.trailer.prev = this.header;
        this.size = 0;
    }

    /**
     *
     * @return the size of the queue.
     */
    @Override
    public int size(){
        return this.size;
    }

    /**
     *
     * @return true if the queue is empty. Returns false otherwise.
     */
    @Override
    public boolean isEmpty(){
        return (this.size == 0);
    }

    /**
     * This method adds a new element to end of the queue.
     * @param elem element to be added to the queue.
     * @throws QueueFullException if queue is full.
     */
    @Override
    public void enqueue(T elem) throws QueueFullException {

            try {
                Node newNode = new Node(elem, this.trailer.prev, this.trailer);

                this.trailer.prev.next = newNode;
                this.trailer.prev = newNode;

                this.size++;

            } catch (OutOfMemoryError e) {
                throw new QueueFullException();
            }

        }

    /**
     * This method remove the first element of the queue.
      * @return the element that was removed from the queue.
     * @throws QueueEmptyException
     */
    @Override
    public T dequeue() throws QueueEmptyException{
        if( this.header.next == this.trailer ) throw new QueueEmptyException();
        Node front = this.header.next;

        this.header.next = front.next;
        this.header.next.prev = this.header;
        size--;
        return front.element;
    }

    /**
     * This method gets the first element of the queue so we can "see" what it is.
     * @return the first element of the queue.
     * @throws QueueEmptyException
     */
    @Override
    public T front() throws QueueEmptyException{
        if( this.header.next == this.trailer ) throw new QueueEmptyException();

        T f = this.header.next.element;

        return f;
    }

    /**
     * This method remove all elements from the queue.
     */
    @Override
    public void clear(){
        this.trailer = new Node(null, null, null);
        this.header = new Node(null, null, this.trailer);
        this.trailer.prev = this.header;
        this.size = 0;
    }



    //TODO: implementar métodos da interface à custa da estrutura de dados fornecida

    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node prev, Node next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
