package Day8;

public class LargestSumArray {
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            int sum = 0;
            for(int j=i;j<a.length;j++)
            {
                sum += a[j];
                if(sum>max)
                {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
