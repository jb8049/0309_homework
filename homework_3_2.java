import java.util.Scanner;
public class homework_3_2{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("물건값을 입력하세요 : ");
		
		int price= sc.nextInt();
		
		System.out.println("지불한 금액을 입력하세요 : ");
		
		int paid= sc.nextInt();
		int gsr= paid-price ;
		
		if(gsr < 0) {
			System.out.println(Math.abs(paid-price)+ "원이 부족합니다.");
		
		} else {
		    int pad1000= gsr / 1000;
		    int pad500= (gsr % 1000) / 500;
		    int pad100= ((gsr % 1000) % 500) / 100;
		    int pad50= (((gsr % 1000) % 500) % 100) / 50;
		    int pad10= ((((gsr % 1000) % 500) % 100) % 50) / 10;  	    
		    
		    System.out.println("거스름돈은"+ gsr +"원 입니다.");

		    System.out.println("1000원 :" + pad1000 + "장");
		    System.out.println("500원 :" + pad500 + "개");
		    System.out.println("100원 :" + pad100 + "개");
		    System.out.println("50원 :" + pad50 + "개");
		    System.out.println("10원 :" + pad10 + "개");
  
		}
	}

}
