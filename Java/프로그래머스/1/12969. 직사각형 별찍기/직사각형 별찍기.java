import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "*";
        // for (int i = 0; i < b; i++) {
        //     for (int j = 0; j < a; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < b; i++) {
            System.out.print(str.repeat(a));
            System.out.println();
        }

        // System.out.println(a + b);
        
    }
}