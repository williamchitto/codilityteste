import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GapSize {

	public int solution(int N) {

		System.out.println(Integer.toBinaryString(N));
		char[] array = Integer.toBinaryString(N).toCharArray();
		boolean isGap =false;
		int gapSize = 0;
		List<Integer> gaps = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '1') {
				if(isGap){
				gaps.add(gapSize);
				gapSize =0;
				isGap = false;
				}
			} else {
				isGap = true;
				gapSize++;
			}

		}
		System.out.println(gaps);
		return Collections.max(gaps);
	}

	public static void main(String[] args) {
		System.out.println("" + new GapSize().solution(10005));
	}
}
