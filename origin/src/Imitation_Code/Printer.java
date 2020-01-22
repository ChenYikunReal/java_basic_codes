package Imitation_Code;

//定义一个Product接口
interface Product{
	int getProduceTime();
}
//让Printer类实现Output和Product接口
public class Printer implements Output, Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	//用以记录当前需要打印的作业数
	private int dataNum = 0;
	public void out(){
		//只要还有作业数，就继续打印
		while (dataNum > 0){
			System.out.println("打印机打印：" + printData[0]);
			//把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg){
		if (dataNum >= MAX_CACHE_LINE){
			System.out.println("输出队列已满，添加失败");
		}else{
			//把打印的数据添加到队列里，已保存的数据数量加1
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}
	public static void main(String[] args){
		//创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("高等数学");
		o.getData("线性代数");
		o.out();
		o.getData("离散数学");
		o.getData("大学物理");
		o.out();
		//调用Output接口里定义的默认方法
		o.print("孙悟空", "猪八戒", "白骨精");
		o.test();
		//创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋给Object类型的变量
		Object obj = p;
	}
}