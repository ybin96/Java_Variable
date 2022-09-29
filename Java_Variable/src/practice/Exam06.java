package practice;

import java.util.Scanner;
import java.util.Date;
public class Exam06
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();

		int thisYear = today.getYear() + 1900; // 현재년도를 가져오는 수식
		String name;
		int year;
		int age;
		
		System.out.println("이름를 입력하시오");
		name = sc.next();
		System.out.println("출생연도를 입력하시오");
		year = sc.nextInt();
		age = thisYear - year;

		if(age >=40 && thisYear % 2 == year % 2){
			System.out.println(name+"님, 올해 "+thisYear+"무료암검진 대상자입니다");
		}else{
			System.out.println(name+"님, 올해 "+thisYear+"무료암검진 대상자가 아닙니다.");
		}
	}
}




