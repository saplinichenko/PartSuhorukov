package classColl2;

import java.util.*;

public class CollUnion {

	public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<Integer>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}
}
