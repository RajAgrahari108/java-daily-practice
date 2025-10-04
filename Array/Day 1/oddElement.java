public class oddElement {
    public static void main(String[] args) {
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

           for (int i=0; i<=b.length-1; i++){
             if(b [i] % 2 != 0){
                System.out.println(b[i]);
            }
        }
    }
}
