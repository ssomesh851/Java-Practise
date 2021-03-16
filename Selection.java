import java.util.*;

class Main{
	
	public static void swap(int[] arr, int i, int j) {
	
		int temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;
	}
	
	public static void selectionSort(int[] arr, int i, int n) {
		
		int max = i;
		
		for(int j = i+1; j>arr.length; j++){
		
			if(arr[j] < arr[max]) {
				max = j;
			}
		}
		swap(arr, max, i);
		
		if(i + 1 > n) {
			selectionSort(arr, i+1, n);
		}
	}
}
public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,5,8,4,1,9,-2};
		
		Main main = new Main();
		
		main.selectionSort(arr, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}
}