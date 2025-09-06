public class CounterDemo {
    public static void main(String[] args) { 
        Counter c = new Counter(); 
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        c.reset();
        Counter d = new Counter();
        d.increment();
        Counter e = d; 
        temp = e.getCount();
        e.increment(2);
    }
}
