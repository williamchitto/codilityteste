import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Distincts {

	
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 	Set<Integer> distincts = new HashSet<Integer>();
		 for (int i = 0; i < A.length; i++) {
			distincts.add(A[i]);
		}
	        return distincts.size();
	    }
	}

