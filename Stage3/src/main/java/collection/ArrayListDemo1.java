package collection;
/*
ArrayList的基础使用：
a.add("value")
a.get(index)
a.set(index,value)
a.remove(index)
a.size() 大小
排序：Collections.sort(arrayList)
遍历方法1：迭代index打印：
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(sites.get(i));
遍历方法2：a.toArray()转为数组并打印：
        Object[] c =arrayList.toArray(); //变为Object 数组，可用Arrays.toString(c)打印
遍历方法3：
        for (String i : arrayList) {
            System.out.println(i);
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();//使用第一步，实例化
        arrayList.add("bbb");
        arrayList.add(new String("bbb"));

        arrayList.add(new Object());

        arrayList.add(11);//所有放到集合里的元素都是对象，如果是基本数据类型则自动转化(装箱)
        arrayList.add(Integer.valueOf(2));

        arrayList.add(0,0); //元素放到指定位置(插入排序)
        arrayList.add(null);
        //可直接打印
        System.out.println(arrayList);

        //也可转为Object数组后打印数组实现
        Object[] c =arrayList.toArray();
        System.out.println(Arrays.toString(c)); //打印数组，数组是Object类型

        //查询元素的索引
        System.out.println(arrayList.indexOf(2));//查找元素2的索引
        //查询大小和是否为空
        System.out.println(arrayList.size()+" "+arrayList.isEmpty()+" "+(arrayList!=null));
        //查询是否包含某个元素
        System.out.println(arrayList.contains(2));

        //remove:
        arrayList.remove(0);//索引移除
        arrayList.remove(Integer.valueOf(11));//移除的是Integer这个元素1

        arrayList.remove(new String("bbb"));//移除对象的原理：用equals去判断，移除第一个
        arrayList.remove("bbb");
        arrayList.remove(new Object());//既不报错也不移除前面的元素
        System.out.println("remove后："+arrayList);

        //clear:
        arrayList.clear();
        System.out.println("claer后："+arrayList);
    }
}
