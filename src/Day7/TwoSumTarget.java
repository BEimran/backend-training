package Day7;
import java.util.*;
public class TwoSumTarget {

    public static int[] func(int[] nums, int t)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == t)
                {
                   return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int a[] = {2,7,11,15}, target = 9;
        int arr[] = func(a,target);
        System.out.println(Arrays.toString(a));
        System.out.println(arr[0]+" "+arr[1]);
    }
}
