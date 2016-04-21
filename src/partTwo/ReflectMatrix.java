package partTwo;

import java.lang.reflect.*;

public class ReflectMatrix {

	public static void reff(Class<?> cls) throws Exception {
		Method summ = null; // объект-метод для суммы
		Method printM = null; // объект-метод для печати
		Method diffMatrix = null; // объект-метод для разности

		// Выводим методы класса MatrixClass
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Имя метода: " + method.getName() + ";");
			System.out.println("Возвращаемый тип: " + method.getReturnType().getName());

			Class<?>[] paramTypes = method.getParameterTypes();
			System.out.print("Типы входных параметров: ");

			for (Class<?> paramType : paramTypes) {
				System.out.print(" " + paramType.getName());
			}
			System.out.println("\n");
		}

		// выводим поля класса MatrixClass
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			Class<?> fieldType = field.getType();
			System.out.println("Имя поля: " + field.getName() + "; Тип: " + fieldType.getName());
		}
		System.out.println();

		// Выводим конструкторы (наименования), а также параметры
		System.out.println("Конструкторы");
		Constructor<?>[] constructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			Class<?>[] paramTypes = constructor.getParameterTypes();
			for (Class<?> paramType : paramTypes) {
				System.out.print(paramType.getName() + " ");
			}
			System.out.println(constructor.getName() + " ");
		}

		// Создаем экземпляры данного калсса
		try {

			// создаем конструкторы
			Constructor<?> const1 = cls.getConstructor();
			const1.setAccessible(true);

			Constructor<?> const2 = cls.getConstructor(int.class, int.class);
			const2.setAccessible(true);

			// Создаем экземпляры
			Object matrix1 = (Object) const1.newInstance();
			Object matrix2 = (Object) const2.newInstance(3, 3);

			// "Вызываем" метод "sumMatrix" на объекте cls
			summ = cls.getMethod("sumMatrix", cls);

			// "Вызываем" метод "printMatrix" на объекте cls
			diffMatrix = cls.getMethod("diffMatrix", cls);

			// "Вызываем" метод "printMatrix" на объекте cls
			// printM = cls.getMethod("printMatrix", cls); - этого нам хватит
			// его метод public

			// Объявил метод private, поэтому использую getDeclaredMethod
			// и setAccessible(true)
			printM = cls.getDeclaredMethod("printMatrix", cls);
			printM.setAccessible(true);
			// Объекты для хранения аргументов при вызове invoke
			Object argsSumm = summ.invoke(matrix1, matrix2);
			Object argsDiff = diffMatrix.invoke(matrix1, matrix2);
			System.out.println("\nВызываем метод печати. Печатаем обе матрицы, затем их сумму и разность");
			printM.invoke(matrix1, matrix1); // Выводим одну матрицу
			printM.invoke(matrix2, matrix2); // Выводим вторую матрицу
			printM.invoke(matrix1, argsSumm); // Выводим сумму
			printM.invoke(matrix1, argsDiff); // Выводим разность

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
