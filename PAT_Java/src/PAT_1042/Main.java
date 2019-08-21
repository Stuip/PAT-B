package PAT_1042;

/***
 * @description  PAT-1042
 * @author Tang
 * @Date 2019-08-06
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 请编写程序，找出一段给定文字中出现最频繁的那个英文字母。
 * 输入格式：
 *      输入在一行中给出一个长度不超过 1000 的字符串。字符串由 ASCII 码表中任意可见字符及空格组成，
 *      至少包含 1 个英文字母，以回车结束（回车不算在内）
 * 输出格式：
 *      在一行中输出出现频率最高的那个英文字母及其出现次数，其间以空格分隔。如果有并列，
 *      则输出按字母序最小的那个字母。统计时不区分大小写，输出小写字母。
 *
 * 输入样式：
 *      This is a simple TEST.  There ARE numbers and other symbols 1&2&3...........
 * 输出样式：
 *      e 7
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toLowerCase().toCharArray();
        br.close();
        int[] num = new int[26];  // 存放每一个字母的个数
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'a'&& str[i]< 'z'){
                num[str[i]-'a'] += 1;  // 将每找到一个相对应的字母，就会加一
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < num.length; i++) {   // 比较字母频率，并将最高频率的下标保存
            if (num[i] > num[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println((char)(maxIndex + 'a') + " " + num[maxIndex]);
    }
}
