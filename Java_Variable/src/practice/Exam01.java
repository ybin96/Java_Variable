package practice;

import java.util.Scanner;
public class Exam01
{
	public static void main(String []args) //
	{
		Scanner sc = new Scanner(System.in);

		int length,width,height,volume;

		System.out.println("박스 부피 계산하기");
		System.out.print("박스의 길이를 입력하시오 :");
		length = sc.nextInt();
		System.out.print("박스의 너비를 입력하시오 :");
		width = sc.nextInt();
		System.out.print("박스의 높이를 입력하시오 :");
		height = sc.nextInt();
		volume = length*width*height;
		System.out.print("박스의 부피는");
		System.out.print(volume);
		System.out.println("입니다");
	}
}