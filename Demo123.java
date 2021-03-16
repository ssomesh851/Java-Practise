import java.util.*;

public class Demo123 {
	
	public static void Sort(int[] A, int sum) {
		
			for(int i = 1; i < A.length; i++) {
				int j = i;
				if(A[i] + A[j] == sum) {
					System.out.println("index positions are:"+ i +" "+j);	
				}
				
				//count++;
			}
		}
		
	
	public static void Duplicate(int[] arr) {
		int low = 1;
		int high = arr.length - 1;
		
			for(int i = 0; i < arr.length; i++) {
				if(arr[low] == arr[high]) {
					System.out.println(arr[low]);
					System.out.println(arr[high]);
				}
				
			}
			//Sort.count++;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {21,5,3,5,5,5};
		int sum = 10;
		Sort(A, sum);
		
		int[] arr = {1, 1, 2, 3, 4};
		Duplicate(arr);
	}

}
