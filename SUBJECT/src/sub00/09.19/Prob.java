public class Prob 
{
	public static void main(String[] args) 
	{
		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;

		int[] array = new int[args.length];

		
		
		for(int i = 0; i<args.length;i++){
			array[i] = Integer.parseInt(args[i]);
			sum += array[i];

			if(smallest>array[i]){
				smallest=array[i];
			}
			if(largest<array[i]){
				largest=array[i];
			}
		}
		
		average = sum/(double)args.length;

		System.out.println("the largest value = " + largest);
		System.out.println("the smallest value = " + smallest);
		System.out.println("the total value = " + sum);
		System.out.println("and the average is = " + average);
		
	}
}
