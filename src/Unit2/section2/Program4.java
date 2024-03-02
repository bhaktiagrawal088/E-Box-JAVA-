package Unit2.section2;

import java.util.Scanner;

public class Program4
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the element in an array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in an array");
        for(int i = 0 ; i < n; i++){
            arr[i]  = s.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int d = s.nextInt();
        for(int i = d-1 ; i < n-1; i++){
            arr[i]  = arr[i+1];
        }
        n--;
        System.out.println("After delete the array");
        for(int i = 0 ; i< n ;i++){
            System.out.println(arr[i]);
        }
    }
}
