public class FindFrequenctInString {
    public static void main(String args[]){
        String s = "raaj";
        char ch[] = s.toCharArray();
        s= s.toLowerCase();
        boolean b[] = new boolean[s.length()]; 
        for(int i=0; i<s.length(); i++){
            if(b[i] == false){
                int count=1;
                for(int j=i+1; j<s.length();j++){
                    if(ch[i]==ch[j]){
                        count ++;
                        b[j]=true;
                    }
                }
                System.out.println(ch[i]+" - " +count );
            }
        }


    }
}
