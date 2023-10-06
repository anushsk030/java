/*
 * File         :   MultiplicationOfMatrices.java
 * Description  :  Java program to Multiply to Matrices
 * Author       :  Anush S Kumar 
 * Version      :  1.0
 * Date         :06/10/2023   
*/




import java.util.Scanner;
public class MultiplicationOfMatrices {
	public static void main(String[] args) {
		int ROW1,ROW2,COL1,COL2,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of first matrix");
		//get the order first matrix
		ROW1=sc.nextInt();
		COL1=sc.nextInt();
		System.out.println("enter the order of second matrix");
		//get the order 
		ROW2=sc.nextInt();
		COL2=sc.nextInt();
		int[][] matrix1=new int[ROW1][COL1];
		int[][] matrix2=new int[ROW2][COL2];
		int[][] matrix3=new int[ROW2][COL1];
		if(ROW2==COL1) {
			//Get the input from user
			System.out.println("enter the elements of first matrix");			
			for(i=0;i<ROW1;i++) {
				for(j=0;j<COL1;j++) {
					matrix1[i][j]=sc.nextInt();
				}
			}
				System.out.println("Enter the elemnts of second matrix");
				for(i=0;i<ROW2;i++){
					for(j=0;j<COL2;j++) {
						matrix2[i][j]=sc.nextInt();
					}
				}
				for(i=0;i<ROW1;i++) {
					for(j=0;j<COL2;j++) {
						matrix3[i][j]=0;
						for(k=0;k<ROW2;k++) {
							matrix3[i][j]=matrix3[i][j]+(matrix1[i][k]*matrix2[k][j]);
						}
						System.out.print(matrix3[i][j]+" ");
						
					}
					System.out.println("\n");
				}
				
					
				
				
				
			}
		else {
			System.out.println("not possible");
		}
		
		}
	}
			
	



