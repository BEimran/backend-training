package Day3;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        System.out.println("Number of objects created: " + Counter.getCount());
    }
}
