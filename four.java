import java.util.Scanner;

public class four {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = input.nextInt();
		int sum = 0;
		int c = 1;
		for(int b = 1; b <= (a/2); b++) {
			c = c + 2;
			sum += c;
		}
		sum = sum + 1;
		System.out.println(sum);
	}

}
