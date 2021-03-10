
import java.util.Scanner;

public class homework_4_2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1= sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2= sc.nextInt();
		
		if (num1 % num2 ==0) {
			System.out.println(num1 + "은/는"+ num2 + "의 배수 입니다.");
		} else {
			System.out.println(num1 + "은/는"+ num2 + "의 배수가 아닙니다.");
		}
	}

}
