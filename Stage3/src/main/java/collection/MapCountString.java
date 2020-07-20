package collection;
import java.util.LinkedHashMap;
/*
֪ʶ�㣺
map.containsKey(word) ��
map.keySet()
�ж��Ƿ���ں͸�ֵ��˳��
 */

/*
ʹ��Mapʵ�ֵ���ͳ�ƹ��ܣ�ͳ�Ƶ��ַ���Ϊ��
String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation. ";

ͳ�Ʋο����Ϊ��
The:1
String:3
.....
 */

public class MapCountString {
    public static void main(String[] args) {
        String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation. ";
        String reg =" |\\, |\\. |\\! ";

        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        for(String word: content.split(reg)){
//            System.out.println(word);

            if (map.containsKey(word)==true) {
                map.put(word, map.get(word)+1);//��һ��Ϊ0������ֱ��ִ��else
            }
            else
                map.put(word, 1); //��������word������֮ǰû�Ź����½�����1
        }
        System.out.println(map);
        for (String x: map.keySet()) {
            System.out.print(x+":"+map.get(x)+"\t");
        }
    }
}