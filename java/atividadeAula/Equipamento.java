public class Equipamento {
    protected boolean ligado;

    public Equipamento(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public String toString() {
        if (ligado == true) {
            return "Ligado";
        } else {
            return "Desligado";
        }
    }
}