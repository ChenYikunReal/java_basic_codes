package Imitation_Code;

import java.util.Scanner;

class ScoreAndGrade{
	private int score;
	private char grade;

	public ScoreAndGrade(int score){
		this.score = score;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return this.score;
	}

	public void ScoreToGrade(int score){
		if (score <0 || score > 100){
			System.out.println("��Ǹ��������ĳɼ����Ϸ���");
			return;
		}else{
			if (score < 60){
				grade = 'E';
				System.out.println("���ź����㲻���񣬵ȼ�ΪE");
				return;
			}else if(score >=60 && score < 70){
				grade = 'D';
				System.out.println("��ŷ����ռ��񣬵ȼ�ΪD");
				return;
			}else if (score >=70 && score < 80){
				grade = 'C';
				System.out.println("����Ŷ���㻹Ҫ����Ŭ�����ȼ�ΪC");
				return;
			}else if (score >=80 && score < 90){
				grade = 'B';
				System.out.println("�����㻹�������ռ䣬�ȼ�ΪB");
				return;
			}else{
				grade = 'A';
				System.out.println("̫ǿ�ˣ�������㣬�ȼ�ΪA");
				return;
			}
		}
	}

	
}
		

public class ScoreAndGradeTest{
	public static void main(String[] args){
		System.out.println("������ѧ���ĳɼ�");
		System.out.println("��ע�⣬����Ϊ100�֣��ɼ�Ϊ������");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println("������ĳɼ��ǣ�" + score);
		ScoreAndGrade s = new ScoreAndGrade(score);
		s.setScore(score);
		s.ScoreToGrade(score);

	}
}