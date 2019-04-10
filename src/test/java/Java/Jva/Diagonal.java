package Java.Jva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Diagonal {
	
	public void testData()
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] val = new int[n][n];
		//int i,j;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				val[i][j]= sc.nextInt();	
			}
			}
			
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(val[i][j]);
				}
				else if(i+j==n-1)
				{
					System.out.print(val[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
				
				}
			System.out.println();
			}
	}
	
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		Diagonal d = new Diagonal();
		d.testData();
		
	}
}
