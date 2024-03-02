package Unit2.section2;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0 ; i <n; i++){
            arr1[i] = s.nextInt();
        }
        for(int i = 0; i < n ; i++){
            arr2[i] = s.nextInt();
        }
        boolean c = true;
        for(int i = 0; i < n; i++){
            if(arr1[i] < arr2[i]){
                c = false;
                break;
            }
        }
        if(c) {
            System.out.println("Compatible");
        }
        else{
            System.out.println("Incompatible");
        }

    }
}
