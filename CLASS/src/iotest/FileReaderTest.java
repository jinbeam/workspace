package iotest;

import java.io.*;

public class FileReaderTest
{
	public static void main(String[] args) 
	{
		//File 을 읽어 들이는 Stream 선언
		FileInputStream fr = null;
		//read() 수 count하기 위한 변수
		int readCount = 0;
		//Reader r = new FileInputStream(fr);

		try
		{
			fr = new FileInputStream(args[0]);
			
			while(true) {
				int i = fr.read();

				//the next byte of data, or -1 if the end of the stream is reached.
				if(i == -1) {
					break;
				}

				char c= (char)i;
				System.out.print(c);

				readCount ++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("\n\n=============================");
			System.out.println("=====>>> read 횟수 readCount: "+readCount);
			System.out.println("=============================");
			try {
				fr.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
