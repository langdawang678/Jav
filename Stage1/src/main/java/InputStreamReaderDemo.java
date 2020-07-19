import java.io.BufferedReader;
import java.io.InputStreamReader;

//book P74
public class InputStreamReaderDemo {
    public static void main (String [] args) {
        String str;
        //创建标准输入流对象stdin来接收键盘System.in的输入
        InputStreamReader stdin = new InputStreamReader(System.in);
        //用缓冲流模式来接收stdin
        BufferedReader bufferedReader = new  BufferedReader(stdin);

        try {
            System.out.println("input something:");
            str=bufferedReader.readLine();
            System.out.println("your input is :"+ str);

        }catch(Exception e){
            System.err.println("occur input error");
            e.printStackTrace();
        }
    }
}
