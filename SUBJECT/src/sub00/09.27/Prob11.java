public class Prob11
{
	public static void main(String[] args) 
	{
		Prob11 p1 = new Prob11();
		String str = "ȫ�浿";
		Integer.toHexString(temp[0]).substring(6)
		System.out.println("�Է� :  Korea");
		System.out.println("��� : "+p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+p1.toEncoding("0319"));
		

	/*String value = "ȫ �� ��";
		byte[] temp = value.getBytes();
		System.out.println( Integer.toHexString(temp[0]) );
		System.out.println( Integer.toHexString(temp[1]) );
		System.out.println( Integer.toHexString(temp[2]) );
		System.out.println( Integer.toHexString(temp[3]) );
		System.out.println( Integer.toHexString(temp[4]) );
		System.out.println( Integer.toHexString(temp[5]) );
		System.out.println( Integer.toHexString(temp[6]) );
		System.out.println( Integer.toHexString(temp[7]) );*/
	
	}

	public String toEncoding(String str){
		byte[] temp = str.getBytes();
		String string="";
		
		for(int i=0; i<temp.length; i++){
			string += "%"+Integer.toHexString(temp[i]).substring(6)+"%";
		}


		return string;
	}
}