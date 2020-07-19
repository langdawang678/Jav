/*
next():读取输入直到遇见空格。   读取输入后将光标放在同一行。

nextInt():只读取int值。    读取输入后将光标放在同一行。
空格间隔后回车，也可每次回车

nextLine():读取输入直到遇见换行回车。   读取输入后将光标定位到下一行。
 */

/*
  1.Scanner扫描器，接受System.in的输入
  2. int num = scn.nextInt();
     double num2 = scn.nextDouble();
  3. 用完后scn.close()；
 */

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        System.out.print("scanner some:");
        Scanner scanner = new Scanner(System.in);

        String str1 =scanner.next();
        System.out.println(str1);

//        String str2 =scanner.nextLine();
//        System.out.println(str2);

//        int num1 =scanner.nextInt();
//        System.out.println(num1);
        scanner.close();
    }
}
