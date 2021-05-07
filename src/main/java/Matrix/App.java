package Matrix;public class App {

    public static void main(String[] args) {


                Matrix m1 = new Matrix ( 3,3 );
                m1.setValueAt (1,1,1);
                m1.setValueAt(1,2 ,2);
                m1.setValueAt (3,3,64 );
                m1.print ();

                Matrix m2 = new Matrix (3,3);
                m2.identity() ; //проверить
                m1.addMatrix(m2);
               // m2.transpose();
        System.out.println("=========");
                m1.print() ;
                m1.transpose();
        System.out.println("=========");
                m1.print();




            }
        }