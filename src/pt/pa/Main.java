package pt.pa;

import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new QueueLinkedList<>();

        for (int i = 1; i < 10; i++) {
            queue.enqueue(i);
        }


        System.out.println("\n1º elemento da queue: " + queue.front());

        System.out.println("\nTamanho da queue: " + queue.size());

        queue.dequeue();

        System.out.println("\n1º elemento da queue: " + queue.front());

        System.out.println("\nTamanho da queue: " + queue.size());


        System.out.println("\nA queue está vazia? " + queue.isEmpty());

        queue.clear();

        System.out.println("\nA queue está vazia? " + queue.isEmpty());

        //TODO: testar implementação

    }
}
