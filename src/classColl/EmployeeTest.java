package classColl;

import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> arrEmployee = new ArrayList<Employee>(); // Список
		HashSet<Employee> setEmployee = new HashSet<Employee>(); // Множество
		ArrayDeque<Employee> queueEmployee = new ArrayDeque<Employee>(); // Очередь

		// Объекты для хранения времени выполнения методов (заполнения и вывода)
		WorkingHours arrTime = new WorkingHours(0, 0);
		WorkingHours setTime = new WorkingHours(0, 0);
		WorkingHours queueTime = new WorkingHours(0, 0);

		fillEmployee(arrEmployee, 100, arrTime); // Заполняем список 100
		fillEmployee(setEmployee, 100, setTime); // Заполняем Множество 
		fillEmployee(queueEmployee, 100, queueTime);// Заполняем очередь 

		printEmployee(arrEmployee, 5, arrTime); // Выводим список 
		System.err.println("-----------------------------");
		printEmployee(setEmployee, 2, setTime); // Выводим множество 
		System.err.println("-----------------------------");
		printEmployee(queueEmployee, 0, queueTime); // Выводим очередь

		//Вывод времени работы методов
		timeEmployee(arrTime);
		timeEmployee(setTime);
		timeEmployee(queueTime);

	}

	// Ф-я вывода коллекции
	public static void printEmployee(Collection<Employee> employees, int workAge, WorkingHours tmpObjTime) {

		// Время начала работы метода
		long timeStart = System.nanoTime();

		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee tmpObjIter = iterator.next();
			if (tmpObjIter.workAge >= workAge)
				System.out.println(tmpObjIter.name + ", Стаж работы: " + tmpObjIter.workAge);

		}

		// время окончания работы метода
		long timeEnd = System.nanoTime();
		tmpObjTime.timeStart = timeStart;
		tmpObjTime.timeEnd = timeEnd;
		tmpObjTime.triceTimeOut();

	}

	// Ф-я заполнения коллекции
	public static void fillEmployee(Collection<Employee> employees, int amountWorkers, WorkingHours tmpObjTime) {
		// имя типа коллекции
		String nameCollection = employees.getClass().getName().substring(10);

		// Время начала работы метода 
		long timeStart = System.nanoTime();
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
		// время окончания работы метода
		long timeEnd = System.nanoTime();
		tmpObjTime.nameCollection = nameCollection;
		tmpObjTime.timeStart = timeStart;
		tmpObjTime.timeEnd = timeEnd;
		tmpObjTime.triceTimeIn();
	}

	// Раситываем время работы ввода и вывода
	public static void timeEmployee(WorkingHours tmp) {
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		System.out.println(tmp.nameCollection + ".\nВремя заполнения (наносек): " + tmp.triceTimeIn
				+ ". Время вывода (наносек): " + tmp.triceTimeOut);

	}
}
