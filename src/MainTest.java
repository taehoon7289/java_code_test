package src;

import java.util.Arrays;

//class Solution {
//
//  public int solution(int[] A) {
//    int[] AA = Arrays.stream(A).filter(value -> value > 0).sorted().distinct().toArray();
//    int answer = 1;
//    for (int i : AA) {
//      if (answer != i) {
//        break;
//      }
//      answer += 1;
//    }
//    return answer;
//  }
//}
public class MainTest {

  public static int solution(int[] A) {
    int[] AA = Arrays.stream(A).filter(value -> value > 0).sorted().distinct().toArray();
    int answer = 1;
    for (int i : AA) {
      if (answer != i) {
        break;
      }
      answer += 1;
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] A = {1, 3, 6, 4, 1, 2};
    System.out.println(solution(A));
  }

}
