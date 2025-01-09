package Day11;

public class Box<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void printItem() {
        System.out.println("Stored item: " + item);
    }
    public boolean isTypeOf(Class<?> clazz) {
        return clazz.isInstance(item);
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        stringBox.printItem();

        System.out.println("Is the item a String? " + stringBox.isTypeOf(String.class));
        System.out.println("Is the item an Integer? " + stringBox.isTypeOf(Integer.class));

        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        intBox.printItem();
        System.out.println("Is the item an Integer? " + intBox.isTypeOf(Integer.class));
        System.out.println("Is the item a Double? " + intBox.isTypeOf(Double.class));
    }
}

