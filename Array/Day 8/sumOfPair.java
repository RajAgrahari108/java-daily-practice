import java.util.Arrays;

public class sumOfPair {
    public static void main(String[] args) {
        int a[] ={2,4,3,5,7,8,1,11};
        int target = 9;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]!=a[j])
                {
                    if(a[i]+ a[j]== target){
                        System.out.println(a[i] + " "+ a[j]);
                        break;
                    }
                }
            }
        }
    }
}
