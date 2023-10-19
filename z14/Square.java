public class Square{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public static Square equalSquare(Square s1, Square s2){
        double totalArea = s1.getSide()*s1.getSide() + s2.getSide()*s2.getSide();
        double resultSide = Math.sqrt(totalArea);
        return new Square(resultSide);
    }
}