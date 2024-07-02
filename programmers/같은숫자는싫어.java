package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 같은숫자는싫어 {

  public int[] solution(int []arr) {
    String answer = "";
    List<Integer> list = new ArrayList<>();
    list.add(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        continue;
      }
      list.add(arr[i]);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();

  }

  public static void main(String[] args) {
    같은숫자는싫어 main = new 같은숫자는싫어();
    System.out.println(main.solution(new int[] {1, 1, 3, 3, 0, 1, 1}));
    System.out.println(main.solution(new int[] {4, 4, 4, 3, 3}));
  }

}
