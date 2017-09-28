final class StaticTest
{
	static int a;
	static int b;
	static String c;

	void setting(int a, int b, String c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void print(){
		System.out.println((a)+(b)+c);
	}
}

public class test
{
	public static void main(String[] args) 
	{
		StaticTest stt = new StaticTest();
		stt.setting(1, 2, "ȫ�浿");
		stt.print();
	}
}
