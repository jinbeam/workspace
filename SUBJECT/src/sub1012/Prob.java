package sub1012;

import java.util.Vector;

public class Prob {

	public static void main(String[] args) throws Exception {
		String pathName = "./src/data2.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("===========================");
		
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "����");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("===========================");
		
		System.out.println("ȭ�� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "����");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("===========================");
		
		System.out.println("ȭ�� ������ ��⵵ ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "��⵵");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
