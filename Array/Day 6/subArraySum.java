

public class subArraySum {

    static int maxSum=0;
    static void print(int a[], int start, int end){
        int sum =0;
        for(int i=start; i<=end; i++){
            sum =sum+a[i];
            System.out.print(a[i] + " ");
        }
        if(sum>maxSum)
        maxSum=sum;
            System.out.println("sum ");
    }
    public static void main(String[] args) {
        
        int a []= {2,-1,1,-2,-4,3};
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                print(a,i,j);
            }
        }
        System.out.println("maxSum is =>" + maxSum);
    }
}
