import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		
		int num1= sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		
		int num2= sc.nextInt();
		
		System.out.printf("%d + %d= %d \n", num1,num2,num1 + num2);
		System.out.printf("%d - %d= %d \n", num1,num2,num1 - num2);
		System.out.printf("%d * %d= %d \n", num1,num2,num1 * num2);
		System.out.printf("%d / %d = %.2f \n", num1, num2, num1 / (float)num2);
		System.out.printf("%d %% %d = %d \n", num1, num2, num1 % num2);
		
	}

}

/*
	종범씨 과제하시느라 고생하셨습니다 ^^
	일단 클래스명이 다 소문자로 시작하네요~~~
	명명규칙에 맞추어 첫글자를 대문자로 시작하도록 작성하시면 좋을 거 같습니다.
	그리고 실수의 기본형은 double이기 때문에 특별한 이유가 없다면 형변환은 double로 하는 것을 권장합니다 ^^
*/