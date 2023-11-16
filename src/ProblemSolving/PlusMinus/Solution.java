package ProblemSolving.PlusMinus;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for(int a : arr){
            if(a > 0){
                positive++;
            }else if(a < 0){
                negative++;
            }else{
                zero++;
            }

        }
        System.out.printf("%6f\n", positive / arr.size());
        System.out.printf("%6f\n", negative / arr.size());
        System.out.printf("%6f\n", zero / arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

