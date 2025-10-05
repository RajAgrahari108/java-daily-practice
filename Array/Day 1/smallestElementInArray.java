public class smallestElementInArray {
    
     public static void main(String[] args) {
        int[] a = {10, 222, 3, 40, 5, 900, 100};
        int num = a[0];  // start with first element

        for (int i = 1; i < a.length; i++) {
            if (a[i] < num) {
                num = a[i]; // update smallest
            }
        }

        System.out.println("Smallest element: " + num);
    }
}



