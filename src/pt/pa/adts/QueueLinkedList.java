package pt.pa.adts;

/**
 * TODO: Fornecer documentação da classe.
 *
 * @param <T>
 */
public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    public QueueLinkedList() {
        //TODO: construtor deve inicializar uma fila vazia
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        if(size <= 0){
            return true;
        }

        return false;
    }

    @Override
    public void enqueue(T elem){
        if()
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
