package practice;

import java.util.Scanner;
public class Exam05
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int input,hours,minutes,seconds;

		System.out.println("시간을 초단위로 입력하시오");
		input = sc.nextInt();
									// 60*60 == 3600 , 3662 1시간 1분 2초
		hours = input / (60*60);    // 1시간.
		seconds = input % (60*60);  // 62
		minutes = seconds / 60;   // 1
		seconds = seconds % 60;    //2

		// System.out.println(input +"초는" +hours+ "시간" +minutes+ "분"+seconds+"초 입니다");

		System.out.print(input+"초는");
		if(hours > 0){
			System.out.print(hours+"시간");
		}
		if(minutes > 0){
			System.out.print(minutes+"분");
		}
		if(seconds > 0){
			System.out.print(seconds+"초");
		}
		System.out.println("입니다");
	}
}