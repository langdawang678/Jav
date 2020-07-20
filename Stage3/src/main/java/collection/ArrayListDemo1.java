package collection;
/*
ArrayList�Ļ���ʹ�ã�
a.add("value")
a.get(index)
a.set(index,value)
a.remove(index)
a.size() ��С
����Collections.sort(arrayList)
��������1������index��ӡ��
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(sites.get(i));
��������2��a.toArray()תΪ���鲢��ӡ��
        Object[] c =arrayList.toArray(); //��ΪObject ���飬����Arrays.toString(c)��ӡ
��������3��
        for (String i : arrayList) {
            System.out.println(i);
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();//ʹ�õ�һ����ʵ����
        arrayList.add("bbb");
        arrayList.add(new String("bbb"));

        arrayList.add(new Object());

        arrayList.add(11);//���зŵ��������Ԫ�ض��Ƕ�������ǻ��������������Զ�ת��(װ��)
        arrayList.add(Integer.valueOf(2));

        arrayList.add(0,0); //Ԫ�طŵ�ָ��λ��(��������)
        arrayList.add(null);
        //��ֱ�Ӵ�ӡ
        System.out.println(arrayList);

        //Ҳ��תΪObject������ӡ����ʵ��
        Object[] c =arrayList.toArray();
        System.out.println(Arrays.toString(c)); //��ӡ���飬������Object����

        //��ѯԪ�ص�����
        System.out.println(arrayList.indexOf(2));//����Ԫ��2������
        //��ѯ��С���Ƿ�Ϊ��
        System.out.println(arrayList.size()+" "+arrayList.isEmpty()+" "+(arrayList!=null));
        //��ѯ�Ƿ����ĳ��Ԫ��
        System.out.println(arrayList.contains(2));

        //remove:
        arrayList.remove(0);//�����Ƴ�
        arrayList.remove(Integer.valueOf(11));//�Ƴ�����Integer���Ԫ��1

        arrayList.remove(new String("bbb"));//�Ƴ������ԭ����equalsȥ�жϣ��Ƴ���һ��
        arrayList.remove("bbb");
        arrayList.remove(new Object());//�Ȳ�����Ҳ���Ƴ�ǰ���Ԫ��
        System.out.println("remove��"+arrayList);

        //clear:
        arrayList.clear();
        System.out.println("claer��"+arrayList);
    }
}
