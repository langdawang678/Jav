package collection;

//HashSet TreeSet LinkedHashSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add("�ַ���1");
        hashSet.add(new String("�ַ���1"));
        hashSet.add("�ַ���2");
        hashSet.add("����");
        System.out.println(hashSet);
        //�������˳��ģ�[�ַ���2, �ַ���1, ����]

        hashSet.remove("�ַ���1");//ͬListһ��ʹ��equals��Ϊ��ͬ������

        //��List����
        Iterator iterator = hashSet.iterator();

        //�Զ�����TreeSet���������֡���ĸ
        TreeSet treeSet =new TreeSet();
        treeSet.add("3lisi");
        treeSet.add("1zhangsan");
        treeSet.add("2lisi");
        System.out.println(treeSet);

        //�����ŵ�set���� LinkedHashSet����Ϊ"link"�ˣ�
        LinkedHashSet linkedHashSet =new LinkedHashSet();
        linkedHashSet.add("3lisi");
        linkedHashSet.add("1zhangsan");
        linkedHashSet.add("2lisi");
        System.out.println(linkedHashSet);

    }
}
