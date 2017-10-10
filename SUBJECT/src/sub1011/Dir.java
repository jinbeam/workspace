package sub1011;

import java.io.File;

public class Dir {
	public static void main(String[] args)  {
		new Dir().printDir("test_dir");
		System.out.println("출력이 완료되었습니다.");
	}
	
	private void printDir(String str) {
		File f = new File(str);
		
		File[] list = f.listFiles();
		
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) {
				printDir(list[i].toString());
			}
		}
		System.out.println(f);
	}
}