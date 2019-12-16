import javax.swing.text.View;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.scale(100);
        cube.rotate(20,20,20);
        Viewer view = new Viewer(500,500,cube);
    }
}
