package oop;

public class StaticDemo {
    int a =1;
    static int static_b =2; 	//��̬����

    //��ʾ����ͨ�������Է��� ��̬�ͷǾ�̬�ı����ͷ�����
    public int fun1() {
        int c =3;				//�ֲ�����c
        System.out.println("��������ͨ���� a+b="+(a+static_b));
        static_fun2();			//��ͨ�������ʾ�̬����
        return a+static_b;  	//��ͨ�������Է���/���þ�̬b�ͷǾ�̬�ı���a
    }

    //��ʾ"��̬�������ܷ��ʷǾ�̬����"
    public static int static_fun2() {	//��̬����
        System.out.println("�����˾�̬����="+static_b);

        return static_b; 		//��̬�������Է��ʾ�̬����b
        //add();				//�﷨���󣬾�̬�������ܷ���ʵ������
        //return a-b;			//�﷨���󣬾�̬�������ܷ���/���÷Ǿ�̬����a��
        /*Cannot make a static reference to the non-static field a
         *change 'a'to static
         */
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();

        System.out.println("----����ֱ�ӷ��ʵ�ֻ�о�̬��Ա----");
        //	System.out.println(staticDemo.a);	//����,�಻��ֱ�ӷ������ԣ���Ҫ��Ķ���ȥ����
        //  staticDemo.add();					//�����಻��ֱ�ӷ��ʷ���,��Ҫ��Ķ���ȥ����
        System.out.println("��ֱ�ӷ��ʾ�̬���� ="+ StaticDemo.static_b);
        StaticDemo.static_fun2();			//��ֱ�ӷ��ʾ�̬����

        System.out.println("\n"+"----�ö���ȥ���ʾ�̬/�Ǿ�̬�����Ժͷ���----");
        System.out.println("����ֱ�ӷ��ʲ��޸� �Ǿ�̬����  ="+(staticDemo.a=10));
        System.out.println("����ֱ�ӷ��ʲ��޸� ��̬���� ="+(staticDemo.static_b=20));//�л�ɫ��ʾ�����½�ͼ
        staticDemo.fun1();					//����ֱ�ӷ��ʷǾ�̬����
        staticDemo.static_fun2();				//����ֱ�ӷ��ʾ�̬���� 	 //�л�ɫ��ʾ�����½�ͼ
    }
}