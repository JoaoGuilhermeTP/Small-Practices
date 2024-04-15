public class Rectangle {
  private float height;
  private float width;
  private Point Point;

  // Constructor with no arguments
  public Rectangle() {
    this.height = 0;
    this.width = 0;
  }

  // 
  public Rectangle(float a, float l) {
    this.height = a;
    this.width = l;
  }

  public Rectangle(Point o) {
    this.Point = o;
  }

  public Rectangle(float a, float l, Point o) {
    this.height = a;
    this.width = l;
    this.Point = o;
    
  }

  public float calcularArea() {
    return this.height * this.width;
  }

  // Se os dois retângulos tiverem o mesmo Point, retorna true
  public boolean temInterseccao(Rectangle r) {
    return r.Point.getX() == this.Point.getX() && r.Point.getY() == this.Point.getY();
  }
}