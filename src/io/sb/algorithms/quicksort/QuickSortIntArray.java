package io.sb.algorithms.quicksort;

import java.util.Arrays;

public class QuickSortIntArray {

	
	public static void main(String[] args) {
			int[] inputArray = {5,2,1,10,9,8,6};
			System.out.println("Input Array:"+ Arrays.toString(inputArray));
			quickSort(inputArray, 0, inputArray.length-1);
			
			System.out.println("Sorted Array:"+ Arrays.toString(inputArray));
	}
	
	public static void quickSort(int[] inputArray, int startIndex, int endIndex) {
		if(startIndex < endIndex) {
			int partitionPoint = partitionPivotIndex(inputArray, startIndex, endIndex);
				quickSort(inputArray, startIndex, partitionPoint-1);
				quickSort(inputArray, partitionPoint+1, endIndex);
		}
		
	}
	
	public static int partitionPivotIndex(int[] inputArray, int startIndex, int endIndex){
		
		
		int pivotValue = inputArray[endIndex];
		
		int i = startIndex -1;
		
		for(int j=startIndex; j<=endIndex-1;j++) {
			if(inputArray[j]<=pivotValue) {
				i++;
				int iVal = inputArray[i];
				int jVal = inputArray[j];
				inputArray[i] = jVal;
				inputArray[j] = iVal;
				
			}
		}
		
		// put the pivot value in the right index
		
		int ival = inputArray[i+1];
		inputArray[endIndex] = ival;
		inputArray[i+1] = pivotValue;// pivot value of is placed in the right slot of Array
		
		return i+1;
		
	}
	

}
