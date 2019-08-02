package PAT_1002;

/***
 * @author Tang
 * @Date 2019-07-26
 */

import java.util.Scanner;

/**
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * 输入格式：
 *      每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100
 * 输出格式：
 *      在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
 * 输入样例：
 *      1234567890987654321123456789
 * 输出样例：
 *      yi san wu
 */

public class Main {

    public static String printN(char c){
        String s=null;
        String[] digtal = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        switch (c){
            case '0':
                s = digtal[0];
                break;
            case '1':
                s = digtal[1];
                break;
            case '2':
                s = digtal[2];
                break;
            case '3':
                s = digtal[3];
                break;
            case '4':
                s = digtal[4];
                break;
            case '5':
                s = digtal[5];
                break;
            case '6':
                s = digtal[6];
                break;
            case '7':
                s = digtal[7];
                break;
            case '8':
                s = digtal[8];
                break;
            case '9':
                s = digtal[9];
                break;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] digtal = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String[] number= sc.nextLine().split("");
        int total = 0;
        for (int i=0;i<number.length;i++){
            total+= Integer.parseInt(number[i]);
        }
        String str = total + "";
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (i != chars.length-1){
                System.out.printf("%s ",printN(chars[i]));
            }else {
                System.out.printf("%s",printN(chars[i]));
            }
        }
    }
}
