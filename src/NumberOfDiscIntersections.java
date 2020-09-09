
public class NumberOfDiscIntersections {
	   public int solution(int[] A) {
	        // write your code in Java SE 8
	        int intersect=0;
	        for (int w = 0; w < A.length; w++) {
	        	System.out.println("A["+w+"] = "+ A[w]);
	        }
	         for (int w = 0; w < A.length; w++) {
	        	 
	    	 for (int i = w; i < A.length; i++) {
	    	     if(i!=w){
	    	             System.out.println(""+A[w] +" < " +(A[i]+i) +" && " +A[w]+" > "+ (i-A[i]));
	    	           if(A[w] < (A[i]+i) && A[w]> (i-A[i])){
	    	             System.out.println(""+ w+ " - "+i);
	    	             intersect++;
	    	            }
	    	           if(intersect> 10000000)
	    	        	   
	    	           {
	    	        	   return -1;
	    	           }

	        	   
	          }
	         }
	         }
	    	 return intersect;
	    }
	   
	   //[1, 10, 100, 1]
	   
	   public static void main(String[] args) {
		System.out.println(new NumberOfDiscIntersections().solution(new int[] {1, 10, 100, 1}));
	}
}
