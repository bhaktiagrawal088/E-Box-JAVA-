package Unit2.Section1;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a number");
        int n = s.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= n;i++){
            fact *= i;
        }
        System.out.print(fact);
    }
}
