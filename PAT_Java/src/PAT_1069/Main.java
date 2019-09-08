package PAT_1069;

/***
 * @description
 * @author Tang
 * @Date 2019-08-14
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * 小明 PAT 考了满分，高兴之余决定发起微博转发抽奖活动，从转发的网友中按顺序每隔 N 个人就发出一个红包。请你编写程序帮助他确定中奖名单。
 *
 * 输入格式：
 *      输入第一行给出三个正整数 M（≤ 1000）、N 和 S，分别是转发的总量、小明决定的中奖间隔、以及第一位中奖者的序号（编号从 1 开始）。
 *      随后 M 行，顺序给出转发微博的网友的昵称（不超过 20 个字符、不包含空格回车的非空字符串）。
 *      注意：可能有人转发多次，但不能中奖多次。所以如果处于当前中奖位置的网友已经中过奖，则跳过他顺次取下一位。
 * 输出格式：
 *      按照输入的顺序输出中奖名单，每个昵称占一行。如果没有人中奖，则输出 Keep going...。
 *
 */

/**
 * 开始有一个问题：
 *          如果这个网友已经是中奖对象，而且他的下一个还是中奖对象，这是一个困惑
 * 没有AC掉，有一个运行超时
 */


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int M = Integer.parseInt(data[0]);  // 转发量
        int N = Integer.parseInt(data[1]);  // 小明决定的中奖间隔
        int S = Integer.parseInt(data[2]);  // 第一个中奖的序列号

        // 将每一位网友从零开始储存，即第一位
        /**
         * 第一位网友： 0
         * 第二位网友： 1
         * ··············
         */
        String[] persons = new String[M];
        for (int i=0;i<persons.length;i++){
            persons[i] = br.readLine();   // 将每一网友的昵称储存起来
        }
        LinkedHashSet<String> hashSet= new LinkedHashSet<>();  // 储存中奖的昵称
        while(S<=M){   // 如果中奖的序列大于转发总量
            if (hashSet.contains(persons[S-1])){
                boolean flag=true;
                int num = S;
                while (flag){
                    if (hashSet.contains(persons[num])){
                        num++;
                    }
                    else {
                        hashSet.add(persons[num]);
                        flag=false;
                    }
                }
            }else {
                hashSet.add(persons[S-1]);
            }
            S+=N;
        }
        if (hashSet.size() > 0){
            for(String s:hashSet){
                System.out.println(s);
            }
        }else{
            System.out.println("Keep going...");
        }
    }
}
