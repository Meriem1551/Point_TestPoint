package point;

public class Dessin {
    Rectangle[] rectangles;
    int size;
    static int index = 0;

    public Dessin(int size) {
        this.size = size;
        rectangles = new Rectangle[size];
    }

    public void ajouter(Rectangle r) {
        if (index < this.size) {
            rectangles[index] = r;
            index++;
        } else
            System.out.println("Size out of range");
    }

    public float somme() {
        int sum = 0;
        for (Rectangle r : rectangles) {
            sum += r.surface();
        }
        return sum;
    }
}
