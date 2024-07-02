package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        int n = Integer.parseInt(arr[0]);
        int l = Integer.parseInt(arr[1]);
        int r = Integer.parseInt(arr[2]);
        int b = Integer.parseInt(arr[3]);
        int t = Integer.parseInt(arr[4]);

        int result = 0;

        for (int i = 0; i < n; i++) {
            String _input = br.readLine();
            String[] points =_input.split(" ");
            int x = Integer.parseInt(points[0]);
            int y = Integer.parseInt(points[1]);
            if ((l <= x && x <= r) && b <= y && y <= t) {
                result++;
            }
        }

        System.out.println(result);

    }
}
