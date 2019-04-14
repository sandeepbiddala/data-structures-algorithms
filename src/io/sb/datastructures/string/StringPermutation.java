package io.sb.datastructures.string;

//Java program to print all permutations of a 
//given string. 
public class StringPermutation 
{ 
	/** 
	* permutation function 
	* @param str string to calculate permutation for 
	* @param l starting index 
	* @param r end index 
	*/
	private void possibleStringPermutation(String str, int startIndex, int endIndex) 
	{ 
		if (startIndex == endIndex) 
			System.out.println(str); 
		else
		{ 	
			for (int currentIndex = startIndex; currentIndex <= endIndex; currentIndex++) 
			{  
				boolean canBeSwapped = shouldSwap(str, startIndex, currentIndex);
				if(canBeSwapped) {
				str = swap(str,startIndex,currentIndex); 
				possibleStringPermutation(str, startIndex+1, endIndex); 
				str = swap(str,startIndex,currentIndex); 
				}
			} 
		} 
	} 

	/** 
	* Swap Characters at position 
	* @param a string value 
	* @param i position 1 
	* @param j position 2 
	* @return swapped string 
	*/
	public String swap(String str, int startIndex, int currentIndex) 
	{ 
		char temp; 
		char[] charArray = str.toCharArray(); 
		temp = charArray[startIndex] ; 
		charArray[startIndex] = charArray[currentIndex]; 
		charArray[currentIndex] = temp; 
		return String.valueOf(charArray); 
	} 
	
	static boolean shouldSwap(String str, int start, int curr) { 
		char[] charArray = str.toCharArray();
        for (int i = start; i < curr; i++) { 
            if (charArray[i] == charArray[curr]) { 
                return false; 
            } 
        } 
        return true; 
    } 
	
	public static void main(String[] args) 
	{ 
		String str = "ABC"; 
		int length = str.length(); 	
		int startIndex = 0;
		StringPermutation permutation = new StringPermutation(); 
		permutation.possibleStringPermutation(str, startIndex, length-1); 
	} 

} 


