public class ReverseASentence {
    
     public static void main(String[] args) {
       
       String s = "RAJ IS GOOD";
       String  rev = "";
       String currWord = "";
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch != ' '){
            currWord = currWord+ch;

           }else{
            rev = " " + currWord + rev;
            currWord = "";


           }
          
            
        }
           rev = currWord + rev;
           System.out.println("Reversed Sentence: " + rev);
       
    }
}
