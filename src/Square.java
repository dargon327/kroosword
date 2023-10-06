public class Square {
    private boolean black;
    private int num;
    public Square(boolean isBlack, int num)
    {
        black = isBlack;
        this.num = num;

    }

    public int getNum() {
        return num;
    }

    public boolean isBlack() {
        return black;
    }
}