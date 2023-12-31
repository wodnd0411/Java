package ch05;

// 행렬의 곱셈
public class MultiArrEx3 {

	public static void main(String[] args) {
		// 2x3 행렬
		int[][] m1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		// 3x2 행렬
		int[][] m2 = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		// m3는 2x2 행렬
		final int ROW = m1.length;
		final int COL = m2[0].length;
		int[][] m3 = new int[ROW][COL]; // m1 x m2
		
		// m1 x m2의 값을 m3에 저장
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				for(int k = 0; k < m2.length; k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		// m3 출력
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				System.out.printf("%d ", m3[i][j]);
			}
			
			System.out.println();
		}
	}

}
