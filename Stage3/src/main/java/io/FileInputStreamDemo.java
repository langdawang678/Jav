package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("/Users/chenxuanhuai/Desktop/error.txt");
    	FileInputStream fis = new FileInputStream("D:/error.txt");
        //逐字读取，返回对应的ASSIC码值
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());


        //循环读取方法1.
        //注意读取后用变量赋值去判断和输出，否则不用变量时判断和输出都要read，会间隔输出。
//        do {
//            int read =fis.read();
//            if (read==-1){break;}
//            System.out.println(read );
//            }
//            while (true);

        //批量读取方法2，
        byte[] buffer = new byte[4096];//临时缓存，用于批量读取存放数据。4096是一个不会太小，又一般够用的值。
        int len =fis.read(buffer);//把读到的数据放到缓存中，并返回读取的字节大小，如1a哈 ，大小为1+1+2+2=6
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println("第"+i+"个元素字节值为："+buffer[i]);//打印数组缓存
        }
        String str = new String(buffer,0,len);//将读取的字节数组直接转为字符串
        System.out.println(str);
        
        //如果文件超过buffer大小，则要循环读取
        do {
            if (len<=0){//没有数据了
                break;
            }
        }while (true);
        fis.close();
    }
}