package collection;
//ArrayList�Ļ���ʹ��2-���뷺��
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();	//����ArrayList����al
        al.add(new Integer(1) );							//al��add���󣬶�����"�������͵İ�װ�࣬װ��"
        al.add(new Integer(2) );
        al.add(new Integer(3) );
        al.add(new Integer(4) );
        System.out.println(al);
        al.remove(new Integer(4) );
        System.out.println("size()������ȡ��̬����:"+al.size());	//size()������ȡ��̬����
        Collections.sort(al);
        //��ʽ1 �ο�https://www.runoob.com/java/arrays_merge.html
        Object[] c = al.toArray();
        System.out.println("��ӡ���飺"+Arrays.toString(c));

        Object ia[]=al.toArray();   //�õ���������

        int sum=0;
        for (int i = 0; i < ia.length; i++) {				//��������ĳ�������
            //��ʽ2.1:
            Integer x =(Integer)ia[i];
            sum +=x;
            //��ʽ2.2���鱾P494��
//		    sum +=  ((Integer)ia[i]).intValue();			//��Ԫ��תΪInteger���Ͳ�ȡֵ
        }
        System.out.println("ȡֵ����ͣ�"+sum);
    }
}