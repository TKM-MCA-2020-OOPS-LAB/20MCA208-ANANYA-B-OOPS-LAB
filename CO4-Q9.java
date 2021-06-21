package myproject;
import java.util.Scanner;
class BubbleSort{
	void bubblesort(int arr[],int n) {
		
		int i,j;
		 for (i = 0; i < n-1; i++)
	            for (j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                   
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
		 
	}
   void printelements(int arr[],int n) {
		
		for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}
}
public class B_SORT {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 System.out.println("Enter the elements:");
			int arr[] = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt();
		 }
		 BubbleSort  obj= new BubbleSort ();
		 System.out.println("\nBefore Sorting..\n");
		 obj.printelements(arr,n);
		 obj.bubblesort(arr,n);
		 System.out.println("\nAfter Sorting..\n");
		 obj.printelements(arr,n);
		// TODO Auto-generated method stub

	}

}
