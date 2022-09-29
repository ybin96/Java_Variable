package study;

public class IntTest
{
	public static void main(String[] args) 
	{
		long now = System.currentTimeMillis();
		System.out.println(now);

		int n ;
		n= (int)(now % 10);
		System.out.println(n);

		/*byte data;
		data = 127;
		data = (byte)(data +1);   // overflow현상, 127에서 한바퀴돌아서 -128이 표현
		System.out.println(data);

		byte data2;
		data2 =-128;
		data2 = (byte)(data2 - 1);
		System.out.println(data2); // underflow현상,양수 127이 표현됌
		*/
	}
}
