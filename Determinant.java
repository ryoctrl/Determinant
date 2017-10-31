
public class Determinant {
	private double[][] matrix;
	
	public Determinant(double[][] matrix){
		this.matrix = matrix;
	}
	
	public void printMatrix(){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j]);
				if(j == matrix[i].length - 1) break;
				System.out.print(",");
			}
			System.out.println("");
		}
	}
	
	public double calcDeterminant(){
		printMatrix();
		System.out.println("\n");
		for(int i = 0; i < matrix.length; i++){
			if(i == matrix.length -1){
				break;
			}
			
			for(int j = 0; j < matrix[i].length; j++){
				double[] tmpRow = matrix[i];
				double seed = matrix[i+1][i]/matrix[i][i];
				
				matrix[i+1][j] -= tmpRow[j] * seed;
			}
		}
		/*
		double ans = 1;
		for(int i = 0; i < matrix.length; i++){
			ans *= matrix[i][i];
		}*/
		printMatrix();
		double ans = 0;
		return ans;
	}
	
	public static void main(String[] args){
		double[] row1 = {2, 0, -1, 1};
		double[] row2 = {1, -1, 2, 3};
		double[] row3 = {3, 2, 0, -1};
		double[] row4 = {-1, 1, 3, 2};
		
		double matrix[][] = {row1, row2, row3, row4};
		
		Determinant d = new Determinant(matrix);
		
		System.out.print(d.calcDeterminant());
	}
}
