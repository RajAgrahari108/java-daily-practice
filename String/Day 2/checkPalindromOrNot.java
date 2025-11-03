

public class checkPalindromOrNot {
     public static boolean isPallindrom(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)  != s.charAt(j)){
                return false;
        }
                i++;
                j--;
            
            
        }
        return true;
    }
    public static void main (String args[]){
        String s = "abc";
        if(isPallindrom(s)){
            System.out.println("Is Pallindrom String");
        }else{
             System.out.println("Is not a Pallindrom String");
        }
    }
   
}
