package interfac;

public class aggre {

    public class Square {
        private double sideLength;
    
        public Square(double sideLength) {
            this.sideLength = sideLength;
        }
    
        public double getSideLength() {
            return sideLength;
        }
    
        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }
    }
    
    public class SquareAreaCalculator {
        private Square square;
    
        public SquareAreaCalculator(Square square) {
            this.square = square;
        }
    
        public double calculateArea() {
            double sideLength = square.getSideLength();
            return sideLength * sideLength;
        }
    }
    
    
}
