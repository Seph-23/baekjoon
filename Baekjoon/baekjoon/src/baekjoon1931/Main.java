package baekjoon1931;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMeeting = 11;

        String inputTemp2;
        String[] inputTemp = new String[2];
        String[] input = new String[numMeeting * 2];

        for (int i = 0; i < numMeeting; i++) {
            inputTemp2 =
            inputTemp[i] = sc.nextLine();
            input = inputTemp.split(" ");
        }

        for (int i = 0; i < numMeeting * 2; i++) {
            System.out.println(input[0]);
        }
    }
}
