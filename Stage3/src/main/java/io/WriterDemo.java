package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("./WriterDemo.txt");
		fileWriter.write("this"); //String
		fileWriter.write(97);	//int
		//������д�������͵����� ������ͨ����ȥ���ò鿴��������API
		fileWriter.flush();
		fileWriter.close(); 	//Ҫclose����Ȼ���ڴ򿪻���û�ı䡣
	}
}
