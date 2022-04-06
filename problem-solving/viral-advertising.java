import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int[][] map = new int[n][3];
        for(int i=0; i<n; i++) {
            if(i==0) {
                map[0][0]=5;
                map[0][1]=calLiked(map[0][0]);
                map[0][2]=calCumulative(0, map[0][1]);
            }
            else {
                map[i][0]=calShared(map[i-1][1]);
                map[i][1]=calLiked(map[i][0]);
                map[i][2]=calCumulative(map[i-1][2], map[i][1]);
            }
        }
        return map[n-1][2];
    }

    static int calShared(int previousLiked) {
        return previousLiked*3;
    }

    static int calLiked(int currentShared) {
        return (int)(currentShared/2);
    }

    static int calCumulative(int previousCumulative, int currentLiked) {
        return previousCumulative+currentLiked;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
