import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValorEstendido {

    private BigDecimal valor;

    public ValorEstendido(BigDecimal valor) {
        this.valor = valor;
    }

    public String formatarValor() {
        return "R$ "
                + valor.setScale(2, RoundingMode.HALF_UP)
                .toString()
                .replace(".", ",");
    }

    public Boolean isMaiorQue50() {
        return valor.compareTo(new BigDecimal("50.00")) >= 0;
    }

}
