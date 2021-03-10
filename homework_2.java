import java.util.Scanner;

public class homework_2 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요" );
		
		int rad = sc.nextInt();
		
		System.out.printf("원의 둘레= %f\n", (double)2*rad*PI);
		System.out.printf("원의 넓이= %f\n", (double)rad*rad*PI);
	}

}