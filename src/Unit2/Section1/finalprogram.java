package Unit2.Section1;

import java.util.Scanner;

public class finalprogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i = a ; i <= b; i++){
            if(i %2 ==0 && i% 3 != 0 && i%5 != 0){
                System.out.print(i+ " ");
            }
        }
    }
}
