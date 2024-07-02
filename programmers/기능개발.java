package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<List<Integer>> progressList = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
          List<Integer> list = new ArrayList<>();
          list.add(progresses[i]);
          list.add(speeds[i]);
          progressList.add(list);
        }

        int time = 0;
        while (!progressList.isEmpty()) {
          time++;
          // 진행
          progressList.forEach(progress -> {
            progress.set(0, progress.get(0) + progress.get(1));
          });

          int count = 0;
          while (!progressList.isEmpty()) {
            List<Integer> progress = progressList.peek();
            if (progress.get(0) >= 100) {
              progressList.poll();
              count++;
            } else {
              break;
            }
          }
          if (count > 0) {
            result.add(count);
          }
        }


        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        기능개발 main = new 기능개발();
        main.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        main.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
    }

}
