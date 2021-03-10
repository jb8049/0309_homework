
import java.util.Scanner;

public class homework_4_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1= sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2= sc.nextInt();
		
		System.out.printf("%d는 %d의 배수 판단 결과?", num1,num2);
		System.out.println(num2 !=0 && num1 % num2 ==0 ? true:false);
	}

}
