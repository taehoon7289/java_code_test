package src;

public class MainTest1_3_1 {

    public static void main(String[] args) {
        new Test().solution();
    }

    static class Test {
        public void solution() {
//      int n = 5; // n X n 행렬
//      int r = 3; // 찾는 행
//      int c = 2; // 찾는 열

            int n = 5;

            int[][] arr = new int[n][n];

            int number = 1;

            for (int i = 0; i < n; i++) {    //커서 옮기는 역할
                int j = 0;
                if (i % 2 != 0) {
                    for (int k = 0; k < i + 1; k++) {
                        arr[0 + j][i - j] = number++;
                        j++;
                    }
                } else {
                    for (int k = 0; k < i + 1; k++) {    //내부 반복횟수
                        arr[i - j][0 + j] = number++;
                        j++;
                    }
                }
            }

            for (int i = 1; i <= n - 1; i++) {    //커서 옮기는 역할(줄바꾸기)
                int j = 0;

                //홀수
                if ((i + n - 1) % 2 != 0) {
                    for (int k = i; k < n; k++) {
                        arr[i + j][n - 1 - j] = number++;
                        j++;
                    }

                    //짝수
                } else {

                    for (int k = i; k < n; k++) {    //내부 반복횟수
                        arr[n - 1 - j][i + j] = number++;
                        j++;
                    }
                }
            }

            //출력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
    }

}
