

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


// ! using function
// public class String345 {
//     public static void main(String[] args) {
       
//         char[] s = {'h', 'e', 'l', 'l', 'o'};
//         Solution sol = new Solution();
//         sol.reverseString(s);
//         System.out.println(s);
//     }
// }

// class Solution {
//     public void reverseString(char[] s) {
//         int i = 0, j = s.length - 1;
//         while (i < j) {
//             char temp = s[i];
//             s[i] = s[j];
//             s[j] = temp;
//             i++;
//             j--;
//         }
//     }
// }