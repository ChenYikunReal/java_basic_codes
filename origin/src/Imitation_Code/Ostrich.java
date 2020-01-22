package Imitation_Code;

class Bird1{
	//Bird类的fly()方法
	public void fly(){
		System.out.println("在天空中自由的飞翔……");
	}
}
public class Ostrich extends Bird1{
	//重写Bird类中的fly()方法
	public void fly(){
		System.out.println("我只能在地上奔跑……");
	}
	public void callOverridedMethed(){
		//调用父类被覆盖的实例方法
		super.fly();
	}
	public static void main(String[] args){
		//创建Ostrich对象
		Ostrich os = new Ostrich();
		//调用callOverridedMethed方法
		System.out.println("除了我，Bird一般都能：");
		os.callOverridedMethed();
		//调用fly方法
		System.out.println("然而我，呜呜呜~~~");
		os.fly();
	}
}