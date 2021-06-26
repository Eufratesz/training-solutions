package aaa.week08;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metódusok az x illetve y értékének csökkentésére, növelésére (kvázi-setterek):
    public void increaseX(){
        x++;
    }

    public void decreaseX(){
        x--;
    }

    public void increaseY(){
        y++;
    }

    public void decreaseY(){
        y--;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
