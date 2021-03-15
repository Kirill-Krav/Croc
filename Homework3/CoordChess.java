package Homework3;

public class CoordChess{

    int x;
    int y;

    CoordChess(int x, int y) throws IllegalAccessException {
        if(x < 0 || x > 7 || y < 0 || y > 7){
            throw new IllegalAccessException("неправильные координаты");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) throws IllegalAccessException {
        if(x < 0 || x > 7){
            throw new IllegalAccessException("неправильные координата");
        }
        this.x = x;
    }

    public void setY(int y) throws IllegalAccessException {
        if(y < 0 || y > 7){
            throw new IllegalAccessException("неправильные координата");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return new String(String.valueOf((char)(x + 'a')) + String.valueOf((char)(y + '1')));
    }
}
