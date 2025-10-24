public class removeDuplicatElement {
    public static void main(String[] args) {
        int a[]= {10, 20, 10, 20, 30};
        int b[]=new int [a.length];
        int in=0;
        for(int i=0; i<a.length; i++){
                boolean flag =true;
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    flag = false;
                }
            }
            if(flag == true){
                b[in]= a[i];
                in++;
            }
        }
        System.out.println("After removig dupli ele");
        for(int i=0; i<b.length; i++){
            if(b[i]!=0){
                System.out.println(b[i]+" ");
            }
        }
    }
}
