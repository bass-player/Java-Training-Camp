package upscore;
import java.util.Scanner;
/*
 * Ϊָ���ĳɼ����мӷ֣�ֱ���������ڵ���60��
 * ʹ��Scanner�������ȡ����
 * ����λ��java.util����
 * ���裺
 * 1.����java.util.Scanner
 * 2.����Scanner����
 * 3.���ܲ������û������ֵ
 */
public class Demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�����뿼�Գɼ���");
		int score = input.nextInt();//��ȡ�ɼ�
		int count = 0;
		System.out.println("�ӷ�ǰ�ĳɼ���"+score);
		while (score<=60) {
			score++;
			count++;
		}
		System.out.println("�ӷֺ�ĳɼ���"+score);
		System.out.println("�ӷִ�����"+count);
	}
}
