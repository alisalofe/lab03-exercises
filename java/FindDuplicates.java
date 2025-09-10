import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
        Set<Integer> s = new HashSet<>();
	for (int i = 0; i < l.size() - 1; i++) {
       		for (int j = i + 1; j < l.size(); j++)  {
			if ( l.get(i).equals(l.get(j))) {
			       s.add(l.get(i));
			}	       
		}
   	}
	List<Integer> newL = new ArrayList<>(s);
   	return newL;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66)); //[5, 7]
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6)); //[5, 6, 4]
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0)); //[0]
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3)); //[]
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }

}
