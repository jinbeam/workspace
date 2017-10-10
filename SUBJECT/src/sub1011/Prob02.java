package sub1011;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Prob02 {

	public static void main(String[] args) {
		int[] array = generateRandomNumber();
		printStatistics(array);
	}
	
	private static int[] generateRandomNumber() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=new Random().nextInt(20)+1;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
	
	public static void printStatistics(int[] array) {
		int big=0;
		int small=20;
		int sum=0;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("score.txt"));
			for(int i=0; i<array.length;i++) {
				sum += array[i];
				bw.write( Integer.toString(array[i]) );
				bw.newLine();
				big = Math.max(array[i], big);
				small = Math.min(array[i], small);
			}
			bw.write("최대값 : "+big);
			bw.newLine();
			bw.write("최소값 : "+small);
			bw.newLine();
			bw.write("평균값 : "+ (sum/array.length) );
			bw.newLine();
			
			bw.flush();
			bw.close();
		}catch(IOException e) {
			
		}
		
		
		
	}

}
