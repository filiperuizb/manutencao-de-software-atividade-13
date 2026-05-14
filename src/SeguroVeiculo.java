public class SeguroVeiculo {

    private String seguradora;
    private String numeroApolice;
    private String telefoneAssistencia;

    public SeguroVeiculo(String seguradora, String numeroApolice, String telefoneAssistencia) {
        this.seguradora = seguradora;
        this.numeroApolice = numeroApolice;
        this.telefoneAssistencia = telefoneAssistencia;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTelefoneAssistencia() {
        return telefoneAssistencia;
    }

    public void setTelefoneAssistencia(String telefoneAssistencia) {
        this.telefoneAssistencia = telefoneAssistencia;
    }

    public String getDadosSeguroFormatados() {
        return seguradora + " | Apólice " + numeroApolice + " | Assistência " + telefoneAssistencia;
    }

}
