import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positiveNumberCount=0, negitiveNumberCount=0, zeroCount=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>0) {
                positiveNumberCount++;
            }
            else if(arr[i]<0) {
                negitiveNumberCount++;
            }
            else {
                zeroCount++;
            }
        }

        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(df.format((double)positiveNumberCount/arr.length));
        System.out.println(df.format((double)negitiveNumberCount/arr.length));
        System.out.println(df.format((double)zeroCount/arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
