package Billiard;

public class Ball {

    int x;
    int y;

    public Ball(int x, int y){

        this.x = x;
        this.y = y;

    }

    public void getCoordinates(){


        System.out.println(this.x + " " + this.y);
    }



    public void moveUp(){

        this.y=y+1;
        }


    public void ballDown(){
        this.y=y-1;
    }

    public void ballLeft(){
        this.x=x-1;
    }

    public void ballRight(){
        this.x=x+1;
    }

    public void freeMotion(int finalX, int finalY) {

        this.x = finalX;
        this.y = finalY;


    }

}
