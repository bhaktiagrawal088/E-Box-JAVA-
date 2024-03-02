package Unit2.section2;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i< n; i++){
            for(int j =0 ; j < n ; j++){
                if(i %2 == 0){
                    arr[i][j] = n * i + (j+1);
                }
                else{
                    arr[i][j] = n * (i+1)-j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[r-1][c-1]);
    }
}
