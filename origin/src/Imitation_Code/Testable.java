package Imitation_Code;
import  java.lang.annotation.*;
//ʹ��@Retentionָ��ע�ͱ���������ʱ
@Retention(RetentionPolicy.RUNTIME)
//ʹ��@Targetָ�������ε�ע����������η���
@Target(ElementType.METHOD)
public @interface Testable {

}
