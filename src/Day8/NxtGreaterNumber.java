package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class NxtGreaterNumber {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int l = d.nextInt();
        int a[] = new int[l];
        for(int i=0;i<l;i++)
        {
            a[i] = d.nextInt();
        }
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a[i] < a[j])
                {
                    a[i] = a[j];
                    break;
                }
            }
        }
        a[l-1] = -1;
        System.out.println(Arrays.toString(a));
    }
}
