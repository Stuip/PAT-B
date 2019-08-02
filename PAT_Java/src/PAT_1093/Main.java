package PAT_1093;

/***
 * @author Tang
 * @Date 2019-07-28
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * 给定两个字符串 A 和 B，本题要求你输出 A+B，即两个字符串的并集。要求先输出 A，再输出 B，但重复的字符必须被剔除。
 *
 * 输入格式：
 *      输入在两行中分别给出 A 和 B，均为长度不超过 10^6的、由可见 ASCII 字符 (即码值为32~126)和空格组成的、由回车标识结束的非空字符串。
 * 输出格式：
 *      在一行中输出题面要求的 A 和 B 的和。
 *
 * 输入样例：
 *      This is a sample test
 *      to show you_How it works
 * 输出样例：
 *      This ampletowyu_Hrk
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        for (int i=0;i<str1.length;i++){
            hashSet.add(str1[i]);
        }
        for (int i=0;i<str2.length;i++){
            hashSet.add(str2[i]);
        }
        for (Character c:hashSet){
            System.out.print(c);
        }
    }
}
