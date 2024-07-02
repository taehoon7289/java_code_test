package src;

public class MainTest2 {

  public static String solution(int N, int K) {
    // 총 length = N, K종류 문자
    String[] alphas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y",
        "z"};

//    System.out.println(alphas.length);

//    String[] cases = Arrays.stream(alphas).limit(K).toArray(String[]::new);
    boolean isOdd = N % 2 == 1;
    // 반값
    int cnt = N / 2;
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < cnt - K; i++) {
      answer.append(alphas[0]);
    }
    for (int i = 0; i < K; i++) {
      answer.append(alphas[i]);
    }
    StringBuilder temp = new StringBuilder(answer.toString());
    temp.reverse();
    if (isOdd) {
      // 홀수
      if (K * 2 < N) {
        answer.append(alphas[K-1]).append(temp);
      } else {
        answer.delete(answer.length() - 1, answer.length());
        temp = new StringBuilder(answer);
        temp.reverse();
        answer.append(alphas[K-1]).append(temp);
      }

    } else {
      // 짝수
      answer.append(temp);
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    System.out.println(solution(5, 2));
    System.out.println(solution(8, 3));
    System.out.println(solution(3, 2));
    System.out.println(solution(10, 5));
    System.out.println(solution(11, 5));
    System.out.println(solution(9, 5));
  }

}
