public class Rectangle2 {

        private double largo;
        private double alto;

        public Rectangle2(double lr, double hr) {
            largo = lr;
            alto = hr;
        }

        public static void main(String[] args) {
            Rectangle2 r1 = new Rectangle2(2, 1);
            Rectangle2 r2 = new Rectangle2(2, 1);

            System.out.println(r1 == r2);
            System.out.println(r1.equals(r2));
            System.out.println(r2.equals(r1));
    }

    // Opcións
//            1. true
//               true
//               true
//            2. true
//               false
//               false
//            3. false
//               false
//               false
//            4. false
//               true
//               true
}
