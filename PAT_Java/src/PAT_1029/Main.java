package PAT_1029;

/***
 * @description
 * @author Tang
 * @Date 2019-08-17
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出肯定坏掉的那些键。
 *
 * 输入格式：
 *      输入在 2 行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过 80 个字符的串，
 *      由字母 A-Z（包括大、小写）、数字 0-9、以及下划线 _（代表空格）组成。题目保证 2 个字符串均非空。
 * 输出格式：
 *      按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有 1 个坏键。
 */

/**
 * 思路：
 *      1，将两个字符串全部转化为大写字母
 *      2，将第一个字符串剔去第二个字符串的字符
 *      3.将第一个字符串中的字母添加到ArrayList中,如果重复则不添加;
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> alist = new ArrayList<String>();
        String input = br.readLine().toUpperCase();
        String lostInput = br.readLine().toUpperCase();
        br.close();

        for (int i=0;i<lostInput.length();i++){  // 循环第二个字符串
            if (input.contains(lostInput.charAt(i)+"")){   // 如果第一个字符串中包含这个字符
                input = input.replace(lostInput.charAt(i)+"","");  // 将这个字符剔去
            }
        }

        for (int i=0;i<input.length();i++){
            if (!alist.contains(input.charAt(i)+"")){
                alist.add(input.charAt(i)+"");
            }
        }
        for (String s:alist){
            System.out.print(s);
        }

    }
}
