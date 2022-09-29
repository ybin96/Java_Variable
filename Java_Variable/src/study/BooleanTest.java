package study;

public class BooleanTest
{
	public static void main(String[] args) 
	{
		boolean flag;  // 변수를 선언
		flag= true;    // 값을 저장
		// boolean flag = true;
		
		int n;
		n = 0;
		// int n = 0;

		while( flag ){
			System.out.println("hello");
			n = n+1;
			if( n>=10 ){
				flag = false;
			}
		}
	}
}
