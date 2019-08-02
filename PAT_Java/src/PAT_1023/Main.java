package PAT_1023;

import java.util.Scanner;

/**
 * 给定数字 0-9 各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意 0 不能做首位）。
 * 例如：给定两个 0，两个 1，三个 5，一个 8，我们得到的最小的数就是 10015558。
 * 现给定数字，请编写程序输出能够组成的最小的数。
 *
 * 输入格式：
 *      输入在一行中给出 10 个非负整数，顺序表示我们拥有数字 0、数字 1、……数字 9 的个数。
 *      整数间用一个空格分隔。10 个数字的总个数不超过 50，且至少拥有 1 个非 0 的数字。
 * 输出格式：
 *      在一行中输出能够组成的最小的数。
 *
 * 输入样例：
 *      2 2 0 0 0 3 0 0 1 0
 * 输出格式：
 *      10015558
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] str = sc.nextLine().split(" ");
        int[] num = new int[str.length]; // 储存相对应的数字个数
        for (int i=0;i<str.length;i++){
            num[i] = Integer.parseInt(str[i]);
        }
        for (int i=1;i<num.length;i++){
            if (num[i] >= 1){  // 判断最小值是多少
                System.out.print(numbers[i]);
                num[i]--; // 减少一个
                break;
            }
        }
        for (int j=0;j<num.length;j++){
            while (num[j] > 0){
                System.out.print(numbers[j]);
                num[j]--;
            }
        }
        sc.close();
    }
}
