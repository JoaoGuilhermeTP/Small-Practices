import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {

    // Create an arraylist object to store objects of the type "Rectangle"
    ArrayList<Rectangle> lista = new ArrayList<Rectangle>();
    
    // Add four new Rectangle objects into arraylist object
    lista.add(new Rectangle(10.5f, 20f));
    lista.add(new Rectangle());
    lista.add(new Rectangle(5f, 15f, new Point(5f, 2f)));
    lista.add(new Rectangle(new Point(5f, 2f)));

    // Print the area of each Rectangle
    for (int i = 0; i < lista.size(); i++) {
      System.out.println("The area of the rectangle at index " + i + " is: " + lista.get(i).calcularArea());
    }

    // Rectangles at index 2 and 3 share the same point, therefore they intersect each other
    System.out.println(lista.get(2).temInterseccao(lista.get(3)));
  }
}