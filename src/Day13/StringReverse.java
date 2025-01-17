package Day13;

public class StringReverse {
    public static String rev(String input)
    {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(rev(s));
    }
}
