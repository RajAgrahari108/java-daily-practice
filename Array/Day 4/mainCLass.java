public class mainCLass {
    public static void main(String agrs[]){
        int a[] = {1, 2, 3, 4, 5, 6};
        int oddSum =0;  int evenSum=0;
        for(int i=0; i<a.length; i++){
            if( a[i] % 2 ==0){
                evenSum = evenSum + a[i];
            }
            else{
                oddSum = oddSum + a[i];
            }
        }
        System.out.println("the even sum of given number is : " +evenSum);
        System.out.println(oddSum);
    }
}
