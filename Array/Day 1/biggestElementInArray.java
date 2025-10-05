public class biggestElementInArray {
    public static void main(String args[]){

        int a[] = {10,222,3,40,5,900,10};
        int num = 0;
        for(int i=0; i<a.length; i++) {
            if(num < a[i]){
              num = a[i];
           }
        }
        System.out.println(num);
    }  
}
