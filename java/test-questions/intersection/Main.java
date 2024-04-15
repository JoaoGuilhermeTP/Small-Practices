import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {

    ArrayList<Retangulo>
    lista = new ArrayList<Retangulo>();
    
    lista.add(new Retangulo(10.5f, 20f));
    lista.add(new Retangulo());
    lista.add(new Retangulo(5f, 15f, new Ponto(5f, 2f)));
    lista.add(new Retangulo(new Ponto(5f, 2f)));

    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i).calcularArea());
    }

    // Os retângulos de intex 2 e 3 no ArrayList tem o mesmo ponto
    // A linha abaixo retornará true
    System.out.println(lista.get(2).temInterseccao(lista.get(3)));
  }
}