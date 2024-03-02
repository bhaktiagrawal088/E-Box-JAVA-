package Unit2.section2;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = s.nextInt();
        }
        int count = 1;
        Arrays.sort(arr);
        for(int i  = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
