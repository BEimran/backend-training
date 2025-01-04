package Day6;

public class JavaLangClassesDemo {
    public static void main(String[] args) {

        double num1 = 16;
        double num2 = 4;

        double squareRoot = Math.sqrt(num1);
        System.out.println(squareRoot);

        double power = Math.pow(num2, 2);
        System.out.println(power);

        double max = Math.max(num1, num2);
        System.out.println(max);

        String str = "Hello, Java World!";

        int length = str.length();
        System.out.println(length);

        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);

        String substring = str.substring(7, 11);
        System.out.println(substring);

        long startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++) {

        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
    }
}

