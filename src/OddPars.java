import java.util.Arrays;


public class OddPars {
    public int solution(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i=i+2){
            if(A[i]!=A[i+1]){
                 return A[i];
            }
        }
        
       // (int) Math.ce(x, y)((double)divident / divisor);
        return A[A.length-1];
    }
    
    public static void main(String[] args) {
		System.out.println(" tsse" + new OddPars().solution(new int[] {1,3,5,7,8,9,9,4,3,1,5,7,8,4,6,6,10}));
	}
}
