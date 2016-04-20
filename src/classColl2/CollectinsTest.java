package classColl2;

import java.util.*;

public class CollectinsTest {
	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> setUnion = new HashSet<Integer>();
		Set<Integer> setIntersect = new HashSet<Integer>();

		// Заполняем коллекции (вызываем статиченую функцию класса FillSet);
		FillSet.fillset(set1, 20);
		FillSet.fillset(set2, 22);
		setUnion = CollUnion.union(set1, set2);
		setIntersect = CollInter.intersect(set1, set2);
		
		// Выводим на экран
		printSets(set1, "Коллекция N1");
		printSets(set2, "Коллекция N2");
		printSets(setUnion, "Объединение");
		printSets(setIntersect, "Пересечение");

	}

	// Ф-я вывода коллекции
	public static void printSets(Collection<Integer> tmpSet, String name) {
		System.out.println(name + ": " + tmpSet + "\n--------------");

	}
}
