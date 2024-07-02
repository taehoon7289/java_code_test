package programmers;

import java.util.*;
import java.util.stream.IntStream;

public class 다리를지나는트럭 {

  public String solution(int bridge_length, int weight, int[] truck_weights) {
    String answer = "";

    // bridge_length: 다리 길이 (시간으로 생각)
    // weight: 넘으면 안됨
    // truck_weights: 각 트럭 무게
//    Queue<Integer> trucks = new LinkedList<>(IntStream.of(truck_weights).boxed().toList());
    Queue<Integer> trucks = new LinkedList<>();
    for (int i : truck_weights) {
      trucks.add(i);
    }


    Queue<Integer> arrives = new LinkedList<>();
    Queue<int[]> bridges = new LinkedList<>();
    // 0: truck_weight 1: time
    int time = 0;

    int nowWeight = 0 ;

    while (arrives.size() < truck_weights.length) {
      time++;
      if (!bridges.isEmpty()) {
        bridges.forEach(b -> {
          b[1]++;
        });
        if (bridges.peek()[1] >= bridge_length) {
          int[] truck = bridges.poll();
          arrives.add(truck[0]);
          nowWeight -= truck[0];
        }
      }

      // 다리 체크
      if (!trucks.isEmpty()) {
        if (trucks.peek() + nowWeight <= weight) {
          Integer w = trucks.poll();
          bridges.add(new int[] {w, 0});
          nowWeight += w;
        }
      }

    }

    System.out.println(time);

    return answer;
  }

  public static void main(String[] args) {
    다리를지나는트럭 main = new 다리를지나는트럭();
    main.solution(2, 10 , new int[]{7,4,5,6});
    main.solution(100, 100 , new int[]{10});
    main.solution(100, 100 , new int[]{10,10,10,10,10,10,10,10,10,10});
  }

}
