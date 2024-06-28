import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        String answer = "";
        String[] point = input.split(" ");
        String[] point2 = input2.split(" ");

        int x = Math.abs(Integer.parseInt(point[0]) - Integer.parseInt(point2[0]));
        int y = Math.abs(Integer.parseInt(point[1]) - Integer.parseInt(point2[1]));

        if (x == 0 && y == 0) {
            answer = "DOT";
        } else if ((x == 0 && y > 0) || (x > 0 && y == 0)) {
            answer = "SEGMENT";
        } else {
            if (x == y) {
                answer = "SQUARE";
            } else {
                answer = "RECTANGLE";
            }
        }
        System.out.println(answer);


    }
}
