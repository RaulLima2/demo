package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;
    private String cor;
    private Integer ano;
    private Integer anoModelo;
    private String modelo;
    private Cliente cliente;
    private Oficina oficina;

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

    public Cliente getCliente() {
        return cliente;
    }

    public Oficina getOficina() {
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

}
