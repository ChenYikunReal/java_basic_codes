package Imitation_Code;

public class ReturnThis{
	public int age;
	public ReturnThis grow(){
		age++;
		//return this返回调用该方法的对象
		return this;
	}
	public static void main(String[] args){
		ReturnThis rt = new ReturnThis();
		//可以连续调用同一方法
		rt.grow()
			.grow()
				.grow();
		System.out.println("rt的age成员变量的值是：" + rt.age);
	}
}

//用this作为方法的返回值可以让代码更简洁，但可能造成实际意义的模糊