import java.util.Scanner;

public class two {
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		System.out.println("请输入一个三位数：);
		int a = input.nextInt();
		int b = a / 100;
		int c = a / 10 % 10;
		int d = a % 10;
		if(d * d * d + b * b * b + c * c * c == a) {
			System.out.println("是水仙花数");
		}else {
			System.out.println("不是水仙花数！！！");
		}
	}
}
