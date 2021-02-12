import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() + 1;
		int m = scan.nextInt();
		int fromStart = 0;
		int fromEnd = 0;
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i;
		}
		if(arr[arr.length - 1] % 2 == 0) {
			int[] arr_new = new int [arr.length + 1];
			for(int i = 0; i < arr_new.length; i++)
				arr_new[i] = i;
			if(arr_new[arr_new.length - 1] - m == 1)
				System.out.println(0);
			else {
				fromStart = m;
				fromEnd = arr_new[arr_new.length - 1] - m;
				
				if(fromStart < fromEnd) {
					System.out.println(fromStart / 2);
				}else {System.out.println(fromEnd / 2);}
			}
	
		}else {
			if(arr[arr.length - 1] - m == 1)
				System.out.println(0);
			else {
				fromStart = m;
				fromEnd = arr[arr.length - 1] - m;
				
				if(fromStart < fromEnd) {
					System.out.println(fromStart / 2);
				}else {System.out.println(fromEnd / 2);}
			}
		}
		
	}
}
