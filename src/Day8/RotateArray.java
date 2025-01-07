package Day8;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int a=2;
        int arr[]={1,2,3,4,5,6,7};
        for(int i=0;i<a;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.printf(Arrays.toString(arr));
    }
}
