package algorithm.mum;
/*
* In bubble sort position of the largest element is found, then second largest element and so on
* */
public class BubbleSort {
	
	static int [] A ={3,7,9,1,2,4,99,10,11};//{1,2,3,4,5,6,7,8,9}; //
	
	public static void main(String[] args) {
		
		
		bubbleSort(A);
		for(int x:A)
			System.out.print(x+" ");
	}

	private static void bubbleSort(int[] a) {
		
		int temp;
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length-1-i;j++)
			if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}

}
