package study;

public class StringTest 
{
	public static void main(String[] args) 
	{
		String data = "ab c"; // 빈칸도 한글자로 받아들임
		int n = data.length();
		System.out.println(n); 
		char ch = data.charAt(2);
		System.out.println("|"+ch+"|");
	}
}
