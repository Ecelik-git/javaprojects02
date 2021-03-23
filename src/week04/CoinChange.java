package week04;

public class CoinChange {

	public static void main(String[] args) {
//		Given a value N, if we want to make change for N cents, 
//		and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, 
//		how many ways can we make the change? The order of coins doesn’t matter.
//		For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. 
//		So output should be 4. For N = 10 and S = {2, 5, 3, 6}, 
//		there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. 
//		So the output should be 5.
		
		int arr1[] = {1, 2, 3}; 
        int m = arr1.length; 
        System.out.println( count(arr1, m, 4));

	}
	//S is the array, m solution count, N is the cent, m is the length of arr
	public static int count(int S[], int m, int N) {
		int arr[]=new int[N+1]; 
		  
	    
	    arr[0] = 1; 
	  
	    
	    for(int i=0; i<m; i++) 
	        for(int j=S[i]; j<=N; j++) 
	            arr[j] += arr[j-S[i]]; 
	  
	    return arr[N]; 
	}
}
