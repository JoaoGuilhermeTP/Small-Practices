import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Chamada {
    private GregorianCalendar data;
    private int duracao;

    public Chamada(GregorianCalendar data, int duracao) {
        this.data = data;
        this.duracao = duracao;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        return String.format(
            "Data: %s\nDuração: %d minutos\n", sdf.format(data.getTime()), duracao
        );
    }
}