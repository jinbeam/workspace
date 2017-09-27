package sub0927;

public class Prob11
{
	public static void main(String[] args) 
	{
		Prob11 p1 = new Prob11();

		System.out.println("입력 : Korea");
		System.out.println("출력 : "+p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));
		
		
	}

	public String toEncoding(String str){
		byte[] temp = str.getBytes();
		String string="";
		double index=0;
		
		for(int i=0;i<temp.length;i++) {
			
			if(Integer.toHexString(temp[i]).length()<=3) {
				//System.out.println(index);
				string += str.charAt((int)index);
				index++;
			}
			else {
				//System.out.println(index);
				string += Integer.toHexString(temp[i]).substring(6).toUpperCase()+"%";
				index += 0.5;
			}
		}
	
		/*for(int i=0; i<temp.length; i++) {
			try {
				string += "%"+Integer.toHexString(temp[i]).substring(6).toUpperCase();
			}catch(Exception e) {
				if(string != "") {
					string += " ";
				}
				else {
					return str;
				}
			}
		}*/   // 한글 영어 섞어쓰면 안됨!
		


		return string;
	}
}
