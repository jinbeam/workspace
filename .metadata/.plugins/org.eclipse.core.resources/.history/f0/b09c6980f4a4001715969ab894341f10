public class StringUtil
{
	static String replaceString(String[] arr){
		int count;
		int countMax=0;
		int space=0;
		String aMax="";

		for(int i=0; i<arr.length; i++){
			count = 0;
			for(int j=0; j<arr[i].length(); j++){
				if(arr[i].charAt(j) == 'a'){
					count++;
				}
				if(count > countMax){
					countMax = count;
					space = i;
				}
			}
		}
		
		for(int i=0; i<arr[space].length();i++){
			if(arr[space].charAt(i) == 'a'){
				aMax += 'A';
			}
			else
				aMax += arr[space].charAt(i);
		}
		return aMax;
	}

	public static void main(String[] args) 
	{
		String[] arr = {"java program", "array", "java program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : "+result);
	}

	
}
