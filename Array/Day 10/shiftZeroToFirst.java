import java.util.Arrays;

public class shiftZeroToFirst {
    public static void main(String[] args) {
        int a[]= {2,5,0,8,0,4,0};
        int in = a.length;
        ;
        for(int i=a.length; i>0;i--){
            if(a[i]!= 0){
                a[in] = a[i];
                in--;
            }
        }
        for(int i=in; i>0;i--){
             a[i]= 0;
                in--;
        }
        System.out.println(Arrays.toString(a));
    }
}
