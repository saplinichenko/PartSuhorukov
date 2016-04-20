package classColl3;

import java.util.*;

public class RemoveArrayList {

	public static void removeList(List<String> tmpList) {
		for (ListIterator<String> iterList = tmpList.listIterator(); iterList.hasNext();) {

			String s = iterList.next(); // возвращаем значение поля в итерации
			int index = tmpList.indexOf(s); // Определяем номер индекса по
											// значению
			if (index % 2 == 0) {
				iterList.set(null);// значения полей с четными индексами
									// заменяем null
			}

		} 
		//Удаляем все поля которые null
		for (ListIterator<String> iterList = tmpList.listIterator(); iterList.hasNext();) {
			if (iterList.next()== null) {
				iterList.remove(); 
			}
		}

	}
}
