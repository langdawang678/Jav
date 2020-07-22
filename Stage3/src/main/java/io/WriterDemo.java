package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("./WriterDemo.txt");
		fileWriter.write("this"); //String
		fileWriter.write(97);	//int
		//还可以写其他类型的数组 ，可以通过点去调用查看，或者找API
		fileWriter.flush();
		fileWriter.close(); 	//要close，不然窗口打开还是没改变。
	}
}
