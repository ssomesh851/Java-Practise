import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3};

		for(int i = 0; i < a.length; i++) {

			if(a[i]%2 == 0) {

				System.out.println(a[i]);
			}
			else
			{	
				System.out.println("not a proper number");
			}
		}
	}
}