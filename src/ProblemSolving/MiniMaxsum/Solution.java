package ProblemSolving.MiniMaxsum;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long  sum = 0;
        for (int num : arr) {
            sum += num;
        }
        List<Long> list = new ArrayList<>();
        for (long num : arr) {
            list.add(sum - num);
        }
        long minimum = list.get(0);
        long maximum = list.get(0);

        for (long num : list) {
            if(num < minimum){
                minimum = num;
            }
            if(num > maximum){
                maximum = num;
            }
        }
        System.out.println(minimum + " " + maximum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

