package classColl2;

import java.util.*;

public class CollInter {

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {

		Set<Integer> result = new HashSet<Integer>();
		result.addAll(set1);
		result.retainAll(set2);

		return result;

	}
}
