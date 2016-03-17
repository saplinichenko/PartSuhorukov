package partTwo;

public class MatrixTest {

	public static void main(String[] args) {
		MatrixClass matrix1 = new MatrixClass(); //�������� ������� ��� ��������� 3x3
		MatrixClass matrix2 = new MatrixClass(3, 3); //�������������� ������� ������ �������� � �������
		MatrixClass summ;
		MatrixClass diff; 
		MatrixClass multNum;
		int matrixMultiplier = 6; //��������� ������� (����� �������� �� �����)
		
		System.out.println("������������ ������ ������������� �������: " + matrix1.getVerticalSize());
		System.out.println("�������������� ������ ������������� �������: " + matrix1.getHorizontalSize());
		matrix1.printMatrix(matrix1);

		System.out.println("������������ ������ ��������������� �������: " + matrix2.getVerticalSize());
		System.out.println("�������������� ������ ��������������� �������: " + matrix2.getHorizontalSize());
		matrix2.printMatrix(matrix2);

		
		summ = matrix1.sumMatrix(matrix2);
		diff = matrix1.diffMatrix(matrix2);
		
		if (summ != null && diff != null) {
			System.out.println("����� ������ �����: ");
			matrix2.printMatrix(summ);
			System.out.println("�������� ������ �����: ");
			matrix2.printMatrix(diff);
		} else {
			System.out.println("������� ������ �� ���������. �������� � �������� ����������");
		}
		
		multNum = matrix1.matrixMultNumber(matrix1, matrixMultiplier);
		System.out.println("��������� ������� �� �����: ");
		matrix1.printMatrix(multNum);
	}

}
