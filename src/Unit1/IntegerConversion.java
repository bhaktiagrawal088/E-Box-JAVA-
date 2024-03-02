package Unit1;

import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {

        System.out.println("Enter an Integer");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        // Conversion to binary
        String binary = Integer.toBinaryString(n);
        // Conversion to hexadecimal
        String hexa = Integer.toHexString(n);
        // Conversion to octal
        String octal = Integer.toOctalString(n);
        // Conversion to Byte
        byte b = (byte) n;
        // Conversion to short
        short st = (short)n;
        // Conversion to float
        //Conversion of long
        long l =(long) n;
        float f = (float) n;
        // Conversion to double
        double d = (double) n;

        
        System.out.println("The binary equivalent of " + n + "is "+ binary);
        System.out.println("The hexadecimal equivalent of "+ n  + "is " + hexa);
        System.out.println("The octal equivalent of " + n + "is " + octal);
        System.out.println("Byte value of " + n + "is "+ b);
        System.out.println("Short value of " + n + "is " + st);
        System.out.println("Long value of " + n + "is " + l);
        System.out.println("Float value of " + n + "is " + f);
        System.out.println("Double value of " + n + "is " + d);

    }
}
