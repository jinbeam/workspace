package sub0927;

public class Prob11
{
	public static void main(String[] args) 
	{
		Prob11 p1 = new Prob11();

		System.out.println("�Է� : Korea");
		System.out.println("��� : "+p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : "+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+p1.toEncoding("0319"));
		
		
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
		}*/   // �ѱ� ���� ����� �ȵ�!
		


		return string;
	}
}
