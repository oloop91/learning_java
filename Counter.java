/*

author : oloop

*/

public class Counter {
    private final String name;
    private final int maxCount;
    private int count;

    public Counter(String id, int max) {
        name = id;
        maxCount = max;
    }

    public void increment() {
        if (count  < maxCount) count++; 
    }

    public int value() {
        return count;
    }

    public String toString() {
        return name + ": " + count; 
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        Counter[] hits = new Counter[n];
        for ( int i = 0; i < n; i++) {
            hits[i] = new Counter(i + "", trials);
        }

        for ( int t = 0; t < trials; t++) {
            hits[StdRandom.uniform(n)].increment();
        }

        for (int i =0; i < n; i++) {
            StdOut.println(hits[i]);
        }
    }



}