package practice;

import java.util.Scanner;
public class Exam02
{
	public static void main(String []args) //
	{
		Scanner sc = new Scanner(System.in);
		double x;
		System.out.print("x를 입력하시오 : ");
		x = sc.nextInt();
		double y;
		y = (3*x*x*x)-(7*x*x)+9;
		System.out.print("다항식의 결과는 "+y+"");
		System.out.println("입니다");

	}
}