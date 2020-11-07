package Imitation_Code;

public class Gender1Test{
	public static void main(String[] args){
		//通过Enum的valueOf()方法来获取指定枚举类的枚举值
		Gender1 g = Enum.valueOf(Gender1.class, "FEMALE");
		//直接为枚举类的name实例变量赋值
		g.name = "女";
		//直接访问枚举值的name实例变量
		System.out.println(g + "代表" + g.name);
	}
}