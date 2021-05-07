package Billiard;public class App {

    public static void main(String[] args) {

        BilliardTable BilliardTable1 = new BilliardTable(100, 100);
        Ball Ball1 = new Ball (50, 50);
        Ball1.moveUp();
        Ball1.ballDown();
        Ball1.ballLeft();
        Ball1.ballRight();
        Ball1.freeMotion(70, 70);
        Ball1.getCoordinates();

    }



}
