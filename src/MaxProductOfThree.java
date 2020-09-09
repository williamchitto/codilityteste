
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxProductOfThree {
	
	  public int solution(int[] A) {
	        Arrays.sort(A);
	        int product = 1;
	        if(A.length == 0) return 0;
	        for(int i= A.length -1 ; i > A.length - 4 ; i-- ){
	            product *= A[i];
	        }
	        
	        if(A[0] < 0 && A[1] < 0) {
	            product = (A[0]*A[1]*A[A.length-1]) > product ?(A[0]*A[1]*A[A.length-1]):product;
	        }
	        
	        return product;
	        
	  }      
	     
}
