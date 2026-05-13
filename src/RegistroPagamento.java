import java.math.BigDecimal;
import java.math.RoundingMode;

public class RegistroPagamento {

    private TicketEstacionamento ticket;
    private Cliente cliente;
    private ValorEstendido valor;

    public RegistroPagamento(TicketEstacionamento ticket, Cliente cliente, BigDecimal valor) {
        this.ticket = ticket;
        this.cliente = cliente;
        this.valor = new ValorEstendido(valor);
    }

    public void imprimirComprovante() {

        String valorFormatado = valor.formatarValor();

        System.out.println("Pagamento do ticket: " + ticket.getCodigo());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor: " + valorFormatado);

        if (valor.isMaiorQue50()) {
            System.out.println("Classificação: pagamento de alto valor");
        } else {
            System.out.println("Classificação: pagamento comum");
        }
    }

    public TicketEstacionamento getTicket() {
        return ticket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ValorEstendido getValor() {
        return valor;
    }
}
