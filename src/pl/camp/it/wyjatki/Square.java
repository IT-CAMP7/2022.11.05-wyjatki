package pl.camp.it.wyjatki;

public class Square {
    private int side;

    public Square(int side) throws IncorrectSideException {
        if(side <= 0) {
            throw new IncorrectSideException("Side can not be less than 1: " + side);
            //throw new IllegalArgumentException();
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
