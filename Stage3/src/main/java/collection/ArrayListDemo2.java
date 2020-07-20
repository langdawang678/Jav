package collection;
//ArrayList的基础使用2-加入泛型
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();	//创建ArrayList对象al
        al.add(new Integer(1) );							//al中add对象，对象是"基本类型的包装类，装箱"
        al.add(new Integer(2) );
        al.add(new Integer(3) );
        al.add(new Integer(4) );
        System.out.println(al);
        al.remove(new Integer(4) );
        System.out.println("size()方法获取动态长度:"+al.size());	//size()方法获取动态长度
        Collections.sort(al);
        //方式1 参考https://www.runoob.com/java/arrays_merge.html
        Object[] c = al.toArray();
        System.out.println("打印数组："+Arrays.toString(c));

        Object ia[]=al.toArray();   //得到对象数组

        int sum=0;
        for (int i = 0; i < ia.length; i++) {				//对象数组的长度属性
            //方式2.1:
            Integer x =(Integer)ia[i];
            sum +=x;
            //方式2.2，书本P494：
//		    sum +=  ((Integer)ia[i]).intValue();			//将元素转为Integer类型并取值
        }
        System.out.println("取值并求和："+sum);
    }
}