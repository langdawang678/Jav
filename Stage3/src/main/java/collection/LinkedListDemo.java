package collection;

//LinkedList֧������ArrayList�ķ������������ĸ���β��������Ϊ����
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("a");
        ll.add("a");
        ll.add("a");

        ll.addFirst("��ӵ�first");
        ll.addLast("��ӵ�last");
        System.out.println(ll);

//        Object first =ll.removeFirst();
//        Object last =ll.removeLast();
        ll.removeFirst();//��ͬЧ��
        ll.removeLast();
        System.out.println(ll);
    }

}