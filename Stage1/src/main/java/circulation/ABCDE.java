package circulation;
 /*
ABCDE去旅游
1、去了A就必须去B，  00 11
2、C和D最多去一个， 00 01 10
3、E和C要不去要不都不去  00 11
请输入景点选择，判断是否满足以上条件。
 */
import java.util.Scanner;

public class ABCDE {
    public static void main(String[] args) {
        System.out.print("请输入5个景点的选择，比如11001，"
                + "依次代表五个景点的 去，去，不去，不去，去:");
        Scanner input = new Scanner(System.in);
        int abcde =input.nextInt();
        int a = abcde/10000; //int类型：除法为取整，分子不能为0 ；%为取余
        int b = (abcde-(a*10000))/1000;
        int c = (abcde-(a*10000+b*1000))/100;
        int d = (abcde-(a*10000+b*1000+c*100))/10;
        int e = (abcde-(a*10000+b*1000+c*100+d*10))/10;
//	System.out.print(a,b,c,d,e)，int类型不能这么打印;
        boolean condition1 = ((a+b==0) || (a+b ==2));
        boolean condition2 = c+d==0 || c+d==1;
        boolean condition3 = e+c==0 || e+e==2;
        if(condition1 && condition2 && condition3) {
            System.out.println("您的选择方案可行！");
        }
        else {
            System.out.println("请仔细阅读规则并重选择，谢谢");
        }
    }
}