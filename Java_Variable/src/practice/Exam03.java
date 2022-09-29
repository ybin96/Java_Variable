package practice;

import java.util.Scanner;
public class Exam03
{
	final static double PER = 454;      //상수 만드는방법 (class안에 만들기,대문자로 작성)
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		double pound,gram;
		System.out.println("몸무게를 파운드로 입력하시오");
		pound = sc.nextDouble();
		gram = pound*PER;
		System.out.println("몸무게를 그램으로 변환하면 "+gram+"입니다");
	}
}

