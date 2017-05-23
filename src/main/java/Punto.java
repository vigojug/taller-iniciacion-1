public class Punto {

    private double x;
    private double y;

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public static void main(String[] args) {

        Punto p1 = new Punto();
        Punto p2 = new Punto();

        p1.setX(2.5);
        p2.setY(4.0);

        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());
    }

    // Opcions
    // 2.5, 4.0 e 2.5, 4.0
    // 2.5, 0.0 e 0.0, 4.0
    // 2.5, 0.0 e 2.5, 4.0
    // 2.5, 0.0 e 4.0, 0.0
}
