package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPClientDemo {
public static void main(String[] args) {
	String webAddr ="http://www.baidu.com";
	try {
		//����һ��url
		URL url = new URL(webAddr);
		//����
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//��ȡ����
		InputStream is = connection.getInputStream();
		//Ԥ�ڷ���һ��htmlҳ�棬�������������
		try(InputStreamReader isr =new InputStreamReader(is,"UTF-8");){//ָ�������ʽ
		StringBuilder sb = new StringBuilder();//�ݴ��ȡ��������
		char[] buffer = new char[4096];
		int len =0;//ÿ��ʵ�ʶ�ȡ�����ֽ�
		while ((len=isr.read(buffer))>0) {
			sb.append(buffer,0,len);//����ʵ��len���ȵ����ݣ�����������buffer�ĳ���
		}
		System.out.println(sb);
		
		//�������ҳ�html�е�img��ǩ
		}catch (Exception x) {
			x.printStackTrace();
		}
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
