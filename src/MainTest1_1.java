package src;

import java.util.*;

public class MainTest1_1 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Test().solution()));
  }

  static class Test {
    public int[] solution() {
//      int[] people = new int[]{1, 3, 3, 2, 4, 3, 3, 2, 4, 2, 2, 4};
//      int[] people = new int[]{1,1,3,3,3,3,1,3,3,3,3,2};
      int[] people = new int[]{1,2,3,4};
      // people 체크해서
      // people number map key, 카운팅 하다가 4 되면 answer 로 append
      // answer 비었으면 [-1] 리턴
      List<Integer> answer = new ArrayList<>();
      Map<Integer, Integer> map = new HashMap<>();
      for (int person : people) {
        if (!map.containsKey(person)) {
          map.put(person, 1);
        } else {
          int value = map.get(person);
          if (value >= 3) {
            answer.add(person);
            map.put(person, 0);
          } else {
            map.put(person, map.get(person) + 1);
          }
        }
      }
      if (answer.isEmpty()) {
        return new int[] {-1};
      }
      return answer.stream().mapToInt(i -> i).toArray();
    }
  }

}
