package study;

// 문자열변수 data에 저장된 소문자 e는 모두 몇개 있는지 파악하여 출력

public class CharTest
{
	public static void main(String[] args) 
	{
		String data = "hello korea";
		boolean flag = true;
		int index = 0;
		int cnt = 0;
		
		while(flag){
			char ch = data.charAt(index);
			if (ch == 'e')
			{
				cnt = cnt + 1;
			}
			index = index + 1;
			if(index == data.length()){
				flag = false;
			}
		}
		System.out.println("문자열에 소문자 e는 모두 "+cnt+"개 있어요");
	}
}


