

public class UniqueString {
    
    public static void main (String args[]){
        String s = "raja";
        if(isUnique(s)){
            System.out.println("Is unique String");
        }else{
             System.out.println("Is not a unique String");
        }
    }
    public static boolean isUnique(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
   
}
