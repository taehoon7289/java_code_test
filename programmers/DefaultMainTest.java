package programmers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DefaultMainTest {

    public String solution() {
        String answer = "";

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                list.remove(i);
//            }
//        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        DefaultMainTest main = new DefaultMainTest();
        main.solution();
    }

}
