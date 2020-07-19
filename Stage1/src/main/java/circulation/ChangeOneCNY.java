package circulation;

/*
实现用一元人民币换成一分，两分，五分硬币共50枚，列举所有可能
*/
public class ChangeOneCNY {
    public static void main(String[] args) {
        int a;  //a=1分；b=2分；c=5分，
        int b;
        int c;
        int sum;
        sum=0;
        for(a=0;a<=100;a++) {
            for(b=0;b<=50;b++) {
                for(c=0;c<=20;c++) {
                    if (a+2*b+5*c==100) {
                        System.out.println(a+","+b+","+c);
                        sum++;
                    }
                }
            }
        }
        System.out.println("穷举共有："+sum+"种");
    }
}