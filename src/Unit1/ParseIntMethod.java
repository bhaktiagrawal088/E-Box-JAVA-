package Unit1;

import java.util.Scanner;

public class ParseIntMethod {
    public static void main(String[] args) {
        System.out.println("Enter the Binary number");
        Scanner s = new Scanner(System.in);
        String binary = s.nextLine();
        System.out.println("Enter the octal number");
        String octal = s.nextLine();
        System.out.println("Enter the hexadecimal number");
        String hexadec = s.nextLine();
        System.out.println("The Integer value of the binary number " + binary + " is "+ Integer.parseInt(binary, 2));
        System.out.println("The Integer value of the octal number "+ octal + " is " + Integer.parseInt(octal, 8));
        System.out.println("The Integer value of the hexadecimal " + hexadec + " is "+ Integer.parseInt(hexadec, 16));

    }
}
