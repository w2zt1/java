import java.util.Scanner;

public class three {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = input.nextInt();
		int sum = 0;
		for(int b = 0;b <= a;b++) {
			sum += b;
		}
		System.out.print(sum);
	}
}


