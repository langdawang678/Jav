package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("/Users/chenxuanhuai/Desktop/error.txt");
        FileReader fr = new FileReader("./error.txt");
        
        //����
//        int ch = fr.read();//��ȡһ���ַ�
//        System.out.println(ch);
//        System.out.println((char)ch); //intתΪ�ַ�

        //ѭ������ʽ1
//        do {
//            int x = fr.read();
//            if (x <=0){ break; }
//            System.out.println(x);
//        }while (true);

        
        char []  buffer =new char[4096];
        int len = fr.read(buffer);
        System.out.println(len);    //1a�� 2,�ַ���Ϊ4

        //������ȡ2
        String res =new String(buffer,0,len);
        System.out.print(res);

        //����ļ��ϴ�
        StringBuilder stringBuilder =new StringBuilder();
        do {
            if (len<=0) {break;}
            stringBuilder.append(buffer,0,len);
        }while (true);
        System.out.println(stringBuilder.toString());
        fr.close();
    }
}