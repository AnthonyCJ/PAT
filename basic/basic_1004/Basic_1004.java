package PAT.basic.basic_1004;
import java.util.Scanner;

public class Basic_1004 {
    public static void main(String[] args) {
        int n, max = -1, min = 101, score;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String maxName = null, minName = null, maxNum = null, minNum = null, name, num;
        for (int i = 0; i < n; i++) {
            name = in.next();
            num = in.next();
            score = in.nextInt();

            if (max < score) {
                max = score;
                maxName = name;
                maxNum = num;
            }
            if (min > score) {
                min = score;
                minName = name;
                minNum = num;
            }
        }
        System.out.println(maxName + " " + maxNum);
        System.out.print(minName + " " + minNum);
        in.close();
    }
}
