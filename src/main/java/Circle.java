public class Circle {
        private double radius;

        public void setRadius(double r) {
            radius = r;
        }

        public double getRadius() {
            return radius;
        }

        public static void main(String[] args) {
            Circle c1 = new Circle();
            Circle c2 = new Circle();

            c1.setRadius(5.0);
            c2 = c1;
            c1.setRadius(c2.getRadius());

            System.out.println(c1.getRadius() + ", " + c2.getRadius());
    }

// Resultados
//            1. 5.0, 0.0
//            2. 0.0, 5.0
//            3. 0.0, 0.0
//            4. 5.0, 5.0

}
