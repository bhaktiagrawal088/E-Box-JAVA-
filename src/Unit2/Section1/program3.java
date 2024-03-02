package Unit2.Section1;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1 ; i<=n; i++){
            for( int j = n ; j >= i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
