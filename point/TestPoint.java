package point;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // FIRST PART: EXO 2
            System.out.println("================== SOLUTION OF EXO 2 =======================");
            Point P = new Point(5, 3);
            P.addNumber(2, 4);
            System.out.println("New coordinates are: x= " + P.getX() + " y=" + P.getY());

            // SECOND PART: EXO 3
            System.out.println("=================== SOLUTION OF EXO 3 ======================");
            // FIRST RECTANGLE
            System.out.println("Enter x1 and y1 for first point");
            float x1 = scanner.nextFloat();
            float y1 = scanner.nextFloat();
            System.out.println("Enter x2 and y2 for second point");
            float x2 = scanner.nextFloat();
            float y2 = scanner.nextFloat();
            Point P1 = new Point(x1, y1);
            Point P2 = new Point(x2, y2);
            Rectangle R1 = new Rectangle(P1, P2);
            System.out.println("Area of the first rectangle is: " + R1.surface());
            System.out.println("================ SOLUTION OF EXO 4 =========================");
            // THIRD PART: EXO 4
            System.out.println("Enter x3 and y3 for third point");
            float x3 = scanner.nextFloat();
            float y3 = scanner.nextFloat();
            System.out.println("Enter x4 and y4 for fourth point");
            float x4 = scanner.nextFloat();
            float y4 = scanner.nextFloat();
            Point P3 = new Point(x3, y3);
            Point P4 = new Point(x4, y4);
            Rectangle R2 = new Rectangle(P3, P4);
            Rectangle R3 = new Rectangle(P3, P4);
            Rectangle R4 = new Rectangle(P1, P2);
            Dessin D1 = new Dessin(4);
            D1.ajouter(R1);
            D1.ajouter(R2);
            D1.ajouter(R3);
            D1.ajouter(R4);
            System.out.println("Sum of areas is: " + D1.somme());
        }
        // number of objects
        System.out.println("You created " + Rectangle.nbr + " objects");
    }
}
