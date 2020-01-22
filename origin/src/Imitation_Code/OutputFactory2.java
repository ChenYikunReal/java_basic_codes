package Imitation_Code;

public class OutputFactory2{
	public Output getOutput(){
		return new BetterPrinter();
	}
	public static void main(String[] args){
		OutputFactory2 of = new OutputFactory2();
		Computer c = new Computer(of.getOutput());
		c.keyIn("������ƻ���");
		c.keyIn("������������ƻ���");
		c.print();
	}
}