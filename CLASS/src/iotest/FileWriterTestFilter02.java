package iotest;

import java.io.*;

public class FileWriterTestFilter02
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = null;
		BufferedWriter bw = null;

		
		br = new BufferedReader(new InputStreamReader(System.in));


		//==> Data를 write 할 수 있는 BufferedWriter 생성
		 bw = new BufferedWriter ( new FileWriter("test.txt"));

		 // read / writer 하는 while문
		// String source = null;
		 while( true ){
			 String str = br.readLine();
			 
			 if("끝".equals(str)){
				 break;
			 }
			 bw.write(str);
			 bw.newLine();
		 }
		 bw.flush();

		 //stream close()
		 bw.close();
		 br.close();

	}
}
