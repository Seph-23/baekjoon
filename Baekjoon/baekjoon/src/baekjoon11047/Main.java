package baekjoon11047;

import java.util.Scanner;
/**
 * 맞았습니다!
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inSplit = input.split(" ");
        int n;      //types of coins
        int k;      //target value
        n = Integer.parseInt(inSplit[0]);
        k = Integer.parseInt(inSplit[1]);
        int[] coins = new int[n];
        int currVal = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for (int j = n-1; j >= 0; j--) {
            if (currVal == k) {
                break;
            }
            if (coins[j] + currVal <= k) {
                do {
                    currVal += coins[j];
                    count++;
                } while (currVal + coins[j] <= k);
            }
        }

        System.out.println(count);
    }
}
