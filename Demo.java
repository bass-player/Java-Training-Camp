package upscore;
import java.util.Scanner;
/*
 * 为指定的成绩进行加分，直到分数大于等于60分
 * 使用Scanner工具类获取输入
 * 该类位于java.util包中
 * 步骤：
 * 1.导入java.util.Scanner
 * 2.创建Scanner对象
 * 3.接受并保持用户输入的值
 */
public class Demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		int score = input.nextInt();//获取成绩
		int count = 0;
		System.out.println("加分前的成绩："+score);
		while (score<=60) {
			score++;
			count++;
		}
		System.out.println("加分后的成绩："+score);
		System.out.println("加分次数："+count);
	}
}
