public class nThSmolestElement {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n = 2;
        for(int i=0; i<a.length; i++){
                int count = 0;
            for(int j=0; j<a.length; j++){
                if(a[i]<a[j]){
                    count++;

                }
            }
            if(count == a.length-n){
                System.out.println(a[i]);
                break;
            }
        }
    }
}
