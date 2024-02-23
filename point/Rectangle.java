package point;

public class Rectangle {
    Point pig; // point inferieur gauche
    Point psd; // point superieur droite
    static int nbr = 0;

    public Rectangle(float x1, float y1, float x2, float y2) {
        this.pig = new Point(x1, y1);
        this.psd = new Point(x2, y2);
        Rectangle.nbr += 1;
    }

    public Rectangle(Point p1, Point p2) {
        this.pig = p1;
        this.psd = p2;
        Rectangle.nbr += 1;
    }

    public float longeur() {
        return Math.abs(this.pig.getY() - this.psd.getY());
    }

    public float largeur() {
        return Math.abs(this.pig.getX() - this.psd.getX());
    }

    public float surface() {
        return longeur() * largeur();
    }
}
