package partTwo;

import java.util.Random;

public class MatrixClass {
	int n = 0;
	int m = 0;
	final Random random  = new Random();
	private int[][]  matrixArr;

	MatrixClass() {
		n = 3;
		m = 3;
		matrixArr  = fillingMatrix(n, m);
	}

	MatrixClass(int n, int m) {
		this.n = n;
		this.m = m;
		matrixArr = fillingMatrix(n, m);
	}

	// ���������� ������ ��� ���������� ������� ���������� �������
	// ���������� ������: int [][].

	public int[][] fillingMatrix(int n, int m) {
		int[][] tmpMatrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tmpMatrix[i][j] = (int) random.nextInt(50);
			}
		}
		return tmpMatrix;
	}

	// ����� ������ �� ����� ����������� �������
	public void printMatrix(MatrixClass tmpMatrix) {
		System.out.println("==================");
		for (int i = 0; i < tmpMatrix.matrixArr.length; i++) {
			for (int j = 0; j < tmpMatrix.matrixArr[0].length; j++) {

				System.out.print(tmpMatrix.matrixArr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

	// ��������� ���� ������. �� ���� ������ ���������� ������.
	public int compare(MatrixClass tmpMatrix) {
		if (this.matrixArr.length == tmpMatrix.matrixArr.length
				&& this.matrixArr [0].length == tmpMatrix.matrixArr [0].length) {
			return 1;// ���� ������� ����� ���������� 1
			
		} else {
			return 0;// ���� �� ����� - ���������� 0;
		}
	}
	//����� ������. �������� ����� ������� ������ �����
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
	//�������� ������. �������� ����� ������� ������ �����
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

	// ��������� ������� �� �����. ���������� ������
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

	public int getVerticalSize() {
		return this.matrixArr.length;
	}

	public int getHorizontalSize() {
		return this.matrixArr[0].length;
	}
}
