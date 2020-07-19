package arrays.algorithm;
import java.util.Arrays;
/*
������������ı����ƽ�
ĳ������100���η�������100�������������������£��ͷŲ�����������������Ϊ��
������˳���Ŷ�վ�ã�ÿ���������β���һ���Լ���������������η��������ԭ������Ϊ�򿪣���رգ����������
�����һ������������е��η��ŵ��������ڶ���������ر�2��4...��100���η������� ʹ�ó�����������Щ������˻ᱻ�ͷš�
*/

/*
1. police[]=�����ı��
2. door[]=��ʼ��0��0������Ĭ��ʱ�أ�1���ڿ�
3. ÿ��a[i]�ķ�Χ   for (i=0, i<=100/a[i], i++ )
4. �ҳ�a[i]������������ת��Ӧ b[i]��ֵ
5. �ҳ� b[i]=1������
 */
public class DoorOpen {
    public static void main(String[] args) {

        //��ʼ��������ţ�police��1-100
        int[] police= new int[100];
        for (int num = 0; num <100; num++) {
            police[num] = num+1;
        }
        System.out.println("������ţ�"+Arrays.toString(police));

        //��ʼ���ţ�door������0
        int[] door= new int[100];
        System.out.println("�ŵĳ�ʼ״̬��"+Arrays.toString(door)+"\n"+"�ż�����"+door.length);

        //������police[i]���ڲ��������police������/��
        for (int i=0 ; i<100 ; i++){
            for (int x=0; x<100/police[i];x++){

                //�ҳ�����times
                int times = police[i]*(1+x)-1;

                //��תdoor[x]��ֵ
                if(door[times]==0){
                    door[times]=1;
                }
                else{
                    door[times]=0;
                }
            }
        }
        System.out.println("100�κ��door��"+Arrays.toString(door));
        for (int y = 0; y < 100; y++) {
            if (door[y]==1){
                System.out.println("�򿪵����ǵڣ�"+(y+1));
            }

        }
    }

}