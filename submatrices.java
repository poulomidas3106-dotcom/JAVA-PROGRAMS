import java.util.Scanner;

class Matrix {

    int rows, cols;
    int a[][];

    void getMatrix(Scanner sc) {

        System.out.print("Enter rows: ");
        rows = sc.nextInt();

        System.out.print("Enter columns: ");
        cols = sc.nextInt();

        a = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void subtract(Matrix m1, Matrix m2) {

        if(m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Subtraction not possible");
            return;
        }

        int result[][] = new int[m1.rows][m1.cols];

        for(int i = 0; i < m1.rows; i++) {
            for(int j = 0; j < m1.cols; j++) {
                result[i][j] = m1.a[i][j] - m2.a[i][j];
            }
        }

        System.out.println("Subtraction Result:");
        for(int i = 0; i < m1.rows; i++) {
            for(int j = 0; j < m1.cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class submatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix m3 = new Matrix();

        System.out.println("Enter First Matrix:");
        m1.getMatrix(sc);

        System.out.println("Enter Second Matrix:");
        m2.getMatrix(sc);

        m3.subtract(m1, m2);

        sc.close();
    }
}
