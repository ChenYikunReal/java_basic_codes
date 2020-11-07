package Imitation_Code;

public class OutputFactory{
	public Output getOutput(){
		return new Printer();
	}
	public static void main(String[] args){
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("������ƻ���");
		c.keyIn("������������ƻ���");
		c.print();
	}
}