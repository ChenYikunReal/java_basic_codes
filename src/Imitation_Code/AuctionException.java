package Imitation_Code;

public class AuctionException extends Exception{
	//显式声明serialVersionUID可以防止反序列化版本异常InvalidCastException
	//这是默认的声明，显示声明serialVersionUID可以避免对象不一致
	private static final long serialVersionUID = 1L;
	
	//无参数的构造器
	public AuctionException() {}
	//带一个字符串参数的构造器
	public AuctionException(String msg) {
		super(msg);
	}

}
