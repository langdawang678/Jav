package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("/Users/chenxuanhuai/Desktop/error.txt");
    	FileInputStream fis = new FileInputStream("D:/error.txt");
        //���ֶ�ȡ�����ض�Ӧ��ASSIC��ֵ
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());


        //ѭ����ȡ����1.
        //ע���ȡ���ñ�����ֵȥ�жϺ�����������ñ���ʱ�жϺ������Ҫread�����������
//        do {
//            int read =fis.read();
//            if (read==-1){break;}
//            System.out.println(read );
//            }
//            while (true);

        //������ȡ����2��
        byte[] buffer = new byte[4096];//��ʱ���棬����������ȡ������ݡ�4096��һ������̫С����һ�㹻�õ�ֵ��
        int len =fis.read(buffer);//�Ѷ��������ݷŵ������У������ض�ȡ���ֽڴ�С����1a�� ����СΪ1+1+2+2=6
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println("��"+i+"��Ԫ���ֽ�ֵΪ��"+buffer[i]);//��ӡ���黺��
        }
        String str = new String(buffer,0,len);//����ȡ���ֽ�����ֱ��תΪ�ַ���
        System.out.println(str);
        
        //����ļ�����buffer��С����Ҫѭ����ȡ
        do {
            if (len<=0){//û��������
                break;
            }
        }while (true);
        fis.close();
    }
}