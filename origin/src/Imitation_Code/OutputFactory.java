package Imitation_Code;

public class OutputFactory{
	public Output getOutput(){
		return new Printer();
	}
	public static void main(String[] args){
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("程序设计基础");
		c.keyIn("面向对象程序设计基础");
		c.print();
	}
}