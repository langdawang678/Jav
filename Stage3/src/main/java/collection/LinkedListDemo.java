package collection;

//LinkedList支持所有ArrayList的方法，并多了四个首尾方法（因为链表）
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<String>();
        ll.add("a");
        ll.add("a");
        ll.add("a");

        ll.addFirst("添加到first");
        ll.addLast("填加到last");
        System.out.println(ll);

//        Object first =ll.removeFirst();
//        Object last =ll.removeLast();
        ll.removeFirst();//相同效果
        ll.removeLast();
        System.out.println(ll);
    }

}