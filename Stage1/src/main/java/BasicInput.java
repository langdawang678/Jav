

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入一个");
        String str1 = scn.next();
        int num1 = scn.nextInt();

        scn.close();

    }
}
