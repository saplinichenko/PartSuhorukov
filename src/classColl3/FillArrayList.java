package classColl3;

import java.util.*;

public class FillArrayList {

	static void fillList(List<String> tmpList) {
		// Воспользовался итератором при заполнении коллекции
		for (ListIterator<String> iter = tmpList.listIterator(); tmpList.size() < 70;) {
			final Random random = new Random();
			final Random randomArr = new Random();
			final String[] name = { "Саша", "Петя", "Ваня", "Коля", "Дима", "Женя", "Миша", "Виталя" };
			if ((iter.nextIndex() % 2) == 0) {
				iter.add(name[randomArr.nextInt(7)] + " собрал " + random.nextInt(500) + " марок");
			} else {
				// Для нагрядности "Петров Петр"! и "МАРОК" в верхнем регистре
				// в данном поле менятеся только число получаемое при помощи
				// Random
				iter.add("Петров Петр" + " собрал " + random.nextInt(500) + " МАРОК");
			}

		}
	}
}
