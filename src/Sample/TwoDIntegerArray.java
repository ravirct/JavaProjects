package Sample;

public class TwoDIntegerArray {

	public static void main(String[] args) {
		
//	//int[][] matrix= {
//				{1, 2, 3},
//				{5, 6, 7},
//				{8, 6, 7}
//	};
						
		int[][] matrix2= new int[4][3];
		
		// Assigning matrix
		for (int i=0; i<matrix2.length; i++)
			for(int j=0; j<matrix2[i].length; j++)
			   matrix2[i][j]=i+j;
		
		//Printing matrix
		 System.out.print("Matrix is:\n");
		for (int i=0; i<matrix2.length; i++)
		{
			for(int j=0; j<matrix2[i].length; j++)
			System.out.print(" "+matrix2[i][j]);
			System.out.println("");			
		}

	}
}
