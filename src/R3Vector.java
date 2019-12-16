import java.awt.*;

public class R3Vector {

    private double x,y,z;

    public R3Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void out(){
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public R3Vector sum(R3Vector a){
        return new R3Vector(x + a.x, y + a.y, z + a.z);
    }

    public static R3Vector sum(R3Vector a, R3Vector b){
        return new R3Vector(b.x + a.x, b.y + a.y, b.z + a.z);
    }
    public static R3Vector scale(double k, R3Vector a){
        a.x *= k;
        a.y *= k;
        a.z *= k;
        return new R3Vector(a.x, a.y, a.z);

    }

    public void translate(double x, double y, double z){
        this.x += x;
        this.y += y;
        this.z +=z;

    }

    public static  double  scalar(R3Vector a, R3Vector b){
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }

    public  static R3Vector vector(R3Vector a, R3Vector b){
        return new R3Vector(a.y*b.z - a.z*b.y, a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
    }

    public void rotateZ(double u){
        u *= Math.PI/180;
        double x = this.x * Math.cos(u) - this.y * Math.sin(u);
        double y = this.x * Math.sin(u) + this.y * Math.cos(u);
        this.x=x;
        this.y=y;
    }

    public void rotateY(double u){
        u *= Math.PI/180;

        double x = this.x*Math.cos(u) - this.z*Math.sin(u);
        double z = this.z*Math.cos(u) - this.x*Math.sin(u);

        this.x=x;
        this.z=z;
    }

    public void rotateX(double u){
        u *= Math.PI/180;

        double y = this.y*Math.cos(u) - this.z*Math.sin(u);
        double z = this.z*Math.cos(u) - this.y*Math.sin(u);

        this.y=y;
        this.z=z;
    }

    public void rotate(double u_x, double u_y, double u_z){
        this.rotateX(u_x);
        this.rotateY(u_y);
        this.rotateZ(u_z);
    }

    public double GetX(){
        return this.x;
    }

    public double GetY(){
        return this.y;
    }

    public double GetZ(){
        return this.z;
    }
}