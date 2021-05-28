package PAT.basic.basic_1002;
import java.util.Scanner;
import java.lang.String;
import java.util.Stack;

public class Basic_1002 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String sNum = in.nextLine();    // 输入数字串
        char [] cNum = sNum.toCharArray();  // 字符串转字符数组
        int nSum = 0;   // 各位之和
        // 求解数字串各位之和
        for (int i = 0; i < sNum.length(); i++) {
            nSum += cNum[i] - 48;
        }
        // 将nSum每一位拆开并转化为字符输出
        // 将nSum每一位进栈
        Stack<Integer> stack = new Stack<Integer>();
        while (nSum != 0){
            stack.push(nSum % 10);
            nSum /= 10;
        }
        // 输出最高位数字对应拼音
        int nTemp = 0;  // 临时变量保存出栈数字
        nTemp = stack.peek();
        stack.pop();
        switch (nTemp)    {
            case 0:
            {
                System.out.print("ling");
                break;
            }
            case 1:
            {
                System.out.print("yi");
                break;
            }
            case 2:
            {
                System.out.print("er");
                break;
            }
            case 3:
            {
                System.out.print("san");
                break;
            }
            case 4:
            {
                System.out.print("si");
                break;
            }
            case 5:
            {
                System.out.print("wu");
                break;
            }
            case 6:
            {
                System.out.print("liu");
                break;
            }
            case 7:
            {
                System.out.print("qi");
                break;
            }
            case 8:
            {
                System.out.print("ba");
                break;
            }
            case 9:
            {
                System.out.print("jiu");
                break;
            }
            default:
            {
                System.out.print("shi");
                System.exit(0);
                break;           
            }
        }

    // 按拼音输出余下所有数字
    while (!stack.isEmpty())
    {
        // 输出空格+一个数的拼音
        nTemp = stack.peek();
        stack.pop();
        switch (nTemp)
        {
            case 0:
            {
                System.out.print(" ling");
                break;
            }
            case 1:
            {
                System.out.print(" yi");
                break;
            }
            case 2:
            {
                System.out.print(" er");
                break;
            }
            case 3:
            {
                System.out.print(" san");
                break;
            }
            case 4:
            {
                System.out.print(" si");
                break;
            }
            case 5:
            {
                System.out.print(" wu");
                break;
            }
            case 6:
            {
                System.out.print(" liu");
                break;
            }
            case 7:
            {
                System.out.print(" qi");
                break;
            }
            case 8:
            {
                System.out.print(" ba");
                break;
            }
            case 9:
            {
                System.out.print(" jiu");
                break;
            }
            default:
            {
                System.out.print(" shi");
                System.exit(0);
                break;           
            }
        }
    }
    
    in.close();
    }
}
