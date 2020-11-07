package Imitation_Code;

import java.util.*;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableList;

public class StringJoinerTest {
    public static void main(String[] args) {
        //�����ķ���
        List<String> ids = ImmutableList.of("1", "2", "3");
        StringBuilder sb = new StringBuilder();
        for (String id : ids) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(id);
        }
        System.out.println(sb);
        
        //���ķ���
        System.out.println(String.join(",", ids));
        
        /*
              Դ�룺    
        public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
            Objects.requireNonNull(delimiter);
            Objects.requireNonNull(elements);
            StringJoiner joiner = new StringJoiner(delimiter);
            for (CharSequence cs: elements) {
                joiner.add(cs);
            }
            return joiner.toString();
        }
         */
        
        //ʾ������
        StringJoiner sj = new StringJoiner(",","{","}");
        sj.add("first").add("second").add("third");
        System.out.println(sj.toString());
        
        //���JDK8��stream������ƴ���б�Ԫ�أ�
        List<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().map(Object::toString).collect(Collectors.joining(",")));       
    }
}
