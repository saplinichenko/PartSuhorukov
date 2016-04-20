package classColl2;

import java.util.*;

public class FillSet {

	static void fillset(Set<Integer> tmpSet, int size) {
		for (int i = 0; i <= size; i++) {
			tmpSet.add((int) (Math.random() * 99 + 1));

		}
	}

}
