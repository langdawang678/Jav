package file;
import java.io.File;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("./filetest");

        boolean mkdir = f.mkdirs();//�����ɴ� ����·����������Ŀ¼,�ɹ��򷵻�true��ʧ���򷵻�false��ʧ�ܱ���File����ָ����·���Ѿ�����.
        System.out.println("�����Ƿ�ɹ���"+mkdir);//mkdir�ǵ���Ŀ¼���������ڡ�mkdirsֱ�Ӷ༶Ŀ¼��

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println("�����ַ���:"+f.getName());//�ļ���Ŀ¼�������ַ���
        System.out.println("·�����ַ�����"+f.toString());//·�����ַ���
        System.out.println("��·�������ַ�����"+f.getParent());//��·������·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null��
        String [] filelist = f.list();//�ü�Ŀ¼���ļ����ļ�������ɵ��ַ�������
        System.out.println(f.length());
        System.out.println(Arrays.toString(filelist));
        f.delete();
    }
}
