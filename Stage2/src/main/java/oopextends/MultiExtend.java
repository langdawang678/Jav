package oopextends;
//OOP-���̳�
class Parent1{
    Parent1(String s){
        System.out.println(s);
    }
}

class Parent2 extends Parent1{
    Parent2(){
        super("s"); //û�����еĻ�������ʾ�������û���ҵ�������Parent1()
        System.out.println("Parent2");
    }
}
public class MultiExtend  extends Parent2{
    public static void main(String[] args) {
        MultiExtend multiExtend = new MultiExtend();
    }
}
