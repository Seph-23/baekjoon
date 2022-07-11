package blackjack;

import java.util.Scanner;
import java.util.Arrays;

public class BlackJack {
    public static void main(String[] args){
        //Declaration
        int[] input1 = new int[2];
        Scanner sc1 = new Scanner(System.in);
        int n, m;                           //n = 카드 수, m = 최대 수
        int[] input2;                       //각 카드의 수
        int result = 0;                     //세 수의 합

        //First User Input
        for(int i=0; i<2; i++) {
            if(sc1.hasNext() == true) {
                input1[i] = sc1.nextInt();
            }
        }

        n = input1[0];
        m = input1[1];

        //Second User Input
        input2 = new int[n];                    //Declare length of input2 array.
        for(int i =0; i<input2.length; i++){
            if(sc1.hasNext() == true) {
                input2[i] = sc1.nextInt();
            }
        }

        //Sort array
        Arrays.sort(input2);

        /* Brute force method?? 어케 하는거지??
        for(int i=0; i<input2.length; i++){
            result = 0;
            result += input2[i];

            for(int j=0; j<input2.length; j++){
                if(i==j){
                    continue;
                }
                result += input2[j];

                for(int j2=0; j2<input2.length; j2++){
                    if((j2==i) || (j2==j)){
                        continue;
                    }
                    result += input2[j2];
                    //여기서 M을 넘지 않으며 가장 큰 수인지 체크해야함
                }
            }
        }
        */
    }
}
