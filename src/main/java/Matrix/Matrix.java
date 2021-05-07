package Matrix;

public class Matrix {

    int m;
    int n;
    int[][] matrix ;


    //Создание матрицы m x n и заполнение ее нулями
    public Matrix(int m, int n){
        this.m=m;
        this.n=n;
        matrix = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[m][n] = 0;
//            }
//        }

    }


    // задание конкретного значения конкретной ячейке
    public void setValueAt(int i, int j, int value){

        matrix[i-1][j-1] = value;
    }

    //распечатывание всей матрицы
    public void print() {

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j] + " "); //доделать вывод
            }
            System.out.println();

        }
    }


    //Приведение матрицы к единичному виду
    public void identity() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }


        }
    }


    //Сложение матриц
    public void addMatrix(Matrix matr) {

        int [][] result = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[i][j] + matr.matrix[i][j];
            }
        }
    }

    //Транспонировние матрицы
    public void transpose() {
        int[][] newMas = new int[n][m];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                newMas[j][i]= matrix [i][j];

            }
        }
        this.matrix = newMas;
    }



}
