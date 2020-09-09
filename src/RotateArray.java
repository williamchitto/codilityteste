import java.util.Arrays;

public class RotateArray {
	 public int[] solution(int[] A, int K) {
		 if(A.length==0)
		 {
			 return new int[0];
		 }
	     for(int i = 0; i < K; i++){    
	            int j, last;    
	            //Stores the last element of array    
	            last = A[A.length-1];    
	            
	            for(j = A.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                A[j] = A[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            A[0] = last;    
	        }  
	     System.out.println(Arrays.toString(A));
	        return A;
	    }
	 
		public static void main(String[] args) {
			System.out.println("" + new RotateArray().solution(new int[0], 1));
		}
}
