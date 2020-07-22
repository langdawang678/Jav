package io;



//�ļ���д��
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream("/Users/chenxuanhuai/Desktop/out.txt")) {
            //д�뷽ʽ1
            fos.write(97);
            fos.write(98);
            //д�뷽ʽ2
            byte[] contentByte="���".getBytes();//�ַ���תΪbyte����
            fos.write(contentByte);
            fos.flush(); //ȷ�����ݲ��ڻ��棬����д���˴���
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
