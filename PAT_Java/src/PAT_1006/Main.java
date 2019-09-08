package PAT_1006;

import java.util.Scanner;
import java.util.Arrays;


/**
 * 让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。
 *  例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 *
 * 输入格式：
 *      每个测试输入包含 1 个测试用例，给出正整数 n（<1000）。
 *
 * 输出格式：
 *      每个测试用例的输出占一行，用规定的格式输出 n。
 */

/**
 * 解题思路：
 *      1，首先需要将个十百位上面的数字分隔开来，
 *      2，知道了B、S的个数
 *      3，通过填充某个字符数组来获得，再将其转化为字符串对象
 *      4，将个位数通过循环打印出来
 */

class Main{
    public static final int number = 1000;

    /**
     * 将所成立的数组用某个字符填充满
     * @param letter
     * @param n
     * @return
     */
    public static String repeatStr(char letter,int n){
        char[] chars = new char[n];
        Arrays.fill(chars, letter);
        String result = new String(chars);
        return result;
    }

    public static void main(String[] args) {
        int bai=0,shi=0,ge=0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < number){
            bai = num/100;
            shi = (num/10)%10;
            ge = num%10;
        }
        System.out.print(repeatStr('B',bai)+repeatStr('S', shi));
        for(int i=1;i<=ge;i++){
            System.out.print(i);
        }
        in.close();
    }
}