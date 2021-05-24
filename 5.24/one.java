import java.util.Scanner;

public class one {
	
	private static Scanner scanner;

	public static void main(String args[]) {
		
		scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = scanner.nextInt();
		if(a%2 == 0) {
			System.out.println("ou");
		}else {
			System.out.println("ji");
		}
		}

}
