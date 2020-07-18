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
		//创建一个url
		URL url = new URL(webAddr);
		//连接
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//读取数据
		InputStream is = connection.getInputStream();
		//预期返回一个html页面，并处理编码问题
		try(InputStreamReader isr =new InputStreamReader(is,"UTF-8");){//指定编码格式
		StringBuilder sb = new StringBuilder();//暂存读取到的内容
		char[] buffer = new char[4096];
		int len =0;//每次实际读取到的字节
		while ((len=isr.read(buffer))>0) {
			sb.append(buffer,0,len);//放入实际len长度的数据，而不是整个buffer的长度
		}
		System.out.println(sb);
		
		//用正则找出html中的img标签
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
