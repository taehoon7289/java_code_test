package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputDemo {

  /*
  예시
4 3
1 2 3
3 4 5
6 7 1
1 2 3
   */

  public static void main(String[] args) throws IOException {
    System.out.println("hello world!!");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk = new StringTokenizer(br.readLine()," ");  // 읽은 라인을 " "으로 자른다.

    // 자른 것 중 하나를 n에 저장 후, 그 다음 것을 m에 저장.
    int n = Integer.parseInt(stk.nextToken());
    int m = Integer.parseInt(stk.nextToken());

    int[][] arr = new int[10][10];

    // 그 다음 부터 행의 갯수만큼 라인을 입력받아서, StringTokenizer로 자를 예정임.
    for (int i = 0; i < n; i++) {
      stk = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(stk.nextToken());
      }
    }

    // -------------------------------------------------

    // << 출력부 >> (테스트하기)
    StringBuilder sb = new StringBuilder();
    sb.append("n : " + n + ", m : " + m).append('\n');

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        sb.append(arr[i][j]);
      }
      sb.append('\n');
    }
    System.out.println(sb);
  }
}
