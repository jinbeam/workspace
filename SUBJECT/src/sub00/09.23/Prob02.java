public class Prob02 
{
	public String leftPad(String str, int size, char padChar){
		String strChar="";
		if(size-str.length()>0){
			for(int i=0; i<size-str.length();i++){
				strChar += padChar;
			}
			strChar += ' '+str;
			return strChar;
		}
		else
			return str;
	}

	public static void main(String[] args) 
	{
		Prob02 prob3 = new Prob02();

		System.out.println( prob3.leftPad("ABC", 6, '#') );
		System.out.println( prob3.leftPad("ABC", 5, '$') );
		System.out.println( prob3.leftPad("ABC", 2, '&') );
	}
}
