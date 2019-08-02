package PAT_1064;

/***
 * @description
 * @author Tang
 * @Date 2019-08-01
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * 如果两个整数各位数字的和是一样的，则被称为是“朋友数”，而那个公共的和就是它们的“朋友证号”。
 * 例如 123 和 51 就是朋友数，因为 1+2+3 = 5+1 = 6，而 6 就是它们的朋友证号。给定一些整数，要求你统计一下它们中有多少个不同的朋友证号。
 *
 * 输入格式：
 *      输入第一行给出正整数 N。随后一行给出 N 个正整数，数字间以空格分隔。题目保证所有数字小于 10^4
 * 输出格式：
 *      首先第一行输出给定数字中不同的朋友证号的个数；随后一行按递增顺序输出这些朋友证号，数字间隔一个空格，且行末不得有多余空格。
 * 输入样例：
 *      8
 *      123 899 51 998 27 33 36 12
 * 输出样例：
 *      4
 *      3 6 9 26
 */

public class Main {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] number = sc.nextLine().split(" ");
        int[] friendNum = new int[number.length];
        for (int i=0;i<number.length;i++){
            String[] Num = number[i].split("");  // 分隔每一个接受到的数值
            for (int j=0;j<Num.length;j++){  //
                friendNum[i] += Integer.parseInt(Num[j]);  // 得到朋友数
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<friendNum.length;i++){
            hashSet.add(friendNum[i]);
        }
        System.out.println(hashSet.size());
        String finalNum = "";
        for (Object i:hashSet.toArray()){
            finalNum += i+" ";
        }
        System.out.println(finalNum.trim());
    }
}
