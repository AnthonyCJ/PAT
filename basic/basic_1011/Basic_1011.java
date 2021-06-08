package PAT.basic.basic_1011;
import java.util.Scanner;

public class Basic_1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextLong() + in.nextLong() > in.nextLong()) {
                System.out.println("Case #" + (i + 1) + ": " + "true");
            }
            else {
                System.out.println("Case #" + (i + 1) + ": " + "false");
            }
        }
        in.close();
    }
}
