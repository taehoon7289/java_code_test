package src;

public class MainTest1_3 {

  public static void main(String[] args) {
    new Test().solution();
  }

  static class Test {
    public void solution() {
      int n = 5; // n X n 행렬
      int r = 3; // 찾는 행
      int c = 2; // 찾는 열

      // 지그재그로 숫자가 들어간 2차원배열 만들기가 주 관건
      // (행, 열)
      // (1,1) -> (1,2) -> (2, 1) -> (3,1) -> (2,2) -> () -> () -> ()
      // 만들어서 (r,c) 리턴

    }
  }

}
