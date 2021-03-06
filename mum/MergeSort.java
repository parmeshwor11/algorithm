package algorithm.mum;

public class MergeSort {
	
	static int [] A = {3,7,9,1,2,4,99,10,11};
	static int[] Aux = new int[A.length];
	public static void main(String[] args) {
		
		mergeSort(A,Aux,0,A.length-1);
		for(int x:A)
		System.out.print(x+" ");
	}
	
	static void mergeSort(int[] A,int[] Aux,int lo, int hi){
		
		if(hi<=lo)
			return;
		
		    int mid = lo + (hi - lo) / 2;
			mergeSort(A,Aux,lo,mid);
			mergeSort(A,Aux,mid+1,hi);
			merge(A,Aux,lo,mid,hi);
				
	}

	private static void merge(int[] a, int[] aux,int lo, int mid, int hi) {
		
		 // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k]; 
        }
        
        int i = lo; int j = mid+1;
		
		for(int k=lo;k<=hi;k++){
			if(i>mid)                 a[k] = aux[j++];
			else if(j>hi)             a[k] = aux[i++];
			else if (aux[j]<aux[i])   a[k] = aux[j++];
			else                      a[k] = aux[i++];
		}
		
		
		
		
	}

}
