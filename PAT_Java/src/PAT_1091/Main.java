package PAT_1091;

/***
 * @author Tang
 * @Date 2019-07-31
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * 如果某个数 K 的平方乘以 N 以后，结果的末尾几位数等于 K，那么就称这个数为“N-自守数”。例如 3×92^2=25392，
 * 而 25392 的末尾两位正好是 92，所以 92 是一个 3-自守数。
 *
 * 本题就请你编写程序判断一个给定的数字是否关于某个 N 是 N-自守数。
 * 输入格式：
 *      输入在第一行中给出正整数 M（≤20），随后一行给出 M 个待检测的、不超过 1000 的正整数。
 * 输出格式：
 *      对每个需要检测的数字，如果它是 N-自守数就在一行中输出最小的 N 和 Nk^2的值，以一个空格隔开；否则输出 No。注意题目保证 N<10。
 *
 * 输入样例:
 *      3
 *      92 5 233
 * 输出样例：
 *      3 25392
 *      1 25
 *      No
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        for (int i=0;i<number.length;i++){  // 循环可能是自守数
            int num = Integer.parseInt(number[i]);
            TreeSet<Integer> treeSet =new TreeSet<>();
            for (int j=1;j<=10;j++){
                String NK = num*num*j+"";
                String lastOf = NK.substring(NK.length()-number[i].length(),NK.length());
                if (Integer.parseInt(lastOf) == Integer.parseInt(number[i])){
                    treeSet.add(j);
                    break;
                }else {
                    treeSet.add(11);
                }
            }
            treeSet.comparator();
            if (treeSet.first()!=11){
                System.out.println(treeSet.first()+" "+treeSet.first()*num*num);
            }else {
                System.out.println("No");
            }
        }

    }
}
