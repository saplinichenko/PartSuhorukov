package partTwo;

public class MatrixTest {

	public static void main(String[] args) {
		MatrixClass matrix1 = new MatrixClass();
		MatrixClass matrix2 = new MatrixClass(3, 3);
		MatrixClass summ;
		MatrixClass diff;
		MatrixClass multNum;
		MatrixClass identutyMatrix1= MatrixClass.identityMatrix();
		int matrixMultiplier = 6; // множитель матрицы (когда умножаем на число)

		System.out.println("Вертикальный размер умолчательной матрицы: " + matrix1.getVerticalSize());
		System.out.println("Горизонтальный размер умолчательной матрицы: " + matrix1.getHorizontalSize());
		MatrixClass.printMatrix(matrix1);

		System.out.println("Вертикальный размер вспомогательной матрицы: " + matrix2.getVerticalSize());
		System.out.println("Горизонтальный размер вспомогательной матрицы: " + matrix2.getHorizontalSize());
		MatrixClass.printMatrix(matrix2);


		summ = matrix1.sumMatrix(matrix2);
		diff = matrix1.diffMatrix(matrix2);

		if (summ != null && diff != null) {
			System.out.println("Сумма матриц равна: ");
			MatrixClass.printMatrix(summ);
			System.out.println("Разность матриц равна: ");
			MatrixClass.printMatrix(diff);
		} else {
			System.out.println("Размеры матриц не совпадают. Сложение и разность невозможны");
		}

		multNum = matrix1.matrixMultNumber(matrix1, matrixMultiplier);
		System.out.println("Умножение матрицы на число: ");
		MatrixClass.printMatrix(multNum);
		System.out.println("\n ===== \n Определитель матрицы равен: " + MatrixClass.determinantMatrix(matrix1));
		
		System.out.println("Единичная матрица: ");
		MatrixClass.printMatrix(identutyMatrix1);
		
	}
}
