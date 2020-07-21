package reflect;

import java.lang.annotation.*;

@Inherited //�����ע����Ա�����̳�
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/*Retention����һ��Annotation�ı��淶Χ
RetentionPolicy.SOURCE��ֻ��Դ�ļ�������ʱע�ⱻ������class�ļ���û�С�@Override���������
    ��target/classes�µĶ�Ӧclass�ļ��� ������ע��
RetentionPolicy.ClASS�������ļ��У����������ص�JVM�У�Ĭ����CLASS����
    ��target/classes�µĶ�Ӧclass�ļ�  �ܿ���ע��
RetentionPolicy.RUNTIME�������棬�ɷ����Զ�ȡ��ע��Ҫ��Ϸ�����ƣ��ͱ������������
    ʹ��ע��ĵط�������getDeclaredAnnotation()�ܿ���
    ����isAnnotationPresent(MyAnno.class)����True
 */
public @interface MyAnno {
//    String name(); //д�ϱ�����Person�ͱ�����
    String name1() default "11"; //����default��Person������
}
