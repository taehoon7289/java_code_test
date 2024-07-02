package src;

import java.util.*;
import java.util.stream.Collectors;

public class MainTest2_1 {

    public static void main(String[] args) {
        new Test().solution();
    }

    static class Test {
        public void solution() {

            List<Integer> answer = new ArrayList<>();
            int[][] data = new int[][]{{1, 0, 5}, {2, 2, 2}, {3, 3, 1}, {4, 4, 1}, {5, 10, 2}};

            List<List<Integer>> list = new ArrayList<>();
            for (int[] d: data) {
                list.add(Arrays.stream(d).boxed().collect(Collectors.toList()));
            }

            Set<Integer> end = new HashSet<>();
            int time = 0;
            while (end.size() < list.size()) {
                List<List<Integer>> target = new ArrayList<>();
                for (List<Integer> l : list) {
                    if (end.contains(l.get(0))) {
                        continue;
                    }
                    if (l.get(1) <= time) {
                        target.add(l);
                    }
                }
                if (target.isEmpty()) {
                    time++;
                    continue;
                }
                List<List<Integer>> ordered = getList(target);
                List<Integer> first = ordered.get(0);

                time += first.get(2);
                answer.add(first.get(0));
                end.add(first.get(0));
            }

            System.out.println(answer);


        }

        public List<List<Integer>> getList(List<List<Integer>> list) {
            List<List<Integer>> result =  list.stream().sorted((o1, o2) -> {
                int time1 = o1.get(1);
                int count1 = o1.get(2);

                int time2 = o2.get(1);
                int count2 = o2.get(2);

//                System.out.println("time1 : " + time1);
//                System.out.println("time2 : " + time2);

                if (time1 < time2) {
//                    System.out.println("111");
                    return -1;
                } else if (time1 == time2) {
                    if (count1 <= count2) {
//                        System.out.println("222");
                        return -1;
                    } else {
//                        System.out.println("333");
                        return 1;
                    }
                } else {
//                    System.out.println("444");
                    return 1;
                }
            }).toList();

            System.out.println(result);
            return result;
        }
    }

}
