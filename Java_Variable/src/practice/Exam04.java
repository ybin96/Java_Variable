package practice;

import java.util.Scanner;
public class Exam04
{
	final static double PER = 3.3;
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double pyeong,square_meter;
		System.out.print("평을 입력하시오 : ");
		pyeong = sc.nextDouble();
		square_meter = pyeong * PER; 
		System.out.println(pyeong+"은 "+square_meter+"제곱미터입니다");
	}
}