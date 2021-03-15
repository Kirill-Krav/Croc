package Homework3;

public class Main {

    public static void main(String[] args){
        CoordChess coord;
        try {
            coord = new CoordChess(1, 1);
        } catch (IllegalAccessException e) {
            System.out.println(e);
            return;
        }
        System.out.println(coord);
    }
}
