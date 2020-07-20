package collection;
import java.util.LinkedHashMap;
/*
知识点：
map.containsKey(word) ，
map.keySet()
判断是否存在和赋值的顺序
 */

/*
使用Map实现单词统计功能，统计的字符串为：
String content = "The String class is immutable, so that once it is created a String object cannot be changed. The String class has a number of methods, some of which will be discussed below, that appear to modify strings. Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation. ";

统计参考结果为：
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
                map.put(word, map.get(word)+1);//第一次为0，所以直接执行else
            }
            else
                map.put(word, 1); //若不存在word，代表之前没放过，新建等于1
        }
        System.out.println(map);
        for (String x: map.keySet()) {
            System.out.print(x+":"+map.get(x)+"\t");
        }
    }
}