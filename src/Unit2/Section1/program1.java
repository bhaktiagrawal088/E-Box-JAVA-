package Unit2.Section1;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = s.nextInt();
        System.out.println("Enter the value of b");
        int b = s.nextInt();
        for(int i = a; i <= b ; i++){
            System.out.print(i);
        }
        System.out.println();

    }
}
