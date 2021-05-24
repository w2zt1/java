import java.util.Arrays;
import java.util.Scanner;

public class six {
	public static void main(String args[]) {
		int[]score = new int[8];
		int sum = 0;
		int a = 0;
		int b = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入8个同学的分数：");
		for(int i = 0; i < score.length; i++ ) {
			score[i] = input.nextInt();
		}
		for(int i = 0;i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("总分是："+sum);
		a = sum/8;
		System.out.println("平均分是："+a);
		Arrays.sort(score);
		System.out.println("最高分是："+score[score.length-1]);
	}
}
