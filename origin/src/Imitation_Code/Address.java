package Imitation_Code;

public class Address{
	private final String detail;
	private final String postCode;
	//在构造器里初始化两个实例变量
	public Address(){
		this.detail = " ";
		this.postCode = " ";
	}
	public Address(String detail, String postCode){
		this.detail = detail;
		this.postCode = postCode;
	}
	//仅为两个实例变量提供getter方法
	public String getDetail(){
		return this.detail;
	}
	public String getPostCode(){
		return this.postCode;
	}
	//重写equals方法，判断两个对象是否相等
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if(obj != null && obj.getClass() == Address.class){
			Address ad = (Address)obj;
			//当detail和postCode相等时，可以认为两个Address对象相等
			if (this.getDetail().equals(ad.getPostCode()) && this.getPostCode().equals(ad.getPostCode())){
				return true;
			}
		}
		return false;
	}
	public int hashCode(){
		return detail.hashCode() +postCode.hashCode() * 31;
	}
}