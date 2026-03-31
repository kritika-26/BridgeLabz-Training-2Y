import java.util.*;

class SimpleDeque {
    Deque<Integer> dq = new ArrayDeque<>();

    void insertFront(int x) {
        dq.addFirst(x);
    }

    void insertRear(int x) {
        dq.addLast(x);
    }

    void deleteFront() {
        if (!dq.isEmpty()) dq.removeFirst();
    }

    void deleteRear() {
        if (!dq.isEmpty()) dq.removeLast();
    }

    int getFront() {
        return dq.isEmpty() ? -1 : dq.peekFirst();
    }

    int getRear() {
        return dq.isEmpty() ? -1 : dq.peekLast();
    }
}
