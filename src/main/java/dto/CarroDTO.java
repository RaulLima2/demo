package dto;

public class CarroDTO {
    private String placa;
    private String cor;
    private Integer ano;
    private Integer anoModelo;
    private String modelo;
    private ClienteDTO cliente;
    private OficinaDTO oficina;

    // Getter
    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public OficinaDTO getOficina() {
        return oficina;
    }
    
    // Setter
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public void setOficina(OficinaDTO oficina) {
        this.oficina = oficina;
    }
}
