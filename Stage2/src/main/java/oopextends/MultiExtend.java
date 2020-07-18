package oopextends;
//OOP-多层继承
class Parent1{
    Parent1(String s){
        System.out.println(s);
    }
}

class Parent2 extends Parent1{
    Parent2(){
        super("s"); //没有这行的话，会提示编译错误，没有找到构造器Parent1()
        System.out.println("Parent2");
    }
}
public class MultiExtend  extends Parent2{
    public static void main(String[] args) {
        MultiExtend multiExtend = new MultiExtend();
    }
}
