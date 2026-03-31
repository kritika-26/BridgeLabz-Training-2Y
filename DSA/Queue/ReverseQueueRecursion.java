import java.util.*;

class ReverseQueueRecursion {
    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.poll();
        reverse(q);
        q.add(x);
    }
}
