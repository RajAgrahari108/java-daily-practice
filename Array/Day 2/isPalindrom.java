

public class isPalindrom {
    
    static boolean isPallindrome(int n){
        int rev = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n= n/10;

        }
        return rev ==temp;
    }
    public static void main(String[] args) {
        int a [] = {121, 45, 55, 85, 88};
        int count =0;
        for(int i=0;i<a.length; i++)
        {
            if(isPallindrome(a[i]))
            count++;

        }
        System.out.println(count);
    }
    
}
