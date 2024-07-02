package programmers;

public class 지그재그배열 {

  public String solution() {
    String answer = "";
    int n = 10;
    int[][] arr = new int[n][n];
    int row = 0; // row
    int col = 0; // col
    int number = 1;
    arr[row][col] = number++;
    // col 이동 부터 시작
    col++;
    arr[row][col] = number++;
    while (!(row == n - 1 && col == n - 1)) {
      // 방향 전환
      if (col > row) {
        // row 증가, col 감소, 좌하 방향
        int count = col - row;
        for (int i = 0; i < count; i++) {
          row += 1;
          col -= 1;
          arr[row][col] = number++;
        }
        if (row < n - 1) {
          arr[++row][col] = number++;
        } else {
          arr[row][++col] = number++;
        }
      } else if (row > col) {
        // row 감소, col 증가, 우상방향
        int count = row - col;
        for (int i = 0; i < count; i++) {
          row -= 1;
          col += 1;
          arr[row][col] = number++;
        }
        if (col < n - 1) {
          arr[row][++col] = number++;
        } else {
          arr[++row][col] = number++;
        }
      }
    }

    for (int[] ints : arr) {
        for (int anInt : ints) {
            System.out.print(String.format("%d\t", anInt));
        }
        System.out.println();
    }


    return answer;
  }

  public static void main(String[] args) {
    지그재그배열 main = new 지그재그배열();
    main.solution();
  }

}
