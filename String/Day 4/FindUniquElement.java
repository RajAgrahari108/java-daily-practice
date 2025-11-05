

public class FindUniquElement {
    public static void main(String[] args) {
        String s = "java";
        char ch[] = s.toCharArray();
        boolean b[] = new boolean[ch.length];
        
        for(int i=0;i<=s.length()-1 ;i++){
            if(b[i] == false){
                int countdup = 1;
                 for(int j=i+1;j<=s.length()-1 ;j++){
                    if(ch[i ]== ch[j]){
                        countdup ++;
                        b[j] = true;

                    }
                 }
                if(countdup == 1){
                    System.out.println(ch[i]);
                }
            }
            
            
        }
    }
}
