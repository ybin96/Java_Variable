package study;

public class DoubleTest
{
	public static void main(String[] args) 
	{
		byte a = 26;
		float b = (float)26.7;  // 실수값을 float에 저장하려면 반드시 형변환해야한다.
		float c = 26.7f;        // 실수값 뒤에 접미사 f를 붙여 float형으로 사용하기도 한다.
		System.out.println(a);  // 하지만 float은 잘 사용하지 않으며 대부분 double을 사용한다..
		System.out.println(b);
		System.out.println(c);
	}
}
