package partTwo;

import java.util.Random;

public class MatrixClass {
	int n = 0;
	int m = 0;
	final Random random = new Random();
	private int[][] matrixArr;

	MatrixClass() {
		n = 3;
		m = 3;
		matrixArr = fillingMatrix(n, m);
	}

	MatrixClass(int n, int m) {
		this.n = n;
		this.m = m;
		matrixArr = fillingMatrix(n, m);
	}

	// Реализация метода для заполнения массива случайными числами
	// возвращаем массив: int [][].

	public int[][] fillingMatrix(int n, int m) {
		int[][] tmpMatrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tmpMatrix[i][j] = (int) random.nextInt(50);
			}
		}
		return tmpMatrix;
	}

	// Метод вывода на экран содержимого матрицы
	public static void printMatrix(MatrixClass tmpMatrix) {
		System.out.println("==================");
		for (int i = 0; i < tmpMatrix.matrixArr.length; i++) {
			for (int j = 0; j < tmpMatrix.matrixArr[0].length; j++) {

				System.out.print(tmpMatrix.matrixArr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

	// сравнение двух матриц. На вход метода отправляем объект.
	public int compare(MatrixClass tmpMatrix) {
		if (this.matrixArr.length == tmpMatrix.matrixArr.length
				&& this.matrixArr[0].length == tmpMatrix.matrixArr[0].length) {
			return 1;// Если матрицы равны возвращаем 1

		} else {
			return 0;// Если не равны - возвращаем 0;
		}
	}

	// Сумма матриц. Возможна когда размеры матриц равны
	public MatrixClass sumMatrix(MatrixClass matrixSecond) {
		MatrixClass result = new MatrixClass();
		if (this.compare(matrixSecond) == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					result.matrixArr[i][j] = this.matrixArr[i][j] + matrixSecond.matrixArr[i][j];
				}
			}
			return result;
		} else {
			return null;
		}
	}

	// Разность матриц. Возможно когда размеры матриц равны
	public MatrixClass diffMatrix(MatrixClass matrixSecond) {
		MatrixClass result = new MatrixClass();
		if (this.compare(matrixSecond) == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					result.matrixArr[i][j] = this.matrixArr[i][j] - matrixSecond.matrixArr[i][j];
				}
			}
			return result;
		} else {
			return null;
		}
	}

	// Умножение матрицы на число. Возвращаем объект
	public MatrixClass matrixMultNumber(MatrixClass matrixSecond, int num) {
		int n = matrixSecond.getVerticalSize();
		int m = matrixSecond.getHorizontalSize();
		MatrixClass result = new MatrixClass(n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result.matrixArr[i][j] = matrixSecond.matrixArr[i][j] * num;
			}
		}
		return result;
	}

	// Определитель матрицы
	// Используем метод разложения по строке или столбцу
	// Так как в условии задачи дефолтная матрица 3х3, то допольнительные
	// условия проверки не стал вставлять

	public static int determinantMatrix(MatrixClass otherMtx) {
		int determinant = 9999999; // на всякий случай, для проверки
		int tmpDet1 = 0;
		int tmpDet2 = 0;
		int tmpDet3 = 0;
		int size = otherMtx.matrixArr.length;
		int[][] tmpArr = new int[size][size];
		tmpArr = otherMtx.matrixArr;

		for (int i = 0; i < tmpArr.length; i++) {
			for (int j = 0; j < tmpArr.length; j++) {

				if (i == 0 && j == 0) {
					tmpDet1 = (int) Math.pow(-1.0, 2.0) * (tmpArr[1][1] * tmpArr[2][2] - tmpArr[2][1] * tmpArr[1][2]);
				}
				if (i == 1 && j == 0) {
					tmpDet2 = (int) Math.pow(-1.0, 3.0) * (tmpArr[0][1] * tmpArr[2][2] - tmpArr[2][1] * tmpArr[2][1]);
				}
				if (i == 2 && j == 0) {
					tmpDet3 = (int) Math.pow(-1.0, 4.0) * (tmpArr[0][1] * tmpArr[1][2] - tmpArr[1][1] * tmpArr[0][2]);
				}

			}

		}
		determinant = tmpDet1 + tmpDet2 + tmpDet3;
		return determinant;

	}

	// метод инвертирования квадратной матрицы второго порядка. Статический. Без
	// параметров
	public void invertMatrix() {
		MatrixClass tmpMatrix = new MatrixClass(2, 2);
		MatrixClass iMatrix = new MatrixClass(2, 2);

		if (MatrixClass.determinantMatrix(tmpMatrix) != 0) {
			iMatrix.matrixArr[0][0] = tmpMatrix.matrixArr[1][1];
			iMatrix.matrixArr[1][1] = tmpMatrix.matrixArr[0][0];
			iMatrix.matrixArr[1][0] = tmpMatrix.matrixArr[0][1];
			iMatrix.matrixArr[0][1] = tmpMatrix.matrixArr[1][0];

		} else {

			System.out.println("Инвертирование невозможно. Определитель матрицы равено 0");
		}

	}

	// метод возврата единичной матрицы третьего порядка
	// через статичное поле и метод
	public static MatrixClass identityMatrix( ) {
		MatrixClass identMatrix = new MatrixClass(3,3);
		for (int i = 0; i < identMatrix.matrixArr.length; i++) {
			for (int j = 0; j < identMatrix.matrixArr.length; j++) {
				if (i == j) {
					identMatrix.matrixArr[i][j] = 1;
				}else {
					identMatrix.matrixArr[i][j] = 0;
				}

			}
		}
		return identMatrix;
	}

	public int getVerticalSize() {
		return this.matrixArr.length;
	}

	public int getHorizontalSize() {
		return this.matrixArr[0].length;
	}

}
