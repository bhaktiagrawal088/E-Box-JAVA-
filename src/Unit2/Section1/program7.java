package Unit2.Section1;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int sum= 0 ;
        while(true){
            n = s.nextInt();
            if(n == -999){
                break;
            }
            sum += n;
        }
        System.out.println("The sum is " + sum);
    }
}
