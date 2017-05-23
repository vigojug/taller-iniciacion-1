public class Square {

        private double sideLength = 10.0;

        public Square() {}
        public Square(double sideLength) {
            this();
        }

        public double getSideLength() { return sideLength; }

    public static void main(String[] args) {
        Square sq = new Square(8.0);
        System.out.println(sq.getSideLength());
    }
}

// Resultado
// 1. 8.0
// 2. Non compila, a chamada a *this* non é valida
// 3. 10.0
// 4. 0
// 5. Non compila, *sideLength* non está inicializado
