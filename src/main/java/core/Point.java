package core;

import java.lang.Math;

public class Point extends Entity {

    public Point() {
        this(0,0,0);
    }

    public Point(double x, double y, double z) {
       super(x,y,z);
    }

    public double distance(Point p){
       double result =(Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) + Math.pow(this.z - p.z, 2)));
       return  result;
    }
    public String toString(){
        return (" " + this.x + ", " + this.y + "," + this.z);

    }

    public void moveTo(double x, double y, double z){

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public void moveTo(Point p){
        moveTo(p.x,p.y,p.z);


    }


}
