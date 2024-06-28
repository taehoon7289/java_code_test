import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int num = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);

        String input2 = br.readLine();
        String[] arr2 = input2.split(" ");

        Set<Integer> set = Arrays.stream(arr2).map(Integer::parseInt).collect(Collectors.toSet());

        String input3 = br.readLine();
        String[] arr3 = input3.split(" ");

        Set<Integer> set2 = Arrays.stream(arr3).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> sumSet = new HashSet<>();
        sumSet.addAll(set);
        sumSet.addAll(set2);

        Set<Integer> retainSet = new HashSet<>();
        retainSet.addAll(set);
        retainSet.retainAll(set2);

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(sumSet);
        resultSet.removeAll(retainSet);

        List<Integer> resultList = new ArrayList<>(resultSet);
        resultList = resultList.stream().sorted().collect(Collectors.toList());
        for (int i : resultList) {
            System.out.print(i + " ");
        }









    }
}
