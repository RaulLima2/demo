package dto;

import domain.Carro;
import domain.Cliente;
import domain.Oficina;

public class CarroDTO {
    private String placa;
    private String cor;
    private Integer ano;
    private Integer anoModelo;
    private String modelo;
    
    private Cliente cliente;
    private Oficina oficina;

    public CarroDTO(Carro carro) {
        this.setPlaca(carro.getPlaca());
        this.setCor(carro.getCor());
        this.setAno(carro.getAno());
        this.setAnoModelo(carro.getAnoModelo());
        this.setModelo(carro.getModelo());
        this.setCliente(carro.getCliente());
        this.setOficina(carro.getOficina());
    }
    // Getter
    public String getPlaca() {
        return this.placa;
    }

    public String getCor() {
        return this.cor;
    }

    public Integer getAno() {
        return this.ano;
    }

    public Integer getAnoModelo() {
        return this.anoModelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Oficina getOficina() {
        return this.oficina;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}
