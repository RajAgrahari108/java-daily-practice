public class ReverseEveryWord {
  public static void main(String args[]){
    String s = "ram is good";
    String rev= "";
   String currWord = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                currWord =  ch + currWord ;
            } else {
                rev = rev + currWord  + " "  ;
                currWord = "";
            }
          }
        rev = rev + currWord ;
        System.out.println("Reversed Sentence: " + rev);
      }  
}

