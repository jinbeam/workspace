package sub0928;

public class Prob06 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� Ư������ �����ϴ� �׽�Ʈ");
		System.out.println("---------------------Sample 1 -----------------------");
		String str1 = myReplace("hello world", 'l', '*');
		System.out.println(str1);
		
		System.out.println("---------------------Sample 2 -----------------------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);
		
		System.out.println("---------------------Sample 3 -----------------------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);
	}
	
	public static String myReplace(String str, char oldChar, char newChar) {
		StringBuffer sb = new StringBuffer(str);
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==oldChar) {
				sb.setCharAt(i, newChar);
			}
		}
		return sb.toString();
		//return str.replace(oldChar, newChar);
	}

}
