package arrays.algorithm;

public class ElementFind {
    public static void main(String[] args) {
        int[] a ={2,1,99,1,1,1,3,99};
        int index=-1;//ͨ��-1����û�ҵ�
        //���������Ƿ��Ŀ����ȣ�ͨ���±긳ֵ����ĵó��Ƿ��ҵ�
        for (int i = 0; i < a.length; i++) {
            int target = 99;
            if (a[i]==target) {
                index = i;  //!ͨ�����±긳ֵ�������ҵ��ˣ������û�ҵ�/��ֵ������û�ҵ�
                System.out.println("�ҵ��ˣ������ǣ�" + index);
            }
        }
        if (index == -1){
            System.out.println("û���ҵ�");
        }
    }
}