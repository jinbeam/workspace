public class Util
{
	public static int findPrimeCount(int limit){
		boolean primeInvestigate;
		int primeCount = 0;
		for (int i=2;i<=limit;i++){
			primeInvestigate = true;
			for(int k=2; k<i; k++){
				if(i%k == 0){
					primeInvestigate = false;
					break;
				}
			}
			if(primeInvestigate == true)
				primeCount++;
		}

		return primeCount;
	}

	public static int[] findPrimeReturnArray(int limit){
		boolean primeInvestigate;
		int[] array = new int[findPrimeCount(limit)];
		int j = 0;
		for (int i=2;i<=limit;i++){
			primeInvestigate = true;
			for(int k=2; k<i; k++){
				if(i%k == 0){
					primeInvestigate = false;
					break;
				}
				
			}
			if(primeInvestigate == true){
					array[j] = i;
					++j;
				}
			
		}
		return array;
	}
}