package io;



//文件的写入
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream("/Users/chenxuanhuai/Desktop/out.txt")) {
            //写入方式1
            fos.write(97);
            fos.write(98);
            //写入方式2
            byte[] contentByte="你好".getBytes();//字符串转为byte数组
            fos.write(contentByte);
            fos.flush(); //确保数据不在缓存，而是写入了磁盘
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
