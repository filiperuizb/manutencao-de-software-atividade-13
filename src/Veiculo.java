import java.time.LocalDateTime;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;

    private SeguroVeiculo seguroVeiculo;

    public Veiculo(String placa, String modelo, String cor,
                   SeguroVeiculo seguroVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.seguroVeiculo = seguroVeiculo;
    }

    public void imprimirDados() {
        System.out.println("Veículo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Seguro: " + seguroVeiculo.getDadosSeguroFormatados());
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}
