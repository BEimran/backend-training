package Day4.Shapes;

public class VarargsExample {
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 4, 5, 6, 7: " + sum(4, 5, 6, 7));
        System.out.println("Sum of no numbers: " + sum());
    }
}
