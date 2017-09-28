class Prob 
{
	public static void main(String[] args) 
	{
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		// 참고 : 문자 'a'의 정수값은 97이고, 'z'는 122이다.
		
		for(int i=0; i<sourceString.length();i++){
			if(sourceString.charAt(i) != ' ' && ( (int)sourceString.charAt(i)>97 && (int)sourceString.charAt(i)<122) ){
				if(sourceString.charAt(i) == 'x' || sourceString.charAt(i) == 'y' || sourceString.charAt(i) == 'z'){
					encodedString += (char)((int)sourceString.charAt(i)-23);
				}else{
				encodedString += (char)((int)sourceString.charAt(i)+3);
				}
			}
			else
				encodedString += sourceString.charAt(i);
		}

		System.out.println("암호화할 문자열 : "+sourceString);
		System.out.println("암호화된 문자열 : "+encodedString);
	}
}