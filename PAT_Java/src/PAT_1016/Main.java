package PAT_1016;

/**
 * 正整数A的“Da（为1位整数）部分”定义为由A中所有的Da组成的新整数。
 * 例如：给定A=3862767，Da=6，则A的“6部分“Pa是66，因为A中有2个6。
 * 现给定A，Da，B，Db，请编写程序计算Pa+Pb
 */

/**
 * 解题思路：
 1. 接受一行字符串(以空格来分隔)
 2. 分别把A，B存放在字符串中，Da和Db存放在整型中
 3. 循环A，B字符串与字符'0'相减,来判断是否与Da/Db相等
 4.
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int Da = sc.nextInt();
        String B = sc.next();
        int Db = sc.nextInt();
        sc.close();

        long PA = 0;
        for (int i = 0;i<A.length();i++){
            if (A.charAt(i) - '0' == Da){
                PA = PA * 10 + (A.charAt(i) -  '0');
            }
        }

        long PB = 0;
        for (int i = 0;i<B.length();i++){
            if (B.charAt(i) -  '0' == Db){
                PB = PB * 10 + (B.charAt(i) - '0');
            }
        }
        System.out.print(PA+PB);
        sc.close();
    }
}
