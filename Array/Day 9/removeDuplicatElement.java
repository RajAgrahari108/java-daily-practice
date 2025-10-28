public class removeDuplicatElement {
    public static void main(String[] args) {
        int nums[]= {10, 20, 10, 20, 30};
        int b[]=new int [nums.length];
        int in=0;
        for(int i=0; i<nums.length; i++){
                boolean flag =true;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    flag = false;
                }
            }
            if(flag == true){
                b[in]= nums[i];
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
