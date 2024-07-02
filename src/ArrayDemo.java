package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayDemo {

  public static void main(String[] args) {
    Integer[] temp = {10, 11, 21, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer[][] temp2 = {{3, 4}, {5, 6}, {1, 2}, {7, 8}};
//    Arrays.sort(temp, (i1, i2) -> {
//      System.out.println("i1 : " + i1);
//      System.out.println("i2 : " + i2);
//      return i2 - i1;
//    });

    Integer[] temp3 = Arrays.stream(temp).filter(value -> value > 5).toArray(Integer[]::new);
    System.out.println(Arrays.toString(temp3));

    Arrays.sort(temp, Collections.reverseOrder());
    Arrays.sort(temp2, (o1, o2) -> {
      return o2[0] - o1[0];
//      if (o1[0].equals(o2[0])) {
//        return o1[0] - o2[0];
//      }
    });
    System.out.println(Arrays.toString(temp));
    for (int i = 0; i < temp2.length; i++) {
      System.out.println(Arrays.toString(temp2[i]));
    }

    // 다중 조건
    int[][] arr2 = new int[][]{{5, 40}, {3, 50}, {1, 30}, {4, 20}, {2, 10},
        {6, 40}, {6, 50}, {6, 10}, {6, 20}, {6, 30}};

    Arrays.sort(arr2, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1]
            - o2[1]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
        //return o1[0]!=o2[0] ? o1[0]-o2[0] : o2[1]-o1[1]; // 첫번째 기준 오름차순 > 두번째 기준 내림차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,50}{6,40}{6,30}{6,20}{6,10}
      }
    });

  }

}
