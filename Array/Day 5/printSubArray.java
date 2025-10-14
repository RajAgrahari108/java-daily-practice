public class printSubArray {
    static void print(int a[], int start, int end){
        for(int i=start; i<=end; i++){
            System.out.print(a[i] + " ");
        }
            System.out.println(" ");
    }
    public static void main(String[] args) {
        int a []= {2,-1,1,-2,-4,3};
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                print(a,i,j);
            }
        }
    }
} 