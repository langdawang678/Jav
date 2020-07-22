package file;
import java.io.File;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("./filetest");

        boolean mkdir = f.mkdirs();//创建由此 抽象路径名命名的目录,成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在.
        System.out.println("创建是否成功："+mkdir);//mkdir是单级目录，父必须在。mkdirs直接多级目录。

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println("名称字符串:"+f.getName());//文件或目录的名称字符串
        System.out.println("路径名字符串："+f.toString());//路径名字符串
        System.out.println("父路径名称字符串："+f.getParent());//父路径名的路径名字符串，如果此路径名没有指定父目录，则返回 null。
        String [] filelist = f.list();//该级目录的文件和文件夹名组成的字符串数组
        System.out.println(f.length());
        System.out.println(Arrays.toString(filelist));
        f.delete();
    }
}
