package holding;

public class TestArray {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][6];
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				arr[i][j] = i+j;
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<6;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println(arr.length);
	}
}
