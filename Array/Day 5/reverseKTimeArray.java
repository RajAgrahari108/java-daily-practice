import java.util.Scanner;
import java.util.Arrays;


public class reverseKTimeArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int k = 2;
        System.out.print("Before sorting : ");
        System.out.println(Arrays.toString(a));

        for(int j=0; j<k; j++){
           int temp = a[0];
           for(int i=0; i<=a.length-2; i++){
            a[i]=a[i+1];
           }
           a[a.length-1]= temp;
        }
        System.out.print("After sorting : ");
        System.out.println(Arrays.toString(a));
    }
}
