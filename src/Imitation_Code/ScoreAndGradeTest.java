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
			System.out.println("抱歉，您输入的成绩不合法！");
			return;
		}else{
			if (score < 60){
				grade = 'E';
				System.out.println("真遗憾，你不及格，等级为E");
				return;
			}else if(score >=60 && score < 70){
				grade = 'D';
				System.out.println("哇欧，你刚及格，等级为D");
				return;
			}else if (score >=70 && score < 80){
				grade = 'C';
				System.out.println("加油哦，你还要继续努力，等级为C");
				return;
			}else if (score >=80 && score < 90){
				grade = 'B';
				System.out.println("不错，你还有上升空间，等级为B");
				return;
			}else{
				grade = 'A';
				System.out.println("太强了，你很优秀，等级为A");
				return;
			}
		}
	}

	
}
		

public class ScoreAndGradeTest{
	public static void main(String[] args){
		System.out.println("请输入学生的成绩");
		System.out.println("请注意，满分为100分，成绩为整数！");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println("您输入的成绩是：" + score);
		ScoreAndGrade s = new ScoreAndGrade(score);
		s.setScore(score);
		s.ScoreToGrade(score);

	}
}