package Unit1;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius :");
        Scanner s = new Scanner(System.in);
        float radius = s.nextFloat();

        System.out.printf("The radius of circle is %.2f.", circle.calArea(radius));
    }
}
    class circle {
        public static float calArea(float radius){
            return 3.1429f * radius * radius;
        }
    }


