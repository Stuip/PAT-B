package PAT_1021;

import java.util.Scanner;

/***
 * @description
 * @author Tang
 * @Date 2019-08-01
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] K = sc.nextLine().split("");
        int[] num = new int[10];
        for(int i=0;i<K.length;i++){
            switch (K[i]){
                case "0":
                    num[0]++;
                    break;
                case  "1":
                    num[1]++;
                    break;
                case "2":
                    num[2]++;
                    break;
                case "3":
                    num[3]++;
                    break;
                case "4":
                    num[4]++;
                    break;
                case "5":
                    num[5]++;
                    break;
                case "6":
                    num[6]++;
                    break;
                case "7":
                    num[7]++;
                    break;
                case "8":
                    num[8]++;
                    break;
                case "9":
                    num[9]++;
                    break;
            }
        }
        for (int i=0;i<num.length;i++){
            if (num[i]!=0){
                System.out.printf("%s:%s\n",i,num[i]);
            }
        }
    }
}
