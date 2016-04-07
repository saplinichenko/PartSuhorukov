package classColl;
 
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> arrEmployee = new ArrayList<Employee>(); // Список
		HashSet<Employee> setEmployee = new HashSet<Employee>(); // Множество
		ArrayDeque<Employee> queueEmployee = new ArrayDeque<Employee>(); // Очередь

		fillEmployee(arrEmployee, 100); // Заполняем список 100 работников
		fillEmployee(setEmployee, 50); // Заполняем Множество 50 работников
		fillEmployee(queueEmployee, 12);// Заполняем очередь 12 работников

		printEmployee(arrEmployee, 5);
		System.err.println("-----------------------------");
		printEmployee(setEmployee, 2);
		System.err.println("-----------------------------");
		printEmployee(queueEmployee, 0);

	}

	// Ф-я вывода коллекции
	public static void printEmployee(Collection<Employee> employees, int workAge) {
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee tmpObjIter = iterator.next();
			if (tmpObjIter.workAge >= workAge)
				System.out.println(tmpObjIter.name + ", Стаж работы: " + tmpObjIter.workAge);

		}

	}

	// Ф-я заполнения коллекции
	public static void fillEmployee(Collection<Employee> employees, int amountWorkers) {
		String[] f = { "Иванов", "Петров", "Сидоров", "Маслов" };
		String[] i = { "Сергей", "Иван", "Дмитрий", "Пётр" };
		String[] o = { "Михайлович", "Петрович", "Александрович", "Владимирович" };
		int tmpWorkAge = 0;
		final Random random = new Random();
		for (int k = 0; k < amountWorkers; k++) {
			String name = f[(int) random.nextInt(4)] + " " + i[(int) random.nextInt(4)] + " "
					+ o[(int) random.nextInt(4)];
			// Заполняем переменную стажа работы случайным часлом: от 1 до 8
			tmpWorkAge = (int) (Math.random() * 8 + 1);
			employees.add(new Employee(name, tmpWorkAge));
		}
	}

}
