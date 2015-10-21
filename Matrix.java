/**
* 	@author Rodrigo Galura III
*	@date_created 08-04-15
*/

class Matrix {
	/**
	* 	Matrix is just 4x4 multi dimensional array.
	* 	It is also a constant/final that SIZE variable
	*	does not change anymore
	*/
	private final int SIZE = 4;

	/* Matrix property */
	private int[][] matrix = new int[SIZE][SIZE];

	/**
	* 	Add two matrix then store it in property matrix
	* 	@param  Two Matrix Object
	* 	@return none
	*/
	public void addMatrices(Matrix A, Matrix B){
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				matrix[x][y] = A.getCell(x, y) + B.getCell(x, y);
			}
		}
	}

	/**
	* 	Set cell of matrix when this function called
	* 	@param  x - ROW of matrix cell
	* 			y - COLUMN of matrix cell
	* 			value - integer number stored
	* 	@return none
	*/
	public void setCell(int x, int y, int value) {
		matrix[x][y] = value;
	}

	/**
	* 	Get cell of matrix through ROW and COLUMN such as x and y
	* 	@param  x - ROW of matrix cell
	* 			y - COLUMN OF matrix cell
	*	@return value of matrix
	*/
	public int getCell(int x, int y) {
		return matrix[x][y];
	}

	/**
	* 	Display the value of matrix 4x4 format
	* 	@param  none
	*	@return none
	*/
	public void displayMatrix() {
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				System.out.print(matrix[x][y] + "\t");
			}
			System.out.println();
		}
	}
}