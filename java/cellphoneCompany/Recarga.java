import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Recarga {
    private GregorianCalendar data;
    private float valor;

    public Recarga(GregorianCalendar data, float valor) {
        this.data = data;
        this.valor = valor;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        return String.format(
            "Data: %s\nValor: R$ %f", sdf.format(data.getTime()), valor
        );
    }
}