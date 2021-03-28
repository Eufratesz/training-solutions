package abstractclass.gamecharacter;

public class Point {

    final private long x;
    final private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point anotherPoint) {
        return (long) Math.sqrt(
                        Math.pow((double) x - anotherPoint.getX(), 2) +     //a 2. paraméterben megadott hatványra emeli.
                        Math.pow((double) y - anotherPoint.getY(), 2)
        );
    }
}
