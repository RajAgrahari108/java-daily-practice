import java.util.Arrays;

class shiftZeroToLast{
  public static void main(String[] args) {
        int a [] = {0,3, 0, 7,4,0};
        int in = 0;
    for(int i=0; i<a.length; i++){
        if(a[i] != 0){
            a[in]= a[i];
            in++;
        }
    }
    for(int i=in; i<a.length; i++){
             a[i] = 0;
             in++;
    }
    System.out.println(Arrays.toString(a));
    }
    
}