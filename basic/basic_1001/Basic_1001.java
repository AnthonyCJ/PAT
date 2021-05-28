package PAT.Basic.Basic_1001;
import java.util.Scanner;

public class Basic_1001 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int nNum = in.nextInt();
        int nTimes = 0;

        while (nNum != 1){
            if (nNum % 2 == 0) {
                nNum /= 2;
            }
            else {
                nNum = 3 * nNum + 1;
                nNum /= 2;
            }
            nTimes++;
        }
        System.out.print(nTimes);
        in.close();
    }
}
