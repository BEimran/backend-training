package Day1;

public class BitwiseOperators {
    public static void main(String[] args) {
        int num = 8;
        int leftShift = num << 2;
        int rightShift = num >> 2;

        int num1 = 5;
        int num2 = 3;
        int xorResult = num1 ^ num2;

        System.out.println("Left shift by 2: " + leftShift);
        System.out.println("Right shift by 2: " + rightShift);
        System.out.println("XOR of 5 and 3: " + xorResult);
    }
}

