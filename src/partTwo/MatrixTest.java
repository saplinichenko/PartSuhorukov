package partTwo;

public class MatrixTest {

	public static void main(String[] args) {
		MatrixClass matrix1 = new MatrixClass();
		MatrixClass matrix2 = new MatrixClass(3, 3);
		MatrixClass summ;
		MatrixClass diff; 
		MatrixClass multNum;
		int matrixMultiplier = 6; //множитель матрицы (когда умножаем на число)
		
		System.out.println("¬ертикальный размер умолчательной матрицы: " + matrix1.getVerticalSize());
		System.out.println("√оризонтальный размер умолчательной матрицы: " + matrix1.getHorizontalSize());
		matrix1.printMatrix(matrix1);

		System.out.println("¬ертикальный размер вспомогательной матрицы: " + matrix2.getVerticalSize());
		System.out.println("√оризонтальный размер вспомогательной матрицы: " + matrix2.getHorizontalSize());
		matrix2.printMatrix(matrix2);

		
		summ = matrix1.sumMatrix(matrix2);
		diff = matrix1.diffMatrix(matrix2);
		
		if (summ != null && diff != null) {
			System.out.println("—умма матриц равна: ");
			matrix2.printMatrix(summ);
			System.out.println("–азность матриц равна: ");
			matrix2.printMatrix(diff);
		} else {
			System.out.println("–азмеры матриц не совпадают. —ложение и разность невозможны");
		}
		
		multNum = matrix1.matrixMultNumber(matrix1, matrixMultiplier);
		System.out.println("”множение матрицы на число: ");
		matrix1.printMatrix(multNum);
	}

}
