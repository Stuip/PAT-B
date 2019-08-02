package PAT_1076;

/***
 * @author Tang
 * @Date 2019-07-22
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 下面是微博上流传的一张照片：“各位亲爱的同学们，鉴于大家有时需要使用 wifi，又怕耽误亲们的学习，
 * 现将 wifi 密码设置为下列数学题答案：A-1；B-2；C-3；D-4；请同学们自己作答，每两日一换。谢谢合作！！~”——
 * 老师们为了促进学生学习也是拼了…… 本题就要求你写程序把一系列题目的答案按照卷子上给出的对应关系翻译成 wifi 的密码。
 * 这里简单假设每道选择题都有 4 个选项，有且只有 1 个正确答案。
 *
 * 输入格式；
 *      输入第一行给出一个正整数 N（≤ 100），随后 N 行，每行按照 编号-答案 的格式给出一道题的 4 个选项，
 *      T 表示正确选项，F 表示错误选项。选项间用空格分隔。
 * 输出格式：
 *      在一行中输出 wifi 密码。
 * */




public class Main {

    public static void printN(String[] str){
        for (int i=0;i<str.length;i++){
            System.out.printf("%s ",str[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        for (int i=0;i<N;i++){
            String s= br.readLine();
            String[] str = s.split(" ");
            for (int j=0;j<str.length;j++){
                if (str[j].indexOf("T") >0){
                    String[] strings = str[j].split("-");
                    switch (strings[0]){
                        case "A":
                            answer[i] = 1;
                            break;
                        case "B":
                            answer[i] = 2;
                            break;
                        case "C":
                            answer[i] = 3;
                            break;
                        case "D":
                            answer[i] = 4;
                    }
                }
            }
        }
        for (int k=0;k<answer.length;k++){
            System.out.print(answer[k]);
        }
        br.close();
    }
}
