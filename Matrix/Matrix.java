import java.util.Scanner;
class Matrix{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Number of rows:");
int m=sc.nextInt();
System.out.println("Number of columns:");
int n=sc.nextInt();
int[][] mat1=new int[m][n];
int[][] mat2=new int[m][n];
int[][] summat=new int[m][n];
System.out.println("Enter first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
mat1[i][j]=sc.nextInt();
}

System.out.println("Enter second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
mat2[i][j]=sc.nextInt();
}
System.out.println("resultant matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
summat[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(summat[i][j]+"\t");  
}  
System.out.println();
}
}
}
