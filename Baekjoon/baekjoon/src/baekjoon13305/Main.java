package baekjoon13305;

import java.util.*;

/**
 * 아직 못풀었음!
 */
public class Main {
    public static void main(String[] args) {
        int numCity = 4;                //첫재쭐 인풋, 도시 갯수.
        int[] distance = {2, 3, 1};     //도시 사이의 거리.
        int[] price = {5, 2, 4, 1};     //도시 별 기름 가격. 이동할때 km당 l의 기름이 사용된다.
        //제일 왼쪽 도시에서 제일 오른쪽 도시로 가는 최소 비용을 출력한다.
        //시작할때의 기름은 0이다.
        int totalPrice = 0;
        int gas = 0;
        int currentMoved = 0;

        //최종거리 구하기
        int totalDistance = 0;
        for (int i = 0; i < distance.length; i++) {
            totalDistance += distance[i];
        }

        //sortedPrice map create
        int[] sortedPrice = new int[price.length-1];
        for (int i = 0; i < price.length - 1; i++) {
            sortedPrice[i] = price[i];
        }
        Arrays.sort(sortedPrice);
        Map<Integer, Integer> map = new HashMap<>();    //가스 가격 순서대로 저장. key = 가격, value = 가격 오름차순위.
        for (int i = 0; i < sortedPrice.length; i++) {
            map.put(sortedPrice[i], i);
        }

        for (int i = 0; i < numCity-1; i++) {
            if (gas < distance[i] && gas == 0) {        //첫번째 gas station
                while (gas < distance[i]) {
                    totalPrice += price[i];
                    gas++;
                }
            }
            gas -= distance[i];
            currentMoved += distance[i];
        }
        System.out.println(totalPrice);
    }
}