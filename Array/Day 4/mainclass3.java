public class mainclass3 {
    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        
       boolean found = false;

        int target = 9;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                int sum  = a[i]+ a[j];

                if(sum == target){
                   System.out.println(true);
                //    found = true;
                }
                
            }
            
        }
        System.out.println(found);
    }
}
