package Day3;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOne implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    public static void main(String[] args) {
        AllInOne device = new AllInOne();
        device.print();
        device.scan();
    }
}

