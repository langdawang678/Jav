package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("/Users/chenxuanhuai/Desktop/error.txt");
        FileReader fr = new FileReader("./error.txt");
        
        //单个
//        int ch = fr.read();//读取一个字符
//        System.out.println(ch);
//        System.out.println((char)ch); //int转为字符

        //循环读方式1
//        do {
//            int x = fr.read();
//            if (x <=0){ break; }
//            System.out.println(x);
//        }while (true);

        
        char []  buffer =new char[4096];
        int len = fr.read(buffer);
        System.out.println(len);    //1a哈 2,字符数为4

        //批量读取2
        String res =new String(buffer,0,len);
        System.out.print(res);

        //如果文件较大：
        StringBuilder stringBuilder =new StringBuilder();
        do {
            if (len<=0) {break;}
            stringBuilder.append(buffer,0,len);
        }while (true);
        System.out.println(stringBuilder.toString());
        fr.close();
    }
}