package Unit1;

import java.util.Scanner;

public class helloBena {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome to Amphi Event Management System");
    }
}
