package programmers;

import java.util.*;

public class 프로세스 {

  public int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      int p = priorities[i];
      int[] arr = new int[] {p, i == location ? 1 : 0};
      queue.offer(arr);
    }
    int count = 0;
    while(!queue.isEmpty()) {
      count++;
      OptionalInt optionalInt = queue.stream().mapToInt(item -> item[0]).max();
      int max = optionalInt.getAsInt();
      int[] value = queue.poll();
      if (value[0] < max) {
        queue.offer(value);
        continue;
      }
      if (value[1] == 1) {
        answer = count;
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    프로세스 main = new 프로세스();
    main.solution(new int[]{2,1,3,1}, 2);
  }

}
