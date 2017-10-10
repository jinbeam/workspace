package sub1011;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Prob {
	public static void main(String args[]) {
		Prob e = new Prob();
		Vector scores = e.getList();
		for(int i=0; i<scores.size();i++) {
			System.out.println(scores.get(i));
		}
	}
	
	public Vector getList() {
		BufferedReader br = null;
		Vector v = new Vector();
		
		try {
			br = new BufferedReader(new FileReader("list.txt"));
			String str;
			while( (str=br.readLine() ) != null) {
				String[] score= str.split("/");
				if(score[1].equalsIgnoreCase("java") && Integer.parseInt(score[2])>=80) {
					v.add(str.replaceAll("/", ", ")+ ", 수료");
				}
				else if(score[1].equalsIgnoreCase("java") && Integer.parseInt(score[2])<80) {
					v.add(str.replaceAll("/", ", ")+ ", 미수료");
				}
				else if(score[1].equalsIgnoreCase("sql") && Integer.parseInt(score[2])>=90) {
					v.add(str.replaceAll("/", ", ")+ ", 수료");
				}
				else if(score[1].equalsIgnoreCase("sql") && Integer.parseInt(score[2])<90) {
					v.add(str.replaceAll("/", ", ")+ ", 미수료");
				}
			}
			br.close();
		}catch(IOException e) {
			
		}
		
		return v;
	}
}
