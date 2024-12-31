package Day3;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

