public class Retangulo {
  private float altura;
  private float largura;
  private Ponto ponto;

  public Retangulo() {
    this.altura = 0;
    this.largura = 0;
  }

  public Retangulo(float a, float l) {
    this.altura = a;
    this.largura = l;
  }

  public Retangulo(Ponto o) {
    this.ponto = o;
  }

  public Retangulo(float a, float l, Ponto o) {
    this.altura = a;
    this.largura = l;
    this.ponto = o;
    
  }

  public float calcularArea() {
    return this.altura * this.largura;
  }

  // Se os dois retângulos tiverem o mesmo ponto, retorna true
  public boolean temInterseccao(Retangulo r) {
    return r.ponto.getX() == this.ponto.getX() && r.ponto.getY() == this.ponto.getY();
  }
}