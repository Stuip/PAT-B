package PAT_1009;

/***
 * @description
 * @author Tang
 * @Date 2019/8/24
 */

import java.util.Scanner;

/**
 * 给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 *
 * 输入格式：
 *          测试输入包含一个测试用例，在一行内给出总长度不超过 80 的字符串。字符串由若干单词和若干空格组成，
 *          其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用 1 个空格分开，输入保证句子末尾没有多余的空格。
 * 输出格式：
 *          每个测试用例的输出占一行，输出倒序后的句子
 * 输入样例：
 *      Hello World Here I Come
 * 输出样例：
 *      Come I Here World Hello
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        sc.close();
        for (int i=0;i<str.length / 2;i++){
            String temp;
            temp = str[str.length - i-1];
            str[str.length - i-1] = str[i];
            str[i] = temp;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if(i==str.length-1)
                System.out.print("\n");
            else
                System.out.print(" ");
        }
    }
}
