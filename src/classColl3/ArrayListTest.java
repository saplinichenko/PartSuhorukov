package classColl3;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();

		FillArrayList.fillList(strList); // зполняем коллекцию

		// выводим на экран коллекция
		System.out.println("Заполненная коллекция:");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(i + ". " + strList.get(i));
		}
		//метод класса RemoveArrayList который удаляет все поля с четным индексом
		RemoveArrayList.removeList(strList);

		//Выводим на экран скорректированную коллекцию
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));

		}

	}
}
