package Imitation_Code;

public class OutputFieldTest{
	public static void main(String[] args){
		//������һ�����е�Output�ӿڵ�MAX_CACHE_LINE
		System.out.println(Output.MAX_CACHE_LINE);
		//������佫������final������ֵ���ı����쳣
		//Output.MAX_CACHE_LINE = 20;
		//ʹ�ýӿ������÷���
		System.out.println(Output.staticTest());
	}
}