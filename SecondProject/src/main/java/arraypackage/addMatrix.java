package arraypackage;

public class addMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[][] {{1,1},{2,2}};
		int b[][]=new int[][] {{1,1},{2,2}};
		
		
		
		
		int sum[][]=new int[2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
