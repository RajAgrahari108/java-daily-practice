public class asendingOrNot {
    public static void main(String[] args) {
        int a []= {10,200,30,40};
        if(isAscending(a)){
            System.out.println("ascending order");
        }else{
            System.out.println("not in asending order");
        }
    }
    public static boolean isAscending(int a[]){
        for(int i=0; i<=a.length-2;i++ ){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
