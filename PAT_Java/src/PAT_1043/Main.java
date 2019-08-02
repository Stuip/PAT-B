package PAT_1043;

/**
 * 给定一个长度不超过10^4的、仅由英文字母构成的字符串。
 * 请将字符重新调整顺序，按 PATestPATest.... 这样的顺序输出，并忽略其它字符。
 * 当然，六种字符的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按 PATest 的顺序打印，直到所有字符都被输出。
 */

/**
 * 解题思路：
 *    1. 首先将接到输入的字符串（长度不能大于10^4）
 *    2. 将字符串中字符“P”,“A”,"T","e","s","t"的每一个字母个数
 */


import java.util.Scanner;

class Main{

    final static double NUMBER=Math.pow(10,4);

    public static void main(String[] args) {
        int total=0;
        // 存放个数数组
        int[] count = new int[6];
        // 接受输入
        Scanner sc = new Scanner(System.in);
        // 赋值到str
        String str = sc.nextLine();
        // 将字符串转化为字符数组
        char[] chars = str.toCharArray();
        // 判断每一个数值
        for(int i=0;i<chars.length;i++){
            switch(chars[i]){
                case 'P':
                    count[0]+=1;
                    break;
                case 'A':
                    count[1]+=1;
                    break;
                case 'T':
                    count[2]+=1;
                    break;
                case 'e':
                    count[3]+=1;
                    break;
                case 's':
                    count[4]+=1;
                    break;
                case 't':
                    count[5]+=1;
                    break;
            }
        }
        while(count[0]>0||count[1]>0||count[2]>0||count[3]>0||count[4]>0||count[5]>0){
            if(count[0]!=0){
                System.out.print("P");
                count[0]-=1;
            }
            if(count[1]!=0){
                System.out.print("A");
                count[1]-=1;
            }
            if(count[2]!=0){
                System.out.print("T");
                count[2]-=1;
            }
            if(count[3]!=0){
                System.out.print("e");
                count[3]-=1;
            }
            if(count[4]!=0){
                System.out.print("s");
                count[4]-=1;
            }
            if(count[5]!=0){
                System.out.print("t");
                count[5]-=1;
            }
        }
        sc.close();
    }
}