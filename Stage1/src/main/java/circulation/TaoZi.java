package circulation;

public class TaoZi {
/*
 * 	x个桃子，吃10天，每天吃掉一半+1，第十天剩余1个
 * 原来有多少个桃子&输出每天的桃子数量
	1534个
 */

    public static void main(String[] args) {
        int sum =1;
        for(int day =9;day >0;day--) {
            sum = (sum+1)*2;
            System.out.println("第"+day+"天剩余桃子数："+sum);
        }
    }
}