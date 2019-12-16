import java.awt.*;

public class Cube {
    private Facet[] facets;

    public Cube() {
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0 ,0), new R3Vector(1, 1,0), new R3Vector(0, 1, 0));
        facets[1] = new Facet(new R3Vector(1, 0, 0), new R3Vector(1, 0 ,1), new R3Vector(1, 1,1), new R3Vector(1, 1, 0));
        facets[2] = new Facet(new R3Vector(1, 0, 1), new R3Vector(1, 0 ,0), new R3Vector(0, 0,0), new R3Vector(0, 0, 1));
        facets[3] = new Facet(new R3Vector(0, 0, 0), new R3Vector(0, 1 ,0), new R3Vector(0, 1,1), new R3Vector(0, 0, 1));
        facets[4] = new Facet(new R3Vector(0, 1, 0), new R3Vector(1, 1 ,0), new R3Vector(1, 1,1), new R3Vector(0, 1, 1));
        facets[5] = new Facet(new R3Vector(0, 1, 1), new R3Vector(1, 1 ,1), new R3Vector(1, 0,1), new R3Vector(0, 0, 1));

    }

    public void rotate(double ux, double uy, double uz){
        for(int i=0; i<6; i++){
            facets[i].rotate(ux, uy, uz);
        }
    }
    public void scale(double k){
        for(int i=0; i<6; i++){
            facets[i].scale(k);
        }
    }
    public void translate(double x, double y, double z){
        for (int i=0; i<6; i++){
            facets[i].translate(x,y,z);
        }
    }
    public void draw(Graphics2D g){
        for(int i=0; i<6; i++){
            if(i == 0){
                g.setColor(Color.red);
            }
            if(i == 1){
                g.setColor(Color.white);
            }
            if(i == 2){
                g.setColor(Color.black);
            }if(i == 3){
                g.setColor(Color.yellow);
            }if(i == 4){
                g.setColor(Color.green);
            }
            if(i == 5){
                g.setColor(Color.blue);
            }


            facets[i].draw(g);
        }
    }
}