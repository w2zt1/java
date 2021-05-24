import java.util.Scanner;

public class five {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = input.nextInt();
		int b ;
		int c = 1;
		for (b = 1; b <= a; b++) {
			c = c * b;
		}
		System.out.println(c);
	}
}
