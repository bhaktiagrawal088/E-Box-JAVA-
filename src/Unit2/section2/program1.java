package Unit2.section2;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[15];
        int sum =0;
        for (int i = 0 ; i < n; i++){
            int e = s.nextInt();
            sum = sum + e;

        }
        System.out.println("The sum of the elements in an array "+sum);
    }
}
