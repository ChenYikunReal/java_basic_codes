package Imitation_Code;

public class AuctionException extends Exception{
	//��ʽ����serialVersionUID���Է�ֹ�����л��汾�쳣InvalidCastException
	//����Ĭ�ϵ���������ʾ����serialVersionUID���Ա������һ��
	private static final long serialVersionUID = 1L;
	
	//�޲����Ĺ�����
	public AuctionException() {}
	//��һ���ַ��������Ĺ�����
	public AuctionException(String msg) {
		super(msg);
	}

}
