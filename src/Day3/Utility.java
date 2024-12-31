package Day3;

class Utility {
    public static String convertToUpper(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String result = Utility.convertToUpper(input);
        System.out.println("Uppercase: " + result);
    }
}
