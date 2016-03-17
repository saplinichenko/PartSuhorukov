package partTwo;

public class MatrixTest {

	public static void main(String[] args) {
		MatrixClass matrix1 = new MatrixClass(); //Основная матрица без параметро 3x3
		MatrixClass matrix2 = new MatrixClass(3, 3); //Дополнительная матрица размер передаем в скобках
		MatrixClass summ;
		MatrixClass diff; 
		MatrixClass multNum;
		int matrixMultiplier = 6; //множитель матрицы (когда умножаем на число)
		
		System.out.println("Вертикальный размер умолчательной матрицы: " + matrix1.getVerticalSize());
		System.out.println("Горизонтальный размер умолчательной матрицы: " + matrix1.getHorizontalSize());
		matrix1.printMatrix(matrix1);

		System.out.println("Вертикальный размер вспомогательной матрицы: " + matrix2.getVerticalSize());
		System.out.println("Горизонтальный размер вспомогательной матрицы: " + matrix2.getHorizontalSize());
		matrix2.printMatrix(matrix2);

		
		summ = matrix1.sumMatrix(matrix2);
		diff = matrix1.diffMatrix(matrix2);
		
		if (summ != null && diff != null) {
			System.out.println("Сумма матриц равна: ");
			matrix2.printMatrix(summ);
			System.out.println("Разность матриц равна: ");
			matrix2.printMatrix(diff);
		} else {
			System.out.println("Размеры матриц не совпадают. Сложение и разность невозможны");
		}
		
		multNum = matrix1.matrixMultNumber(matrix1, matrixMultiplier);
		System.out.println("Умножение матрицы на число: ");
		matrix1.printMatrix(multNum);
	}

}
