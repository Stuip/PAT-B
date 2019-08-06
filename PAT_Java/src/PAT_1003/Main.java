package PAT_1003;

/***
 * @description PAT-1023
 * @author Tang
 * @Date 2019-08-04
 */


import java.util.Scanner;

/**
 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于 PAT 的“答案正确”大派送 —— 只要读入的字符串满足下列条件，
 * 系统就输出“答案正确”，否则输出“答案错误”。得到“答案正确”的条件是：
 *      字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
 *      任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
 *      如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
 * 现在就请你为 PAT 写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
 *
 * 输入格式：
 *      每个测试输入包含 1 个测试用例。第 1 行给出一个正整数 n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，
 *      字符串长度不超过 100，且不包含空格。
 * 输出格式：
 *      每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出 YES，否则输出 NO。
 * 输入样例：
 *      8
 *      PAT
 *      PAAT
 *      AAPATAA
 *      AAPAATAAAA
 *      xPATx
 *      PT
 *      Whatever
 *      APAAATAA
 * 输出样例：
 *      YES
 *      YES
 *      YES
 *      YES
 *      NO
 *      NO
 *      NO
 *      NO
 */


/**
 * 解题思路：
 *      第一个条件就是只包含PAT三个字母，如果统计P、A、T三个字母之和，如果等于字符串长度就对的
 *      第二条件在PAT两边必须是相等且为空格或者"A"字符
 *      第三条件就是每次在P、T之间添加一个字符，那么在T的右边就要添加与P左边相等的字符，这个字符个数由P左边的字符决定
 */


public class Main {

    public static boolean checkChar(String s){
        boolean hasP = false;
        boolean hasT = false;
        boolean wrong = false;
        int[] PATNum = {0,0,0};  // 统计P、A、T三个字母的个数
        for (int i=0;i<s.length()&&!wrong;i++){
            char c =s.charAt(i);
            if (c == 'P'){
                if (hasP){
                    wrong = true;
                }else {
                    hasP = true;
                }
                continue;
            }
            if (c == 'T') {
                if (hasT == true) {
                    wrong = true;
                } else {
                    hasT = true;
                }
                continue;
            }
            if (c == 'T') {
                if (hasT == true) {
                    wrong = true;
                } else {
                    hasT = true;
                }
                continue;
            }
            if (c == 'A') {
                if (!hasP && !hasT) {
                    ++PATNum[0];
                }
                if (hasP && !hasT) {
                    ++PATNum[1];
                }
                if (hasP && hasT) {
                    ++PATNum[2];
                }
                if (!hasP && hasT) {
                    wrong = true;
                }
                continue;
            }
            wrong = true;
        }
        return hasP && hasT && (!wrong && (PATNum[0] * PATNum[1] == PATNum[2]) && PATNum[1] > 0) == true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String s = sc.next();
            if (checkChar(s) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

}
