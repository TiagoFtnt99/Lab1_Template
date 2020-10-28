package pt.pa.Test;

import pt.pa.Exceptions.QueueEmptyException;
import pt.pa.adts.Queue;
import pt.pa.adts.QueueLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class QueueLinkedListTest {

    Queue<Integer> queue = new QueueLinkedList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        for (int i = 1; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        queue.clear();
    }


    @org.junit.jupiter.api.Test
    void enqueue() {
        queue.enqueue(11);

        assertEquals(10, queue.size());
    }

    @org.junit.jupiter.api.Test
    void dequeue() {
        queue.dequeue();

        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.front());
    }

    @org.junit.jupiter.api.Test
    void front() {
        queue.dequeue();
        queue.dequeue();

        assertEquals(3, queue.front());
    }

    @org.junit.jupiter.api.Test
    void frontException() {
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        assertThrows(QueueEmptyException.class, () -> queue.front());
    }

    @org.junit.jupiter.api.Test
    void dequeueException() {
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        assertThrows(QueueEmptyException.class, () -> queue.front());
    }


}