package collection;

//HashSet TreeSet LinkedHashSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add("字符串1");
        hashSet.add(new String("字符串1"));
        hashSet.add("字符串2");
        hashSet.add("狗狗");
        System.out.println(hashSet);
        //输出是无顺序的，[字符串2, 字符串1, 狗狗]

        hashSet.remove("字符串1");//同List一样使用equals作为相同的依据

        //和List类似
        Iterator iterator = hashSet.iterator();

        //自动排序TreeSet，按照数字、字母
        TreeSet treeSet =new TreeSet();
        treeSet.add("3lisi");
        treeSet.add("1zhangsan");
        treeSet.add("2lisi");
        System.out.println(treeSet);

        //按序存放的set集合 LinkedHashSet（因为"link"了）
        LinkedHashSet linkedHashSet =new LinkedHashSet();
        linkedHashSet.add("3lisi");
        linkedHashSet.add("1zhangsan");
        linkedHashSet.add("2lisi");
        System.out.println(linkedHashSet);

    }
}
