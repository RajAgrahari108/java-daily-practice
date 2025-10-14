public class decending {

    public static void main(String[] args) {
        int a []= {50, 40, 30, 20,10};
        System.out.println((isDescending(a))?"descending" : "not");

    }
    static boolean isDescending(int a[]){
        for(int i=0; i<=a.length-2; i++){
            if(a[i]<a[i+1]){
                return false;
            }
        }
        return true;
    }

}
