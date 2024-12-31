package Day3;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
    }
}

