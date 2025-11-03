

public class reverse {
   public static void main(String[] args) {
     String s = "agrahari";
     System.out.println(isRevierse(s));
     
   }
   public static String isRevierse(String s){
    char ch[]= s.toCharArray();
    int i=0, j=s.length()-1;
    while(i<j){
      char temp = ch[i];
      ch[i]= ch[j];
      ch[j]=temp;
      i++; j--;

    }
    return new String(ch);
   }
}
