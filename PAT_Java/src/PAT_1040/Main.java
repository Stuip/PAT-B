package PAT_1040;

/***
 * @description
 * @author Tang
 * @Date 2019/9/3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符串 APPAPT 中包含了两个单词 PAT，其中第一个 PAT 是第 2 位(P)，第 4 位(A)，第 6 位(T)；第二个 PAT 是第 3 位(P)，第 4 位(A)，第 6 位(T)。
 * 现给定字符串，问一共可以形成多少个 PAT？
 * 输入格式：
 *   输入只有一行，包含一个字符串，长度不超过10^5,只包含 P、A、T 三种字母。
 *
 * 输出格式：
 *      在一行中输出给定字符串中包含多少个 PAT。由于结果可能比较大，只输出对 1000000007 取余数的结果。
 */


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toUpperCase().toCharArray();
        int countt=0,countp=0,result=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='T'){
                countt++;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'P'){
                countp++;
            }
            if (chars[i] == 'T'){
                countt--;
            }
            if (chars[i] == 'A'){
                result += countt*countp;
                if (result > 1000000007){
                    result = result % 1000000007;
                }
            }
        }
        System.out.println(result);
    }
}
