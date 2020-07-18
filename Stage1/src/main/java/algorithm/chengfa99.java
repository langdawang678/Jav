package algorithm;

public class chengfa99 {
    public static void main(String[] args)
    {
        for (int i=1;i<10;i++){
            for (int j=1;j<i+1;j++){  //或者j<=i，也是一样的
                System.out.print(j+"*"+i+"="+j*i+"\t");//这里不是println
            }
            System.out.println();
        }
    }
}
