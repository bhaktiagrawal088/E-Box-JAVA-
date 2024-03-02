package Unit1;

import java.util.Scanner;

public class numberloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0 ; i <= n ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
