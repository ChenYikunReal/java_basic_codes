package Imitation_Code;

public abstract class SpeedMeter{
	//ת��
	private double turnRate;
	public SpeedMeter() { }
	//�ѳ����ܳ��ķ�������ɳ��󷽷�
	public abstract double calGirth();
	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}
	//�����ٶȵ�ͨ���㷨
	public double getSpeed(){
		//�ٶȵ��� �ܳ���ת��
		return calGirth() * turnRate;
	}
}