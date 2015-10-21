/**
* 	@author Rodrigo Galura III
*	@date_created 09-27-15
*/

class Tester {
	public static void main(String[] args) {
		Matrix A = new Matrix();
		Matrix B = new Matrix();

		Matrix C = new Matrix(); // stored here the sum of 2 matrix

		A.setCell(0, 0, 1);
		A.setCell(0, 1, 2);
		A.setCell(0, 2, 3);
		A.setCell(0, 3, 4);
		A.setCell(1, 0, 1);
		A.setCell(1, 1, 2);
		A.setCell(1, 2, 3);
		A.setCell(1, 3, 4);
		A.setCell(2, 0, 1);
		A.setCell(2, 1, 2);
		A.setCell(2, 2, 3);
		A.setCell(2, 3, 4);
		A.setCell(3, 0, 1);
		A.setCell(3, 1, 2);
		A.setCell(3, 2, 3);
		A.setCell(3, 3, 4);
		System.out.println("A Matrix");
		A.displayMatrix();

		System.out.println();

		B.setCell(0, 0, 5);
		B.setCell(0, 1, 6);
		B.setCell(0, 2, 7);
		B.setCell(0, 3, 8);
		B.setCell(1, 0, 5);
		B.setCell(1, 1, 6);
		B.setCell(1, 2, 7);
		B.setCell(1, 3, 8);
		B.setCell(2, 0, 5);
		B.setCell(2, 1, 6);
		B.setCell(2, 2, 7);
		B.setCell(2, 3, 8);
		B.setCell(3, 0, 5);
		B.setCell(3, 1, 6);
		B.setCell(3, 2, 7);
		B.setCell(3, 3, 8);
		System.out.println("B Matrix");
		B.displayMatrix();

		System.out.println();

		System.out.println("C Matrix which is the sum of A and B Matrix");
		C.addMatrices(A, B);
		C.displayMatrix();
	}
}