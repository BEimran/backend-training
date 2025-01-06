package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int l = d.nextInt();
        int a[] = new int[l];
        for(int i=0;i<l;i++)
        {
            a[i] = d.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<l;i++)
        {
            if(a[i]!=i)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
