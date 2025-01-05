package Day7;

import java.util.Scanner;

public class MaximumKth {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String sequence = d.next();
        String word = d.next();
        String repeat = word;
        int c = 0;

       while(sequence.indexOf(repeat) != -1)
       {
           repeat += word;
           c++;
       }

       System.out.println(c);
    }
}
