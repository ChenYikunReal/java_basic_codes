package Imitation_Code;

public class SalException extends Exception{
	public SalException() {}
	public SalException(String msg) {
		super(msg);
	}
	//����һ�����Խ���Throwable�����Ĺ�����
	public SalException(Throwable t) {
		super(t);
	}

}

//����һ��ҵ���쳣�����������װԭʼ�쳣���Ӷ�ʵ�ֶ��쳣����ʽ����