
import java.util.*;

public class Example_while {
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i;
			
			while(j > 0 && arr[j - 1] > value) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,8,5,4,1,9,-2};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
 
		/*int i = 1; int sum = 0;

		while(i <= 10) {
			sum = sum+i;
			
			i++;
		}
		System.out.println("sum: "+sum);
		
		
		int[] a = {1,2,3,4};
		
		for(int j: a) {
			System.out.println(j);
		}
	*/
		
	}
	
	
}
