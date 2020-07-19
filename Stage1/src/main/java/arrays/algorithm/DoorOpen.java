package arrays.algorithm;
import java.util.Arrays;
/*
监狱开锁问题的暴力破解
某王国有100间牢房，正好100个狱吏，国王大赦天下，释放部分囚犯，操作规则为：
狱吏按顺序排队站好，每个狱吏依次操作一次自己的序号整数倍的牢房锁，如果原来的锁为打开，则关闭，否则打开锁。
例如第一个狱吏会打开所有的牢房门的锁，而第二个狱吏则关闭2、4...、100号牢房的锁。 使用程序计算最后哪些房间的人会被释放。
*/

/*
1. police[]=狱警的编号
2. door[]=初始化0，0代表门默认时关，1等于开
3. 每次a[i]的范围   for (i=0, i<=100/a[i], i++ )
4. 找出a[i]的整数，并反转对应 b[i]的值
5. 找出 b[i]=1的索引
 */
public class DoorOpen {
    public static void main(String[] args) {

        //初始化狱警编号，police：1-100
        int[] police= new int[100];
        for (int num = 0; num <100; num++) {
            police[num] = num+1;
        }
        System.out.println("狱警编号："+Arrays.toString(police));

        //初始化门，door：都是0
        int[] door= new int[100];
        System.out.println("门的初始状态："+Arrays.toString(door)+"\n"+"门计数："+door.length);

        //外层遍历police[i]，内层遍历具体police的整数/门
        for (int i=0 ; i<100 ; i++){
            for (int x=0; x<100/police[i];x++){

                //找出倍数times
                int times = police[i]*(1+x)-1;

                //反转door[x]的值
                if(door[times]==0){
                    door[times]=1;
                }
                else{
                    door[times]=0;
                }
            }
        }
        System.out.println("100次后的door："+Arrays.toString(door));
        for (int y = 0; y < 100; y++) {
            if (door[y]==1){
                System.out.println("打开的门是第："+(y+1));
            }

        }
    }

}