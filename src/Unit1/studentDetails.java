package Unit1;

import java.util.Scanner;

public class studentDetails {
    public static void main(String[] args) {
        System.out.println("Enter the student details :");
        while (true) {
            System.out.println("Enter the register number :");
            Scanner s = new Scanner(System.in);
            int reg = s.nextInt();
            s.nextLine();
            System.out.println("Enter the name : ");
            String name = s.nextLine();
            System.out.println("Do you want to continue [Yes/No] :");
            String reply = s.nextLine();

        for(int i = 1 ; i <= reg ; i++) {
            System.out.println("Details of Student :" + reg);
            System.out.println("Register Number :" + reg);
            System.out.println("Name : " + name);
        }

        }

    }
}
