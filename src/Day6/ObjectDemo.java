package Day6;

class Sample {
    private String name;

    public Sample(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Sample obj = new Sample("Java Example");

        System.out.println(obj.getClass().getName());
        System.out.println(obj.toString());
    }
}

