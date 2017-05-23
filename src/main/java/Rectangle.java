
public class Rectangle {
    double largo;
    double alto;

    public Rectangle() {
        largo = 0.0;
        alto = 0.0;
    }

    public Rectangle(double lr, double hr) {
        largo = lr;
        alto = hr;
    }

    public Rectangle(Rectangle r) {
        largo = r.largo;
        alto = r.alto;
    }

    static public void main(String[] args) {

        // Rectangle r = new Rectangle(Rectangle(2, 10));

        // Rectangle r1 = new Rectangle();
        // Rectangle r2 = new Rectangle(r2);

        // Rectangle r = new Rectangle(Rectangle());

//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(r1);

//        Rectangle r1 = new Rectangle(2, 10);
//        Rectangle r2 = new Rectangle(r1);
//        Rectangle r3 = new Rectangle(r2);

//        Rectangle r = new Rectangle(10);

//        Rectangle r1 = new Rectangle(2, 10);
//        Rectangle r2 = new Rectangle(r1);

//        Rectangle r = new Rectangle(Rectangle(10, 2));

//        Rectangle r = new Rectangle();

//        Rectangle r = new Rectangle(2, 10);

    }
}

