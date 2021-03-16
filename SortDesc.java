import java.util.*;

class Sort{
	
	public static int count = 0;

	public static void insertionSort(int[] arr) {
		
		int count = 0;
		
		while(count<5) {
		
			for(int i = (arr.length - 1); i < arr.length; i++) {
			//System.out.println(arr[i]);
			int value = arr[i];
			int j = i;
			
			while(j > 0 && arr[j - 1] < value) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = value;
		
		}
		count++;
		}
	}
	
}

public class SortDesc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		
		Sort sort = new Sort();

		sort.insertionSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
