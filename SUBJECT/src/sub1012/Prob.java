package sub1012;

import java.util.Vector;

public class Prob {

	public static void main(String[] args) throws Exception {
		String pathName = "./src/data2.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("===========================");
		
		System.out.println("화일 내용중 서울 정보 검색");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "서울");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("===========================");
		
		System.out.println("화일 내용중 경주 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경주");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("===========================");
		
		System.out.println("화일 내용중 경기도 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경기도");
		for(int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}

	}

}
