package circulation;

/*
ABCD分别为不同的几个数字，请编写程序找到符合下面算式的ABCD的值。 A B C A B  *  A = DDDDDD
*/

public class DDDDDD {
    public static void main(String[] args) {
        int a,b,c,d;
        for (a=0;a<10;a++) {
            for(b=0;b<10;b++) {
                for(c=0;c<10;c++) {
                    for(d=0;d<10;d++) {
                        boolean condition1= (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d);
                        boolean condition2=((10000*a+1000*b+100*c+10*a+b)*a)==d+10*d+100*d+1000*d+10000*d+100000*d;
                        if (condition1 && condition2) {
                            System.out.println(a+""+b+""+c+""+a+b);
                        }
                    }
                }
            }
        }
        System.out.println("over");
    }
}