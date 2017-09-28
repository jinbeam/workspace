package sub0929;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Grade {

	public static void main(String[] args) {
		Grade grade = new Grade();
		String fileName = "score.txt";
		grade.printGrade(fileName);
	}
	
	public void printGrade(String fileName) {
		BufferedReader br = null;
	
		int sum=0;
		int count = 0;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Writer writer = new OutputStreamWriter(System.out);
		
		String str = null;
		
		try {
			while( (str=br.readLine()) != null) {
				writer.write(str.substring(0,str.indexOf(','))+"�� ������ "
							+ Integer.parseInt(str.substring(str.indexOf(',')+1,str.length() ) )+"�� �Դϴ�.\n" );
				sum += Integer.parseInt(str.substring(str.indexOf(',')+1,str.length()));
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			writer.write("����� ������ "+sum+"�� �Դϴ�.\n");
			writer.write("����� ����� "+sum/count+"�� �Դϴ�.\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			writer.flush();
			br.close();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}