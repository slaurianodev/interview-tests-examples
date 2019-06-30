package pt.com.sergio;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		int j = myArray.length;
		int currentValue;

		for (int i=0; i < myArray.length / 2; i++) {
			currentValue = myArray[i];
			myArray[i] = myArray[--j];
			myArray[j] = currentValue;
		}
		
		System.out.println(Arrays.toString(myArray));
	}

}
