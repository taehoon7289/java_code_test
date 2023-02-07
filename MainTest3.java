import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainTest3 {

  public static int solution(String[] R) {

    // . 인 위치만 갈수 있음.
    // 오른쪽방향으로 방향 회전 가능
    // {row, col}
    int[][] cases = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    Queue<Integer[]> queue = new LinkedList<>();
    int maxRow = R.length;
    int maxCol = R[0].length();
    char[][] tempArr = new char[maxRow][maxCol];
    for (int i = 0; i < maxRow; i++) {
      tempArr[i] = R[i].toCharArray();
    }

    int[][] visited = new int[maxRow][maxCol]; // 방문 여부 [row], [col]
    for (int i = 0; i < maxRow; i++) {
      for (int j = 0; j < maxCol; j++) {
        visited[i][j] = 0;
      }
    }
    // 현재 col, 현재 row, 현재 방향 인덱스
    queue.add(new Integer[]{0, 0, 0});
    visited[0][0] += 1;

    while (!queue.isEmpty()) {
      Integer[] nowValue = queue.poll();
      int nowCol = nowValue[0];
      int nowRow = nowValue[1];
      int directIndex = nowValue[2];
      int count = 0;
      while (count < 4) {

        int nextRow = cases[directIndex][0] + nowRow;
        int nextCol = cases[directIndex][1] + nowCol;
        if ((0 <= nextRow && nextRow < maxRow) && (0 <= nextCol
            && nextCol < maxCol)) {
          if (tempArr[nextRow][nextCol] == 'X') {
            // 방향 전환 해야됨
            directIndex += 1;
            if (directIndex > 3) {
              directIndex = 0;
              count += 1;
            }
            continue;
          }
          if (visited[nextRow][nextCol] < 5) {
            visited[nextRow][nextCol] += 1;
            queue.add(new Integer[]{nextCol, nextRow, directIndex});
            count = 0;
            break;
          } else {
            break;
          }
        } else {
          // 방향 전환 해야됨
          directIndex += 1;
          if (directIndex > 3) {
            directIndex = 0;
            count += 1;
          }
        }
      }
    }
    int answer = 0;
    for (int i = 0; i < maxRow; i++) {
      for (int j = 0; j < maxCol; j++) {
        if (visited[i][j] > 0) {
          answer += 1;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String[] R1 = {"...X..", "...X..", "..X..."};
    String[] R2 = {"....X..", "X......", ".....X.", "......."};
    String[] R3 = {"...X.", ".X..X", "X...X", "..X.."};
    String[] R4 = {"."};
//    System.out.println(solution(R1));
//    System.out.println(solution(R2));
    System.out.println(solution(R3));
//    System.out.println(solution(R4));

  }

}
