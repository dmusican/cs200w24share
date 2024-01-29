public class MillerQueueTester {
    public static void main(String[] args) {
        MillerQueue<Integer> queue = new MillerQueue<Integer>();
        int numTimes = 500000;
        System.out.println("Enqueueing");
        for (int i=0; i < numTimes; i++) {
            queue.enqueue(i);
        }


        System.out.println("Done enqueueing");
        System.out.println("Dequeueing");
        for (int i=0; i < numTimes; i++) {
            queue.dequeue();
        }

        System.out.println("Done dequeuing");
    }
}
