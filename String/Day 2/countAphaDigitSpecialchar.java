

public class countAphaDigitSpecialchar {
    
    public static void main(String args[]){
        String s = "aB@123";
        int ac= 0, dc = 0, sp=0;

        for(int i=0 ;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <='z' ||ch >= 'A' && ch <='Z'  ){
                ac++;
            }else if(ch >= '0' && ch <='9' ){
                dc++;
            }else{
                sp++;
            }
        }

        System.out.println("Alpha bet is : "+ ac); 
        System.out.println("Digit is : "+ dc); 
        System.out.println("Special char is : "+ sp); 

    }
}
