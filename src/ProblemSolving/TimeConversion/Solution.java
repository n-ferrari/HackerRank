package ProblemSolving.TimeConversion;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        char[] charArray = new char[s.length()];
        char[] output = new char[8];

        int hour = Integer.parseInt(s.substring(0, 2));

        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }
        if (charArray[8] == 'A') {
            if (charArray[0] == '1' && charArray[1] == '2') {
                output[0] = '0';
                output[1] = '0';
                for (int i = 2; i < 8; i++){
                    output[i] = charArray[i];
                }
            } else {
                for (int i = 0; i < 8; i++)
                    output[i] = charArray[i];
            }
        } else {
            if (charArray[0] == '1' && charArray[1] == '2') {
                for (int i = 0; i < 8; i++)
                    output[i] = charArray[i];
            } else {
                int militaryHour = hour + 12;
                int firstDigit = (militaryHour / 10);
                int secondDigit = militaryHour % 10;
                char a = (char) firstDigit;

                output[0] = (char) (firstDigit + '0');
                output[1] = (char) (secondDigit + '0');

                for (int i = 2; i < 8; i++) {
                    output[i] = charArray[i];
                }

            }

        }
        String stringOutput = new String(output);
        return stringOutput;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


