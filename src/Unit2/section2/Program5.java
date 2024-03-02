package Unit2.section2;

import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of element in an array");
        int n = s.nextInt();
        System.out.println("Enter the element in the array");
        int[] arr = new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = s.nextInt();
        }
        double medain;
        Arrays.sort(arr);
        int mid = arr.length/2;
        if(n % 2 == 0 ){
            medain = (arr[mid-1]+arr[mid])/ 2.0;
        }
        else{
            medain = (arr[mid]);
        }
        System.out.println("The median of the array "  +medain);
    }
}
